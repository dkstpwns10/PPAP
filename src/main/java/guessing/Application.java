package guessing;

import guessing.domain.Announce;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retry:
        while (true) {
            int count = 7;
            int tryCount = 1;
            int randomNumber = (int) (Math.random() * 100) + 1;

            System.out.printf("1부터 100까지의 숫자를 맞춰보세요! (남은 기회 : %d)\n", count);

            Game:
            while (true) {
                if (count <= 0) {
                    Announce.LOSE.print();
                    Announce.ANSWER.print(randomNumber);
                    Announce.MORE.print();

                    String retry = sc.nextLine().toUpperCase();

                    if (retry.equals("Y")) {
                        break Game;
                    } else if (retry.equals("N")) {
                        break Retry;
                    }
                }

                Announce.INPUT.print();

                int input = Integer.parseInt(sc.nextLine());

                if (randomNumber == input) {
                    Announce.WIN.print();
                    Announce.REMAINING_OPPORTUNITY.print(tryCount);

                    break Retry;
                    //TODO : if문 메서드 분리 -> 지윤
                } else if (randomNumber < input) {
                    count--;
                    tryCount++;
                    Announce.DOWN.print();
                    Announce.CHANCE.print(count);
                } else {
                    count--;
                    tryCount++;
                    Announce.UP.print();
                    Announce.CHANCE.print(count);
                }
            }
        }
    }
}
