package ee.mainor.classroom.service;

import ee.mainor.classroom.dto.GameCreationRequest;
import ee.mainor.classroom.dto.GameResponse;
import ee.mainor.classroom.model.GuessingGame;
import ee.mainor.classroom.repository.GuessingGameRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class GuessingGameService {

    private final GuessingGameRepository gameRepository;

    public Long createGuessingGame(GameCreationRequest gameCreationRequest) {
        GuessingGame guessingGame = new GuessingGame();
        guessingGame.setCorrectNumber(gameCreationRequest.getCorrectNumber());
        return gameRepository.save(guessingGame).getId();
    }

    public GameResponse playGame(Long gameId, Integer number) {
        GuessingGame guessingGame = gameRepository.findById(gameId)
                .orElseThrow(() -> new EntityNotFoundException("Game with given UUID does not eist"));


        GameResponse gameResponse = new GameResponse();

        if (guessingGame.getCorrectNumber() > number) {
            gameResponse.setTextResponse("Nr smaller");
        } else if (guessingGame.getCorrectNumber() < number) {
            gameResponse.setTextResponse("Nr bigger than correct correct number");
        }
        else gameResponse.setTextResponse("Congrats");
        return gameResponse;
    }

}
