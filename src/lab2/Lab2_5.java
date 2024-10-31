package lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lab2_5 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<String> indexNum = new ArrayList<>();
        int[][] matrix = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = rand.nextInt(-10, 10);
                System.out.printf("|" + matrix[i][j] + "|");
            }
            System.out.println();
        }
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++) {
                boolean loc_min = true;
                if (i != 0) {
                    if (matrix[i - 1][j] < matrix[i][j]) loc_min = false;
                }
                if (j != 0) {
                    if (matrix[i][j - 1] < matrix[i][j]) loc_min = false;
                }
                if (i != 7) {
                    if (matrix[i + 1][j] < matrix[i][j]) loc_min = false;
                }
                if (j != 7) {
                    if (matrix[i][j + 1] < matrix[i][j]) loc_min = false;
                }
                if (loc_min) {
                    indexNum.add("индекс [" + i + "][" + j + "] число " + matrix[i][j]);
                }
            }
        System.out.println("Количество локальных минимумов: "+ indexNum.size());
        System.out.println("Локальные минимумы: ");
        for (String str: indexNum) {
            System.out.println(str);
        }
    }
}
