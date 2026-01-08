package onlineexam.implementation;

import onlineexam.interfaces.Exam;
import onlineexam.exceptions.FailException;

public class ExamPortal implements Exam {

    @Override
    public void startExam() {
        System.out.println("Exam Started... Answer all questions.");
    }

    @Override
    public void evaluateScore(int score) throws Exception {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100.");
        }
        if (score < 40) {
            throw new FailException("Fail - Score below passing threshold.");
        }
        System.out.println("Result: Pass - Congratulations!");
    }
}
