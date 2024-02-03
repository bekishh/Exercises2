import java.util.Arrays;
import java.util.Random;

/***
 * 28. Напишите возвращающий метод типа boolean, который в
 * качестве параметров принимает массив целых чисел.
 * Верните значение true, если последовательность чисел 1, 2, 3 где-то
 * появляется в массиве.
 * */

public class Exercise28 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(getBoolean(numbers));
    }

    public static boolean getBoolean(int[] numbers) {
        String sequence = "";
        for (int i = 0; i < numbers.length; i++) {
            sequence += numbers[i] + ", ";
        }
        return sequence.contains("1, 2, 3");
    }
}
