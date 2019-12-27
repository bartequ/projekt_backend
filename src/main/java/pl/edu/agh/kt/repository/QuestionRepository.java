package pl.edu.agh.kt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.agh.kt.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
