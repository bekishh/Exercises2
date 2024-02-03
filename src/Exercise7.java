import java.util.Scanner;

/***
 * 7. Напишите класс, который принимает с клавиатуры целое число
 * любой длины и строит из него число с обратным порядком цифр.
 * Новое значение следует вывести в консоль.
 * */

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        long number = scanner.nextLong();

        long reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        System.out.println("Число с обратным порядком цифр: " + reversedNumber);
    }
}