package baseball;

import camp.nextstep.edu.missionutils.Console;

public class PrintUI {
    public static void InputNum() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        CheckValidNum(input);
        Utils.MakeArrayList(input);
    }

    public static void CheckValidNum(String inputNumbers) {
        if (inputNumbers.length() != 3 || (!inputNumbers.matches("[0-9]+"))) {
            Except.GameInputNumberExcept();
        }
    }
}
