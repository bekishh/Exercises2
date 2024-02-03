import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * 24. Напишите метод возвращающий тип boolean , который
 * принимает в качестве параметра массив целых чисел и проверяет,
 * являются ли все элементы массива положительными числами.
 * Если все элементы положительные то вернуть true, в других случая
 * вернуть false.
 * */

public class Exercise24 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(-10, 10);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(getBoolean(numbers));
    }

    public static boolean getBoolean(int[] numbers) {
        int falseCounter = 0;
        for (int number : numbers) {
            if (number < 0) {
                falseCounter++;
            }
        }
        if (falseCounter <= 0) {
            return true;
        }
        return false;
    }
}
