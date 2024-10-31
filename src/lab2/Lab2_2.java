package lab2;

public class Lab2_2 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = (int) (Math.random() * 1000);
        }
        for (int num: numbers) {
            System.out.printf(num + " ");
        }
        int max_even = -1;
        for (int num: numbers) {
            if (max_even < num && num % 2 == 0) {
                max_even = num;
            }
        }
        if (max_even < 0) System.out.println("\nЧетных чисел в массиве нет.");
        else System.out.println("\nМаксимальное четное число в массиве: " + max_even);
    }
}
