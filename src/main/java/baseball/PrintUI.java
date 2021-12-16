package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.Objects;

public class PrintUI {
    public static void InputNum() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        CheckValidNum(input);
    }

    public static void CheckValidNum(String inputNumbers) {
        if (inputNumbers.length() != 3) {
            Except.GameInputNumberExcept();
        }
        if ((!inputNumbers.matches("[0-9]+"))) {
            Except.GameInputNumberExcept();
        }
        if (inputNumbers.length() == 3 && inputNumbers.matches("[0-9]+")) {
            Utils.MakeArrayList(inputNumbers);
        }
    }

    public static void JudgeBallCount(int strike, int ball) {
        if (ball == 0 && strike == 0) {
            System.out.println("낫싱");
        }
        if (ball == 0 && strike != 0) {
            System.out.println(strike + "스트라이크");
        }
        if (strike == 0 && ball != 0) {
            System.out.println(ball + "볼");
        }
        if (ball * strike != 0) {
            System.out.println(ball + "볼 " + strike + "스트라이크");
        }
    }

    public static boolean RestartOrEndGame() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String answer = Console.readLine();
        if (Objects.equals(answer, "1")) {
            return true;
        }
        if (!answer.equals("1") && !answer.equals("2")) {
            Except.RestartCommandExcept();
        }
        return false;
    }
}
