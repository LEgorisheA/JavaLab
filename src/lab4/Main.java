package lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String lastname = new String();
        String bookName = new String();
        String author = new String();
        int day = 0;
        int month = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите фамилию студента:");
        if (scan.hasNext()) lastname = scan.next();
        System.out.println("Введите название книги, которую студент взял в библиотеке:");
        if (scan.hasNext()) bookName = scan.next();
        System.out.println("Введите автора этой книги:");
        if (scan.hasNext()) author = scan.next();
        System.out.println("Введите номер месяца и число, когда студент должен сдать книгую:");
        if (scan.hasNextInt()) month = scan.nextInt();
        else {
            System.out.println("Вы ввели не число.");
            System.exit(0);
        }
        if (scan.hasNextInt()) day = scan.nextInt();
        else {
            System.out.println("Вы ввели не число.");
            System.exit(0);
        }
        Book firstBook = new Book("'" + bookName + "'", author, new Date(2024, month, day));
        Student Petrov = new Student(lastname, new ArrayList<>(Arrays.asList(firstBook)));

        System.out.println("Введите фамилию второго студента:");
        if (scan.hasNext()) lastname = scan.next();
        System.out.println("Введите название книги, которую студент взял в библиотеке:");
        if (scan.hasNext()) bookName = scan.next();
        System.out.println("Введите автора этой книги:");
        if (scan.hasNext()) author = scan.next();
        System.out.println("Введите номер месяца и число, когда студент должен сдать книгую:");
        if (scan.hasNextInt()) month = scan.nextInt();
        else {
            System.out.println("Вы ввели не число.");
            System.exit(0);
        }
        if (scan.hasNextInt()) day = scan.nextInt();
        else {
            System.out.println("Вы ввели не число.");
            System.exit(0);
        }

        Book secondBook = new Book("'" + bookName + "'", author, new Date(2024, month, day));
        Student Vasechkin = new Student(lastname, new ArrayList<>(Arrays.asList(secondBook)));

        System.out.println("Введите номер месяца и число, когда студенты сдают книги:");
        if (scan.hasNextInt()) month = scan.nextInt();
        else {
            System.out.println("Вы ввели не число.");
            System.exit(0);
        }
        if (scan.hasNextInt()) day = scan.nextInt();
        else {
            System.out.println("Вы ввели не число.");
            System.exit(0);
        }

        boolean nothing = true;
        for (Book vBook: Vasechkin.getBooks()) {
            if (!(vBook.isExpired(new Date(2024, month, day)))) {
                System.out.println("Студент с фамилией " + Vasechkin + " сдал вовремя книгу " + vBook + "");
                nothing = false;
            }
        }
        for (Book vBook: Petrov.getBooks()) {
            if (!(vBook.isExpired(new Date(2024, month, day)))) {
                System.out.println("Студент с фамилией " + Petrov + " сдал вовремя книгу " + vBook + "");
                nothing = false;
            }
        }
        if (nothing) {
            System.out.println("Никто не сдал книги вовремя.");
        }
    }
}
