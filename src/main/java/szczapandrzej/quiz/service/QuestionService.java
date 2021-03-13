package szczapandrzej.quiz.service;

import org.springframework.stereotype.Service;
import szczapandrzej.quiz.entities.Question;

@Service
public interface QuestionService {

    public Iterable<Question> findAll();

    public int findAnswerIdCorrect(int questionId);
}
