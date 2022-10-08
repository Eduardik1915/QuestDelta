package ua.com.javarush.quest.khmelov.questdelta.repository;

import ua.com.javarush.quest.khmelov.questdelta.entity.Answer;
import ua.com.javarush.quest.khmelov.questdelta.entity.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestRepository {

    private final List<Question> questions = new ArrayList<>();

    public QuestRepository() {
        questions.add(new Question(0, "Ты потерял память. Принять вызов НЛО?", false));
        questions.get(0).setAnswer(new Answer("Принять вызов", 1));
        questions.get(0).setAnswer(new Answer("Отклонить вызов", 4));

        questions.add(new Question(1, "Ты принял вызов. Поднимешься на мостик к капитану?",false));
        questions.get(1).setAnswer(new Answer("Поднятся на мостик", 2));
        questions.get(1).setAnswer(new Answer("Отказатся подниматся на мостик", 5));

        questions.add(new Question(2, "Ты поднялся на мостик. Ты кто?",false));
        questions.get(2).setAnswer(new Answer("Рассказать правду о себе", 3));
        questions.get(2).setAnswer(new Answer("Солгать о себе", 6));

        questions.add(new Question(3, "Тебя вернули домой. Победа!", true));

        questions.add(new Question(4, "Ты отклонил вызов. Поражение!",true));
        questions.add(new Question(5, "Ты не пошёл на переговоры. Поражение!",true));
        questions.add(new Question(6, "Твою ложь разоблачили. Поражение!",true));
    }

    public Question get (int id) {
        return questions.get(id);
    }

    public List<Answer> getAnswers(int id) {
        return questions.get(id).getAnswers();
    }
}
