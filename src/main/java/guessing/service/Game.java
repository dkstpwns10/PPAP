package guessing.service;

import guessing.controller.GameController;
import guessing.domain.GameRound;
import guessing.domain.Player;

import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    GameController gameController = new GameController();


    public void run() {
        while (gameController.play(new GameRound())) {

        }
    }


}
