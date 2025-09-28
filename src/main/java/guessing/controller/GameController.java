package guessing.controller;

import guessing.domain.Announce;
import guessing.domain.GameRound;
import guessing.domain.Num;
import guessing.view.InputView;

public class GameController {
    InputView inputView = new InputView();

    public boolean play(GameRound gameRound) {
        System.out.println(gameRound.getRandomNumber());

        Announce.START_MESSAGE.startGame(gameRound);

        Announce result;

        while (true) {
            Num num = Num.from(inputView);

            result = gameRound.inGameAnnounce(num.getValue());

            result = result.execute(gameRound);

            if (result.equals(Announce.RETRY_MESSAGE)) {
                return inputView.reTry();
            }

        }
    }
}
