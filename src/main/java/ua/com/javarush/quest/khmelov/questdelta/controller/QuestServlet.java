package ua.com.javarush.quest.khmelov.questdelta.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ua.com.javarush.quest.khmelov.questdelta.entity.Answer;
import ua.com.javarush.quest.khmelov.questdelta.service.QuestionService;

import java.io.IOException;
import java.util.List;

@WebServlet("/quest")
public class QuestServlet extends HttpServlet {

    private final QuestionService questionService = QuestionService.INSTANCE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = getId(req);
        req.setAttribute("question", questionService.get(id));
        List<Answer> answers = questionService.getAnswers(id);
        req.setAttribute("answers", answers);
        RequestDispatcher dispatcher = req.getRequestDispatcher("quest.jsp");
        dispatcher.forward(req, resp);
    }

    private int getId(HttpServletRequest req) {
        return req.getParameter("questId") != null
                ? Integer.parseInt(req.getParameter("questId"))
                : 0;
    }
}
