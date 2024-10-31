package lab1;

import java.util.Scanner;


public class Lab1_1 {
    public static void main(String[] args) {
        int year = 0;
        String yearName = "";
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.printf("Введите год: ");
        if (sc.hasNextInt())
            year = sc.nextInt();
        if (year < 0) {
            System.out.println("Год не может быть отрицательным.");
            System.exit(0);
        }
        year = (year - 1996) % 12;
        if (year < 0) year += 12;
        switch (year) {
            case 0:
                yearName = "крысы";
                break;
            case 1:
                yearName = "коровы";
                break;
            case 2:
                yearName = "тигра";
                break;
            case 3:
                yearName = "зайца";
                break;
            case 4:
                yearName = "дракона";
                break;
            case 5:
                yearName = "змеи";
                break;
            case 6:
                yearName = "лошади";
                break;
            case 7:
                yearName = "овцы";
                break;
            case 8:
                yearName = "обезьяны";
                break;
            case 9:
                yearName = "курицы";
                break;
            case 10:
                yearName = "собаки";
                break;
            case 11:
                yearName = "свиньи";
                break;
        }
        System.out.println("Вы ввели год " + yearName);
    }
}