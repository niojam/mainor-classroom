package ee.mainor.classroom.repository;

import ee.mainor.classroom.model.GuessingGame;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface GuessingGameRepository extends JpaRepository<GuessingGame, Long> {
    List<GuessingGame> findAllByCorrectNumber(Integer correctNumber);

}
