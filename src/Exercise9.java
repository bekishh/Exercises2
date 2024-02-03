import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * 9. Напишите класс, который заполняет случайными
 * четырехзначными числами массив, размер которого вводится с
 * клавиатуры.
 * После заполнения класс должен вывести на экран значения
 * массива в одной строке, начиная с конца массива ( с последнего
 * индекса).
 * */

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива: ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000, 10000);
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println("Перевернутый массив: ");
        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = numbers[numbers.length - 1 - i];
        }

        System.out.println(Arrays.toString(reversedNumbers));
    }
}
