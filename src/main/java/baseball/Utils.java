package baseball;

import java.util.ArrayList;

public class Utils {
    public static ArrayList<Integer> threeNum;

    public static ArrayList<Integer> MakeArrayList(String input) {
        String[] inputNumbers = input.split("");
        ArrayList<Integer> threeNum = new ArrayList<>();
        for (String i : inputNumbers) {
            threeNum.add(Integer.parseInt(i));
        }
        return threeNum;
    }
}
