package szczapandrzej.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import szczapandrzej.quiz.entities.Answer;
import szczapandrzej.quiz.entities.Question;
import szczapandrzej.quiz.repositories.QuestionRepository;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService {


    @Qualifier("questionRepository")
    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Iterable<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public int findAnswerIdCorrect(int questionId)
    {
        Question question = questionRepository.findById(questionId).get();
        for(Answer answer : question.getAnswers())
        {
            if(answer.isCorrect())
            {
                return answer.getId();
            }
        }
        return -1;
    }

}
