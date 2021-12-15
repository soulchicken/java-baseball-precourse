package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;

public class PrintUI {
    public static ArrayList<Integer> InputThreeNum() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        String[] inputNumbers = input.split("");
        ArrayList<Integer> threeNum = new ArrayList<>();
        for (String i : inputNumbers) {
            threeNum.add(Integer.parseInt(i));
        }
        return threeNum;
    }
}
