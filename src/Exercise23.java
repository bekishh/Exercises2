import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * 23. Напишите возвращающий метод типа массива int[] который
 * берет в параметр число n, мы внутри метода создадим массив int[]
 * размером n.
 * Нам нужно сгенерировать рандомные числа массиву так чтобы
 * каждое следующее число было больше предыдущей.
 * */

public class Exercise23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write array length: ");
        int arrayLength = scanner.nextInt();

        System.out.println(Arrays.toString(getRandomNumbers(arrayLength)));
    }

    public static int[] getRandomNumbers(int n) {
        Random random = new Random();

        int[] numbers = new int[n];

        int maxNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(maxNumber, 999999999);
            if (randomNumber > maxNumber) {
                maxNumber = randomNumber;
            }
            numbers[i] = randomNumber;
        }
        return numbers;
    }
}
