package baseball;

import java.util.ArrayList;

public class Utils {
    public static ArrayList<Integer> threeNum;

    public static void PlayGame() {
        for (int i = 0; i < 3; i ++) { // while 문으로 바뀔 예정
            PrintUI.InputNum();
        }
    }

    public static void MakeArrayList(String input) {
        String[] inputNumbers = input.split("");
        CheckOverlapNumber(inputNumbers);
        for (String i : inputNumbers) {
            threeNum.add(Integer.parseInt(i));
        }
    }

    public static void CheckOverlapNumber(String[] inputNumbers) {
        boolean flag = true;
        if (inputNumbers[0] != inputNumbers[1]) {
            flag = false;
        }
        if (inputNumbers[1] != inputNumbers[2]) {
            flag = false;
        }
        if (inputNumbers[0] != inputNumbers[2]) {
            flag = false;
        }
        if (!flag) {
            Except.GameInputNumberExcept();
        }
    }

}
