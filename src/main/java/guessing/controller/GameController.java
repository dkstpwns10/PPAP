package guessing.controller;

import guessing.domain.Announce;
import guessing.domain.GameRound;

import java.util.Scanner;

public class GameController {
    Scanner sc = new Scanner(System.in);

    public boolean play(GameRound gameRound) {
        Announce.START.print();
        Announce.CHANCE.print(gameRound.getCount());
        while (true) {
            Announce.INPUT.print();

            int input = Integer.parseInt(sc.nextLine());

            if (input > 100 || input < 0) {
                Announce.INPUT_ERROR.print();
                continue;
            }

            Announce result = gameRound.inGameAnnounce(input);
            result.print();
            Announce.CHANCE.print(gameRound.getCount());

            if(result == Announce.WIN){
                Announce.REMAINING_OPPORTUNITY.print(gameRound.getTryCount());
                return reTry();
            }
            if(gameRound.isOver()){
                Announce.LOSE.print();
                Announce.ANSWER.print(gameRound.getRandomNumber());
                return reTry();
            }
        }
    }

    public boolean reTry() {
        Announce.MORE.print();
        while (true) {
            String reTry = sc.nextLine().toUpperCase();
            if(reTry.equals("Y")) {
                return true;
            }else if(reTry.equals("N")) {
                return false;
            }
            Announce.AGAIN.print();
        }

    }

}
