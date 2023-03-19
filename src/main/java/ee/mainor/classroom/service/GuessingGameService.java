package ee.mainor.classroom.service;

import ee.mainor.classroom.dto.GameCreationRequest;
import ee.mainor.classroom.dto.GameResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class GuessingGameService {

    private final Random random = new Random();
    private Map<Integer, Integer> games = new HashMap<>();

    public Integer createGuessingGame(GameCreationRequest gameCreationRequest) {
        Integer id = random.nextInt();
        games.put(id, gameCreationRequest.getCorrectNumber());
        return id;
    }

    public GameResponse playGame(Integer gameId, Integer number) {
        Integer correctNumber = games.get(gameId);
        GameResponse gameResponse = new GameResponse();

        if (correctNumber > number) {
            gameResponse.setTextResponse("Nr smaller");
        } else if (correctNumber < number) {
            gameResponse.setTextResponse("Nr bigger than correct number");
        }
        else gameResponse.setTextResponse("Congrats");
        return gameResponse;
    }

}
