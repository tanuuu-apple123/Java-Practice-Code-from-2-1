#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main(void) {
    int n, m;
    printf("Enter number of processes (n): ");
    scanf("%d", &n);
    printf("Enter number of resource types (m): ");
    scanf("%d", &m);

    int *Available = malloc(m * sizeof(int));
    int **Allocation = malloc(n * sizeof(int *));
    int **Request = malloc(n * sizeof(int *));
    bool *Finish = malloc(n * sizeof(bool));
    int *finishOrder = malloc(n * sizeof(int));

    for (int i = 0; i < n; ++i) {
        Allocation[i] = malloc(m * sizeof(int));
        Request[i] = malloc(m * sizeof(int));
    }

    printf("Enter Available vector:\n");
    for (int j = 0; j < m; ++j) scanf("%d", &Available[j]);

    printf("Enter Allocation matrix:\n");
    for (int i = 0; i < n; ++i)
        for (int j = 0; j < m; ++j)
            scanf("%d", &Allocation[i][j]);

    printf("Enter Request matrix:\n");
    for (int i = 0; i < n; ++i)
        for (int j = 0; j < m; ++j)
            scanf("%d", &Request[i][j]);

    int *Work = malloc(m * sizeof(int));
    for (int j = 0; j < m; ++j) Work[j] = Available[j];
    for (int i = 0; i < n; ++i) Finish[i] = false;

    int countFinished = 0;
    while (1) {
        bool progressed = false;
        for (int i = 0; i < n; ++i) {
            if (!Finish[i]) {
                bool canSatisfy = true;
                for (int j = 0; j < m; ++j)
                    if (Request[i][j] > Work[j]) {
                        canSatisfy = false;
                        break;
                    }
                if (canSatisfy) {
                    Finish[i] = true;
                    finishOrder[countFinished++] = i;
                    progressed = true;
                    for (int j = 0; j < m; ++j)
                        Work[j] += Allocation[i][j];
                }
            }
        }
        if (!progressed) break;
    }

    bool anyDeadlocked = false;
    printf("\n--- Deadlock Detection Result ---\n");
    for (int i = 0; i < n; ++i)
        if (!Finish[i]) {
            if (!anyDeadlocked) {
                printf("Deadlocked processes: ");
                anyDeadlocked = true;
            }
            printf("P%d ", i);
        }

    if (!anyDeadlocked) {
        printf("No deadlock detected.\n");
        printf("A possible finishing order: ");
        for (int k = 0; k < countFinished; ++k) {
            printf("P%d", finishOrder[k]);
            if (k < countFinished - 1) printf(" -> ");
        }
        printf("\n");
    } else {
        printf("\n");
        if (countFinished > 0) {
            printf("Processes that could finish: ");
            for (int k = 0; k < countFinished; ++k)
                printf("P%d ", finishOrder[k]);
            printf("\n");
        } else printf("No process could finish.\n");
    }

    for (int i = 0; i < n; ++i) {
        free(Allocation[i]);
        free(Request[i]);
    }
    free(Allocation);
    free(Request);
    free(Available);
    free(Work);
    free(Finish);
    free(finishOrder);

    return 0;
}
