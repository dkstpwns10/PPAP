
package guessing.domain;

public enum Announce {
    UP("더 높게!"),
    DOWN("더 낮게!"),
    WIN("정답입니다!\n"),
    LOSE("게임 오버!\n"),
    START("1부터 100까지의 숫자를 맞춰보세요!"),
    INPUT("숫자를 입력해 주세요: "),
    MORE("한판 더 하시겠습니까?(Y/N)\n"),
    REMAINING_OPPORTUNITY("%d번 만에 맞추셨습니다!\n"),
    CHANCE("(남은 기회 : %d)\n"),
    ANSWER("정답은 %d 입니다.\n"),
    AGAIN("Y 또는 N을 입력해주세요.\n"),
    INPUT_ERROR("1에서 100사이의 숫자를 입력해 주세요\n")
    ;

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