import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * 10. Напишите класс, который заполняет случайными двузначными
 * числами массив, размер которого вводится с клавиатуры.
 * После заполнения класс должен вывести на экран значения
 * массива следующим образом:
 * ● в первой строке - первую половину массива
 * ● во второй строке - вторую половину массива
 * */

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива: ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = random.nextInt(10, 100);
        }

        int[] firstArray = new int[arrayLength / 2];
        int[] secondArray = new int[(arrayLength / 2) + (arrayLength % 2)];

        for (int i = 0; i < arrayLength / 2; i++) {
            firstArray[i] = numbers[i];
        }
        for (int i = 0; i < arrayLength / 2 + arrayLength % 2; i++) {
            secondArray[i] = numbers[i + arrayLength / 2];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Первая половина массива: " + Arrays.toString(firstArray));
        System.out.println("Вторая половина массива: " + Arrays.toString(secondArray));
    }
}
