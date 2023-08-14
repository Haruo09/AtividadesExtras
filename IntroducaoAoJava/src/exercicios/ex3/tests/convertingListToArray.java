package exercicios.ex3.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertingListToArray {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        for (int i = 1; i <= 7; i += 2) {
            numberList.add(i);
        }

        System.out.println(numberList);

        Integer[] numberArr = numberList.toArray(new Integer[0]);

        for (int i : numberArr) {
            System.out.println(i);
        }

        Integer[] nArr = new Integer[]{1, 3, 5, 7};

        System.out.println(Arrays.equals(nArr, numberArr));
    }
}
