
package guessing.domain;

public enum Announce {
    UP("더 높게!"),
    DOWN("더 낮게!"),
    WIN("정답입니다!\n"),
    LOSE("게임 오버!\n"),
    START("숫자 맞추기 게임을 시작합니다!\n"),
    INPUT("숫자를 입력해 주세요: "),
    MORE("한판 더 하시겠습니까?(Y/N)\n"),
    REMAINING_OPPORTUNITY("%d번 만에 맞추셨습니다!\n"),
    CHANCE("(남은 기회 : %d)\n"),
    ANSWER("정답은 %d 였습니다.\n");

    private final String message;

    Announce(String message) {
        this.message = message;
    }

    public void print(Object... num) {
        System.out.printf(this.message, num);
    }

    @Override
    public String toString() {
        return this.message;
    }
}