package ua.com.javarush.quest.khmelov.questdelta.entity;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private final int id;
    private final String text;
    private final List<Answer> answers = new ArrayList<>();

    private boolean lastQuestion;

    public Question(int id, String text, boolean lastQuestion) {
        this.id = id;
        this.text = text;
        this.lastQuestion = lastQuestion;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return this.text;
    }

    public boolean isLastQuestion() {
        return lastQuestion;
    }

    public List<Answer> getAnswers() {
        return this.answers;
    }

    public void setAnswer(Answer answer) {
        answers.add(answer);
    }
}
