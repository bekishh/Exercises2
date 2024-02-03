import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * 26. Напишите возвращающий метод типа boolean, который в
 * качестве параметра берет массив из положительных чисел.
 * Если в массиве всего 5 чисел равных 2, то вывести true, а в
 * остальных случая false.
 * */

public class Exercise26 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 2);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(getBoolean(numbers));
    }

    public static boolean getBoolean(int[] numbers) {
        int amount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 2) {
                amount++;
            }
        }
        return amount == 5;
    }
}
