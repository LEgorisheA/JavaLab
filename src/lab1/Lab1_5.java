package lab1;

import java.util.Scanner;

public class Lab1_5 {
    public static void main(String[] args) {
        int N = 0, M = 0, count_num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите N и M: ");
        if (sc.hasNextInt())
            N = sc.nextInt();
        if (sc.hasNextInt())
            M = sc.nextInt();
        if (N < 0 || M < 0) {
            System.out.println("Вы ввели недопустимое значение. Оно не может быть отрицательным.");
            System.exit(0);
        }
        for (int i = N; i <= M; i++) {
            int firstSum = (int)(i / 1000);
            int secondSum = (int)(i % 1000);
            firstSum = (int)(firstSum / 100) + (int)(firstSum / 10 % 10) + firstSum % 10;
            secondSum = (int)(secondSum / 100) + (int)(secondSum / 10 % 10) + secondSum % 10;
            if (secondSum == firstSum) {
                count_num++;
            }
        }
        System.out.println("Счастливых билетов " + count_num);
    }
}
