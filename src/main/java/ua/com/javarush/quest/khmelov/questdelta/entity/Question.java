package ua.com.javarush.quest.khmelov.questdelta.entity;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private final int id;
    private final String text;
    private final List<Answer> answers = new ArrayList<>();

    public Question(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return this.text;
    }

    public List<Answer> getAnswers() {
        return this.answers;
    }

    public void setAnswer(Answer answer) {
        answers.add(answer);
    }
}
