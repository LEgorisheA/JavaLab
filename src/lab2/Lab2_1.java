package lab2;

public class Lab2_1 {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = (int) (Math.random() * 1000);
        }
        for (int num: numbers) {
            System.out.printf(num + " ");
        }
        for (int num: numbers) {
            if ((int) (num / 10) == (num % 10 * 10 + (int) (num % 100 / 10))) {
                count++;
                sum += num;
            }
        }
        System.out.println("\nСумма симметричных чисел равна " + sum);
        System.out.println("Количество симметричных чисел равно " + count);
    }
}
