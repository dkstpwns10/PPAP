package guessing.domain;

import java.util.concurrent.ThreadLocalRandom;

public class GameRound {
    private int count = 7;
    private int tryCount = 1;
    private final int randomNumber;

    public GameRound(){
        this.randomNumber = ThreadLocalRandom.current().nextInt(1,101);
    }

    public Announce inGameAnnounce(int input){

        count--;

        if (randomNumber == input) {
            return Announce.WIN;
        } else if (randomNumber < input) {
            tryCount++;
            return Announce.DOWN;
        } else {
            tryCount++;
            return Announce.UP;
        }

    }
    public boolean isOver() {
        return count <= 0;
    }
    public int getCount() { return count; }
    public int getTryCount() { return tryCount; }
    public int getRandomNumber() { return randomNumber; }
}
