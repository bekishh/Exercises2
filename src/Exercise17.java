import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * 17. Напишите метод, который принимает в качестве параметра
 * массив целых чисел и число К, число К это индекс в массиве.
 * Нам нужно вывести сумму всех чисел до индекса K массива.
 * */

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Write array length: ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = random.nextInt(1, 50);
        }

        System.out.println("Write index k: ");
        int k = scanner.nextInt();

        System.out.println(Arrays.toString(numbers));
        System.out.println("sum up to index " + k + ": " + getSum(numbers, k));
    }

    public static int getSum(int[] numbers, int k) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i < k) {
                sum += numbers[i];
            }
        }
        return sum;
    }
}
