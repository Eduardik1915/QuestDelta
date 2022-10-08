package ua.com.javarush.quest.khmelov.questdelta.service;

import ua.com.javarush.quest.khmelov.questdelta.entity.Answer;
import ua.com.javarush.quest.khmelov.questdelta.entity.Question;
import ua.com.javarush.quest.khmelov.questdelta.repository.QuestRepository;

import java.util.List;

public enum QuestionService {

    INSTANCE;

    private final QuestRepository questRepository = new QuestRepository();


    public Question get (int id) {
        return questRepository.get(id);
    }

    public List<Answer> getAnswers(int id) {
        return questRepository.getAnswers(id);
    }
}
