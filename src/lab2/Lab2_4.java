package lab2;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab2_4 {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        int[] numbers = new int[20];
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers[i] = (int) (Math.random() * 1000);
        }
        Arrays.sort(numbers);
        for (int num: numbers) {
            System.out.printf(num + " ");
            if (num % 10 == 3) newArray.add(num);
        }
        if (newArray.isEmpty()) {
            System.out.println("\nЧисел, оканчивающихся на цифру 3, нет.");
        } else {
            System.out.println();
            for (int num : newArray) System.out.printf(num + " ");
        }
    }
}
