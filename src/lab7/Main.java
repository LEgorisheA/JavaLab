package lab7;

import Lab6.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Schoolchild schoolchild1;
        Schoolchild schoolchild2;
        Schoolchild schoolchild3;
        Schoolchild schoolchild4;
        ArrayList<Schoolchild> schoolchildren = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Learner> learners = new ArrayList<>();
        try {
            Student student1 = new Student("Антон", "Иванов", Sex.MALE, 19);
            Student student2 = new Student("Анна", "Иванова", Sex.FEMALE, 20);

            student1.setCourseworkGrade("Курсовая по базам данных", 5);

            schoolchild1 = new Schoolchild("Никита", "Иванов", Sex.MALE, 10, 14, 5, 5, 5, 5);
            schoolchild2 = new Schoolchild("Алина", "Иванова", Sex.FEMALE, 10, 13, 4, 5, 5, 3);
            schoolchild3 = new Schoolchild("Полина", "Иванова", Sex.FEMALE, 10, 15, 5, 5, 5, 3);
            schoolchild4 = new Schoolchild("Карина", "Иванова", Sex.FEMALE, 10, 13, 3, 4, 5, 5);

            schoolchild1.addOlympiads(new Olympiad("Prod-IT", Level.REGIONAL, PrizePlace.PARTICIPANT));
            schoolchild2.addOlympiads(new Olympiad("Prod-IT", Level.REGIONAL, PrizePlace.WINNER));
            schoolchild3.addOlympiads(new Olympiad("Prod-IT", Level.REGIONAL, PrizePlace.PARTICIPANT));

            Collections.addAll(learners, schoolchild1, schoolchild2, schoolchild3, schoolchild4, student1, student2);
            Collections.addAll(schoolchildren, schoolchild1, schoolchild2, schoolchild3, schoolchild4);
            Collections.addAll(students, student1, student2);
        } catch (IOException ioe) {
            System.out.println("Произошла ошибка при создании эекземпляра класса.");
        }
        ArrayList<Learner> excellentGrade = new ArrayList<>();
        for (Learner learner: learners) {
            if (learner.checkGrant()) {
                excellentGrade.add(learner);
            }
        }
        excellentGrade.sort(new MyComparators.LastNameComparator());
        for (Learner learner: excellentGrade) System.out.println(learner.getLastName() + learner.getName());

        students.sort(new MyComparators.StGradeComparator());
        System.out.println("Best student: " + students.get(students.size() - 1).getName() + " "
                + students.get(students.size() - 1).getLastName());
        schoolchildren.sort(new MyComparators.ScGradeComparator());
        System.out.println("Best schoolchild: " + schoolchildren.get(schoolchildren.size() - 1).getName() + " "
                + schoolchildren.get(schoolchildren.size() - 1).getLastName());

        System.out.printf("Schoolchildren (grade -> number of school): ");
        for (Schoolchild schoolchild: schoolchildren) System.out.printf(schoolchild.getName() + " "
                + schoolchild.getLastName() + ", ");
        System.out.println();

        schoolchildren.sort(new MyComparators.SchoolNumberComparator());
        System.out.printf("Schoolchildren (number of school): ");
        for (Schoolchild schoolchild: schoolchildren) System.out.printf(schoolchild.getName() + " "
                + schoolchild.getLastName() + ", ");
        System.out.println();

        System.out.printf("Students (grade): ");
        for (Student student: students) System.out.printf(student.getName() + " "
                + student.getLastName() + ", ");
        System.out.println();

//        ArrayList<Student> students = new ArrayList<>();
//        ArrayList<Schoolchild> schoolchildren = new ArrayList<>();
//        ArrayList<Learner> learners = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        String choice = "";
//        String name = "";
//        String inSex = "";
//        Sex sex = Sex.MALE;
//        Integer age = 0;
//        System.out.println("Кого хотите создать? Ш - школьник, С - студент. Если хотите закончить, введите пустую строку.");
//        if (sc.hasNext()) choice = sc.next();
//        else;
//        System.out.println("Введите имя.");
//        if (sc.hasNext()) name = sc.next();
//        else System.exit(0);
//        System.out.println("Введите пол. М - мужской, Ж - женский");
//        if (sc.hasNext()) inSex = sc.next();
//        if (inSex.equals("М")) sex = Sex.MALE;
//        else if (inSex.equals("Ж")) sex = Sex.FEMALE;
//        else System.exit(0);
//        System.out.println("Введите возраст.");
//        if (sc.hasNextInt()) age = sc.nextInt();
//        else System.exit(0);
//        if (choice.equals("Ш")) {
//            Schoolchild schoolchild = new Schoolchild(name, sex, age);
//            System.out.println("Введите оценку по математике");
//            if (sc.hasNextInt()) schoolchild.setMath(sc.nextInt());
//            else System.exit(0);
//            System.out.println("Введите оценку по истории");
//            if (sc.hasNextInt()) schoolchild.setHistory(sc.nextInt());
//            else System.exit(0);
//            System.out.println("Введите оценку по русскому");
//            if (sc.hasNextInt()) schoolchild.setRuLang(sc.nextInt());
//            else System.exit(0);
//            System.out.println("Введите оценку по английскому");
//            if (sc.hasNextInt()) schoolchild.setEnLang(sc.nextInt());
//            else System.exit(0);
//            System.out.println("Введите название предмета помимо прошлых. Если оценок больше нет, введите пустую строку");
//            while (sc.hasNext()) {
//                name = sc.next();
//                System.out.println("Введите оценку за него.");
//                if (sc.hasNextInt()) {
//                    int ev = sc.nextInt();
//                    schoolchild.setEvaluation(name, ev);
//                }
//                else System.exit(0);
//                System.out.println("Введите название предмета помимо прошлых. Если оценок больше нет, введите пустую строку");
//            }
//            System.out.println("Введите название олимпиады, в которой учавствовал школьник. Если таких нет," +
//                    " введите пустую строку");
//            while (sc.hasNext()) {
//                name = sc.next();
//                System.out.println("Введите уровень олимпиады:\n" +
//                        "Г - городская, Ш - школьная, Р - региональная.");
//                ch
//            }
//        }
    }
}
