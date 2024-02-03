import java.util.Arrays;
import java.util.Random;

/***
 * 20. Напишите не возвращающий метод который получает в качестве
 * параметра не заполненный массив с размером 15.
 * Нужно массив заполнить положительными случайными
 * двузначными четными числами.
 * И вывести элементы массива в консоль в одну строку через пробел.
 * */

public class Exercise20 {
    public static void main(String[] args) {
        int[] numbers = new int[15];

        System.out.println(Arrays.toString(getArrayValues(numbers)));
    }

    public static int[] getArrayValues(int[] numbers) {
        Random random = new Random();
        int randomNumber;

        for (int i = 0; i < numbers.length; i++) {
            do {
                randomNumber = random.nextInt(10, 100);
            } while (randomNumber % 2 != 0);

            numbers[i] = randomNumber;
        }
        return numbers;
    }
}
