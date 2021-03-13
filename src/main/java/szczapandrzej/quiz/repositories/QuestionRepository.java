package szczapandrzej.quiz.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import szczapandrzej.quiz.entities.Question;

@Repository("questionRepository")
public interface QuestionRepository extends CrudRepository<Question, Integer> {
}