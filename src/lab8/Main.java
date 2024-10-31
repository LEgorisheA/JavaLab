package lab8;

import lab7.MyComparators;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rn = new Random();
        System.out.printf("Список: ");
        for (int i = 0; i < 10; i++) numbers.add(rn.nextInt(-10, 10));
        for (int i = 0; i < 10; i++) System.out.printf(numbers.get(i) + ", ");
        System.out.println();
        System.out.println("Максимальный элемент: " + Collections.max(numbers));
        System.out.println("Последний инекс максимального жлемента: " + numbers.lastIndexOf(Collections.max(numbers)));
        System.out.printf("Остортированный список: ");
        Collections.sort(numbers);
        for (int i = 0; i < 10; i++) System.out.printf(numbers.get(i) + ", ");
        System.out.println();
        LinkedList<Double> doubleNumbers = new LinkedList<>();
        System.out.printf("Список: ");
        for (int i = 0; i < 10; i++) doubleNumbers.add(rn.nextDouble(-10, 10));
        System.out.println();
        doubleNumbers.sort(new MyComparators.ReverseComparator());
        System.out.printf("Отсортированный по убыванию список: ");
        for (int i = 0; i < 10; i++) System.out.printf(doubleNumbers.get(i) + ", ");
        doubleNumbers.set((int) doubleNumbers.size() / 2, (doubleNumbers.get(0) + doubleNumbers.get(doubleNumbers.size() - 1)) / 2);
        System.out.printf("Список после вставки: ");
        for (int i = 0; i < 10; i++) doubleNumbers.add(rn.nextDouble(-10, 10));
        System.out.println();
        try {
            System.setIn(new FileInputStream("C:\\Users\\Mi\\IdeaProjects\\study\\src\\lab8\\text.txt"));
        } catch (FileNotFoundException exception) {
            System.out.println("Файл не был найден.");
            System.exit(1);
        }
        HashSet<String> stringListWithoutRepeat = new HashSet<>();
        ArrayList<String> stringList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String word = sc.next().toLowerCase();
            if (word.matches(",")) word = word.substring(0, word.indexOf(",") - 1);
            stringList.add(word);
            stringListWithoutRepeat.add(word);
        }
        System.out.println("На " + (stringList.size() - stringListWithoutRepeat.size()) + " слов больше");
        String needSentence = "collection represents group of objects";
        List<String> needWordsList = Arrays.stream(needSentence.split("[\\s]+")).toList();
        if (stringListWithoutRepeat.containsAll(needWordsList)) {
            System.out.println("Можно составить предложение.");
        }
        else System.out.println("Нельзя составить предложение.");
    }
}
