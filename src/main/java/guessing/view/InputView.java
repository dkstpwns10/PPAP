package guessing.view;

import java.util.Scanner;
import static guessing.domain.Announce.*;

public class InputView {

    private final Scanner sc = new Scanner(System.in);

    public int readNumber() {
        INPUT_NUMBER_MESSAGE.execute();
        return Integer.parseInt(sc.nextLine());
    }

    public boolean reTry() {
        while (true) {
            String retry = sc.nextLine().toUpperCase();
            if (retry.equals("Y")) {
                return true;
            } else if (retry.equals("N")) {
                return false;
            }
            INPUT_RETRY_ERROR.execute();
        }
    }
}
