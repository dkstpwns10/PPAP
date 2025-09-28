package guessing.domain;

import guessing.view.InputView;

public class Num {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;

    private final int value;

    public Num(final int value) {
        validateRange(value);
        this.value = value;
    }

    public static Num from(InputView inputView) {
        while (true) {
            try {
                int value = inputView.readNumber();
                return new Num(value);
            } catch (IllegalArgumentException e) {
                Announce.INPUT_NUMBER_ERROR.execute();
            }
        }
    }

    private void validateRange(final int value) {
        if (value < MIN_RANGE || MAX_RANGE < value) {
            throw new IllegalArgumentException(Announce.INPUT_NUMBER_ERROR.toString());
        }
    }

    public int getValue() {
        return value;
    }
}
