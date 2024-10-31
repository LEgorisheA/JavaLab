package lab1;

import java.util.Scanner;

public class Lab1_6 {
    public static void main(String[] args) {
        int s = 0;
        int k_50 = 0, k_100 = 0, k_1000 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму для выдачи.");
        if (sc.hasNextInt())
            s = sc.nextInt();
        if (s < 0) {
            System.out.println("Банкомат не может выдать отрицательное число.");
            System.exit(0);
        }
        while (s >= 50) {
            if (s >= 1000) {
                s -= 1000;
                k_1000++;
            } else if (s >= 100) {
                s -= 100;
                k_100++;
            } else if (s >= 50) {
                s -= 50;
                k_50++;
            }
        }
        if (s != 0) {
            System.out.println("Невозможно выдать сдачу.");
        }
        else {
            System.out.println("Купюры номиналом в 1000 будут выданы в количестве " + k_1000 + " штук.");
            System.out.println("Купюры номиналом в 100 будут выданы в количестве " + k_100 + " штук.");
            System.out.println("Купюры номиналом в 50 будут выданы в количестве " + k_50 + " штук.");
        }
    }
}
