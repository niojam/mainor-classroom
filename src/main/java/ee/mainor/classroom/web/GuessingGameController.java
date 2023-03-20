package ee.mainor.classroom.web;

import ee.mainor.classroom.dto.GameCreationRequest;
import ee.mainor.classroom.dto.GameResponse;
import ee.mainor.classroom.repository.GuessingGameRepository;
import ee.mainor.classroom.service.GuessingGameService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/game")
@RequiredArgsConstructor
public class GuessingGameController {

    private final GuessingGameService guessingGameService;

    @PostMapping
    public Long createGuessingGame(@RequestBody GameCreationRequest gameCreationRequest) {
        return guessingGameService.createGuessingGame(gameCreationRequest);
    }

    @GetMapping("/guess/{number}")
    public GameResponse playGame(@RequestParam Long gameId, @PathVariable Integer number) {
        return guessingGameService.playGame(gameId, number);
    }


}
