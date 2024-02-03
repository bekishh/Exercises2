import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * 11. Напишите класс, который заполняет случайными двузначными
 * числами массив, размер которого вводится с клавиатуры.
 * После заполнения класс должен вывести на экран значения
 * массива следующим образом:
 * ● в первой строке – четные значения, содержащиеся в массиве
 * ● во второй строке – нечетные значения, содержащиеся в
 * массиве
 * */

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива: ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = random.nextInt(10, 100);
        }

        int[] evenNumbers = new int[arrayLength];
        int[] oddNumbers = new int[arrayLength];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[evenIndex++] = numbers[i];
            } else {
                oddNumbers[oddIndex++] = numbers[i];
            }
        }

        String evenArray = "";
        String oddArray = "";

        for (int i = 0; i < evenIndex; i++) {
            evenArray += evenIndex - 1 == i ? evenNumbers[i] : evenNumbers[i] + ", ";
        }


        for (int i = 0; i < oddIndex; i++) {
            oddArray += oddIndex - 1 == i ? oddNumbers[i] : oddNumbers[i] + ", ";
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Четные цифры: [" + evenArray + "]");
        System.out.println("Не четные цифры: [" + oddArray + "]");
    }
}
