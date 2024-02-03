import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * 14. Напишите не возвращающий метод который в параметры берет
 * массив из рандомных чисел от 1 до 50 и выводит в консоль только
 * те числа что больше 20.
 * */

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Write array length: ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = random.nextInt(1, 50);
        }

        getNumbers(numbers);
    }

    public static void getNumbers(int[] numbersArray) {
        String newNumbers = "";
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] > 20) {
                newNumbers += numbersArray.length - 1 == i ? numbersArray[i] : numbersArray[i] + ", ";
            }
        }
        System.out.println(Arrays.toString(numbersArray));
        System.out.println("Числа больше 20: " + newNumbers);
    }
}
