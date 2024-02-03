import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * 29. Напишите возвращающий метод типа boolean, который в
 * качестве параметра принимает наполненный положительными
 * числами массив.
 * Верните значение true, если один из первых 4 элементов в массиве
 * равен 9. Длина массива может быть меньше 4.
 * */

public class Exercise29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Write array length: ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(9, 10);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(getBoolean(numbers));
    }

    public static boolean getBoolean(int[] numbers) {
        int amount = 0;
        for (int i = 0; i < 4; i++) {
            if (numbers[i] == 9) {
                amount++;
            }
        }
        return amount == 4;
    }
}
