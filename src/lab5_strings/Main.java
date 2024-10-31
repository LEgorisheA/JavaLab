package lab5_strings;

public class Main {
    public static void main(String[] args) {
        System.out.println(Lab5.delCaps("StRing")); // ting
        System.out.println(Lab5.decodingSentence("тевирП есв .ошорох")); // Привет все хорошо
        System.out.println(Lab5.countThree("awg awf, aeew, aesf segs")); // 2
        System.out.println(Lab5.sumNumbers("awifnwen31nf9yh13a7"));
        for (String sentence: Lab5.getSentences("Welcome to SoftUni! You will learn programming, algorithms, problem\n" +
                "solving and software technologies. You need to allocate for study 20-30 hours\n" +
                "weekly. Good luck!\n" +
                "I am fan of Motorhead. To be or not to be — that is the question. TO DO OR\n" +
                "NOT?\n", "to")) System.out.println(sentence);
        System.out.println(Lab5.checkPassword("Brs200510"));
        System.out.println(Lab5.textPrice("Привет. Ты, случайно, не хотел бы прогуляться сегодня вечером.").getA());
    }
}
