package onlineexam.interfaces;

public interface Exam {
    void startExam();
    void evaluateScore(int score) throws Exception;
}
