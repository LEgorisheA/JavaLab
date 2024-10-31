package lab1;

import java.util.Scanner;

public class Lab1_4 {
    public static void main(String[] args) {
        int N = 0, M = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите N и M: ");
        if (sc.hasNextInt())
            N = sc.nextInt();
        if (sc.hasNextInt())
            M = sc.nextInt();
        if (M < 0 || N < 0) {
            System.out.println("Вы ввели недопустимое значение для этажа или квартиры");
            System.exit(0);
        }
        int floor = (int)((M + 2) / 3);
        if (floor > N) {
            System.out.println("Вы ввели недопустимое M, такой квартиры нет.");
        }
        System.out.println("Лифт доставит пассажира на этаж номер " + (floor - (floor % 2) + 1) + ".");
    }
}
