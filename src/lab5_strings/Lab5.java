package lab5_strings;

import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab5 {
    public static String delCaps (String word) {
        return word.replaceAll("[A-Z]", "");
    }

    public static String decodingSentence (String startSentence) {
        StringBuffer result = new StringBuffer("");
        String[] words = startSentence.split("\\s+");
        for (String str: words) result.append(new StringBuffer(" " + str).reverse());
        return result.toString();
    }

    public static int countThree (String startSentence) {
        int counter = 0;
        String[] words = startSentence.split("[,\\s]");
        for (String word: words) if (word.length() == 3) counter++;
        return counter;
    }

    public static int sumNumbers (String startSentence) {
        int sum = 0;
        String[] words = startSentence.split("\\D");
        for (String num: words) if (!num.isEmpty()) sum += Integer.parseInt(num);
        return sum;
    }

    public static ArrayList<String> getSentences (String startText, String keyWord) {
        ArrayList<String> result = new ArrayList<>();
        String[] sentences = startText.split("[.!?]");
        for (String sentence: sentences) if (sentence.contains(" " + keyWord + " ")) result.add(sentence.strip());
        return result;
    }

    public static boolean checkPassword (String password) {
        return 8 <= password.length() && password.length() <= 12 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[@#$%^&*<>.,?!:;].*");
    }

    public static Pair textPrice(String text) {
        int price = 0;
        text = text.replaceAll(".*,.*", " comma");
        for(String str: text.split("\\s+")) if (str.length() > 2) price += 10;
        return new Pair(price, text);
    }
}
