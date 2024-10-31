package lab9;

import com.sun.jdi.InterfaceType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // №1
        // negative temperature
        System.out.println("Количество дней с отрицательной температурой: " + Factory.getTemperature().filter(i -> i < 0).count() + '.');

        // check the 10 degree mark
        if (Factory.getTemperature().anyMatch(i -> i > 10)) {
            System.out.println("Температура достигала отметки выше 10 градусов.");
        } else {
            System.out.println("Температура не достиграла отметки выше 10 градусов.");
        }

        // max temperature
        System.out.println("Максимальная температура за первую неделю марта: " + Factory.getTemperature().limit(7).max(
                (Integer a, Integer b) -> a.compareTo(b)).get());

        // average temperature
        float averageTemperature = (float)Factory.getTemperature().reduce((Integer a, Integer b) -> a + b).get() / Factory.getTemperature().count();
        System.out.println("Средняя температура за месяц: " + averageTemperature + ".");


        // №2
        // count of words who ending on 'es'
        System.out.println("Слов, заканчивающихся на 'es': " + Factory.getWords().filter(s -> s.endsWith("es")).count());

        // sorted words
        List<String> sortedSentence = Factory.getWords().sorted((s1, s2) -> s1.compareTo(s2)).toList();
        for (String word: sortedSentence) {
            System.out.printf(word + ", ");
        }
        System.out.println();

        // count sum integer
        int sum = Factory.getWords().sorted((s1, s2) -> s1.compareTo(s2)).filter(s -> s.matches("[-][0-9]+")).map(
                n -> Integer.parseInt(n)).reduce((a, b) -> a + b).get();
        System.out.println("Сумма всех чисел в предложении: " + sum);
    }
}
