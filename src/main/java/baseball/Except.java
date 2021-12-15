package baseball;

public class Except {
    static void GameInputNumberExcept() {
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] : 숫자를 겹치지 않게 3개 입력해주세요");
            PrintUI.InputNum();
        }
    }
}
