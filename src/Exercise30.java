import java.util.Arrays;
import java.util.Random;

/***
 * 30. Напишите возвращающий метод типа boolean, который в
 * качестве параметра принимает наполненный положительными
 * числами массив.
 * Верните значение true, если в массиве встречаются 3 одинаковых
 * числа подряд, в ином случае false.
 * */

public class Exercise30 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(getBoolean(numbers));
    }

    public static boolean getBoolean(int[] numbers) {
        for (int i = 0; i < numbers.length - 2; i++) {
            if (numbers[i] == numbers[i + 1] && numbers[i] == numbers[i + 2]) {
                return true;
            }
        }
        return false;
    }
}
