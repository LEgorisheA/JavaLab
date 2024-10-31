package Lab6;

import javax.lang.model.type.NullType;
import java.io.IOException;
import java.util.*;

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
            System.out.println("Произошла ошибка при создании эекземпляра класса класса");
        }

        for (Schoolchild schoolchild: schoolchildren) {
            for (Olympiad ol: schoolchild.getOlympiads()) {
                if (ol.getPlace() == PrizePlace.WINNER && schoolchild.getSex() == Sex.FEMALE) {
                    System.out.println("Ученица " + schoolchild.getName() + " заняла первое место в олимпиаде "
                            + ol.getName() + ".");
                }
            }
        }
        for (Student stud: students) {
            for (Map.Entry<String, Integer> coursework: stud.getCourseworkGrades().entrySet()) {
                System.out.println("Студент с именем " + stud.getName() + " получил оценку " + coursework.getValue() +
                        " за курсовую работу '" + coursework.getKey() + "'.");
            }
        }
        for (Learner learner: learners) {
            if (learner.checkGrant()) {
                System.out.println("Ученик с именем " + learner.getName() + " должен получать специальную премию.");
            }
        }
    }
}
