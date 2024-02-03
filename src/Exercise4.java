import java.util.Scanner;

/***
 * 4. Напишите класс, который принимает с клавиатуры две
 * переменный это два числа, пока не будет введено две одинаковых
 * чисел.
 * Класс должен выводить на экран сумму всех первых чисел и сумму
 * всех вторых чисел (не считая чисел, введенных одинаковыми).
 * */

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        int firstNumbersSum = 0;
        int secondNumbersSum = 0;

        do {
            System.out.println("Сумма всех первых чисел: " + firstNumbersSum);
            System.out.println("Сумма всех вторых чисел: " + secondNumbersSum);

            System.out.println("Введите первое число: ");
            firstNumber = scanner.nextInt();
            System.out.println("Введите второе число: ");
            secondNumber = scanner.nextInt();

            firstNumbersSum += firstNumber;
            secondNumbersSum += secondNumber;
        } while (firstNumber != secondNumber);

        System.out.println("Числа одинаковы!");
    }
}
