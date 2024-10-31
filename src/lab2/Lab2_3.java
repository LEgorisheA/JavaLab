package lab2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_3 {
    public static void main(String[] args) {
        double A = 0, B = 0, E = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Double>> argsFunctions = new ArrayList<>();
        ArrayList<Double> adding = new ArrayList<>();
        System.out.printf("Введите нижнюю и верхнюю границы: ");
        if (sc.hasNextDouble()) A = sc.nextDouble();
        if (sc.hasNextDouble()) B = sc.nextDouble();
        if (A < 0 || B < 0) {
            System.out.println("Вы ввели недопустимое значение. Границы должны быть положительными.");
            System.exit(0);
        }
        System.out.printf("\nВведите шаг: ");
        for (int i = 0; i < 4; i++) argsFunctions.add (new ArrayList<Double>());
        if (sc.hasNextDouble()) E = sc.nextDouble();
        for (double j = A; j <= B; j += E) {
            argsFunctions.get(0).add(j);
        }
        for (double arg: argsFunctions.get(0)) {
            argsFunctions.get(1).add(Math.pow(arg, 2) - arg * 10 + 15);
            argsFunctions.get(2).add(2 * Math.sin(arg + Math.PI / 3));
            argsFunctions.get(3).add(Math.pow(Math.E, Math.pow(arg, 0.5)));
        }
        for (int k = 0; k < argsFunctions.size(); k++) {
            if (k == 0) System.out.printf("%20s", "X");
            else System.out.printf("%20s%d", "Y", k);
        }
        System.out.println();
        for (int j = 0; j < argsFunctions.get(0).size(); j++) {
            for (int i = 0; i < 4; i++) {
                System.out.printf("%20f", argsFunctions.get(i).get(j));
            }
            System.out.println();
        }
    }
}
