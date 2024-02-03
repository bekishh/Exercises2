import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * 12. Создайте не возвращающий метод в параметры которого, вы
 * даете массив из целых чисел и еще целое число n.
 * Метод должен проверить есть ли в массиве число большее или
 * равное n.
 * Если есть такое число вывести в консоль true, в другом случае false!
 * */

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Write array length: ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = random.nextInt(1, 100);
        }

        System.out.println("Write n number: ");
        int n = scanner.nextInt();

        getBoolean(numbers, n);
    }

    public static void getBoolean(int[] numbers, int n) {
        int value = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= n) {
                value++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(value > 0);
    }
}
