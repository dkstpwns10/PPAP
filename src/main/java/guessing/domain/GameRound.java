package guessing.domain;

public class GameRound {
    private int count = 7;
    private int tryCount = 1;
    private final int randomNumber;

    public GameRound(){
        this.randomNumber = (int)(Math.random()*100)+1;
    }

    public Announce inGameAnnounce(int input){
        /*if(input >100 || input < 0) {
            Announce.INPUT_ERROR.print();
            continue;
        }*/

        count--;
        tryCount++;

        if (randomNumber == input) {
//            Announce.REMAINING_OPPORTUNITY.print(tryCount);
            return Announce.WIN;
        } else if (randomNumber < input) {
            return Announce.DOWN;
        } else {
            return Announce.UP;
        }

//        Announce.CHANCE.print(count);
        /*if (count <=0) {
            Announce.LOSE.print();
            Announce.ANSWER.print(randomNumber);

            return gameController.reTry();
        }*/
    }
    public boolean isOver() {
        return count <= 0;
    }
    public int getCount() { return count; }
    public int getTryCount() { return tryCount; }
    public int getRandomNumber() { return randomNumber; }
}
