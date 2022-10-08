package ua.com.javarush.quest.khmelov.questdelta.entity;

public class Answer {
    private final String text;
    private final int nextQuestion;

    public Answer(String text, int nextQuestion) {
        this.text = text;
        this.nextQuestion = nextQuestion;
    }

    public String getText() {
        return text;
    }

    public int getNextQuestion() {
        return nextQuestion;
    }
}
