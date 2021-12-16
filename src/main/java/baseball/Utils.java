package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class Utils {
    public static ArrayList<Integer> threeNum = new ArrayList<>();
    public static ArrayList<Integer> randomNum = new ArrayList<>();
    static boolean flag = true;
    static int ball;
    static int strike;

    public static void GameOn() {
        while (flag) {
            MakeRandomThreeNum();
            PlayGame();
            ball = 0;
            strike = 0;
            flag = PrintUI.RestartOrEndGame();
        }
    }

    public static void PlayGame() {
        while (strike != 3) {
            PrintUI.InputNum();
            CountBall();
            CountStrike();
            PrintUI.JudgeBallCount(strike, ball);
        }
    }

    private static void MakeRandomThreeNum() {
        int a = Randoms.pickNumberInRange(1, 9);
        System.out.print(a);
        randomNum.add(a);
        for (int i = 1; i < 3; i++) {
            int n;
            while (true){
                n = Randoms.pickNumberInRange(1, 9);
                if (!randomNum.contains(n)) {
                    System.out.print(n);
                    break;
                }
            }
            randomNum.add(n);
        }
        System.out.println();
    }

    public static void MakeArrayList(String input) {
        String[] inputNumbers = input.split("");
        CheckOverlapNumber(inputNumbers);
        ArrayList<Integer> number = new ArrayList<>();
        for (String i : inputNumbers) {
            number.add(Integer.parseInt(i));
        }
        threeNum = number;
    }

    public static void CheckOverlapNumber(String[] inputNumbers) {
        boolean flag = true;
        if (inputNumbers[0].equals(inputNumbers[1])) {
            flag = false;
        }
        if (inputNumbers[1].equals(inputNumbers[2])) {
            flag = false;
        }
        if (inputNumbers[2].equals(inputNumbers[0])) {
            flag = false;
        }
        if (!flag) {
            Except.GameInputNumberExcept();
        }
    }

    public static void CountBall() {
        ball = 0;
        for (int num : randomNum) {
            if (threeNum.contains(num)) {
                ball++;
            }
        }
    }

    public static void CountStrike() {
        strike = 0;
        for (int i = 0; i < 3; i++) {
            if (randomNum.get(i) == threeNum.get(i)) {
                strike++;
            }
        }
        ball -= strike;
    }
}
