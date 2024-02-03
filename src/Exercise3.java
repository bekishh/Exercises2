import java.util.Scanner;

/***
 * 3. Напишите класс, который принимает с консоли для переменной X
 * целое положительное число, а затем дополнительно будет
 * спрашивать ещё числа, эти числа будут должны вычитаться из
 * переменной x, вы будете вводить числа до тех пор пока X не будет
 * отрицательным или равен 0.
 * -используйте while loop
 * */

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое положительное число: ");
        int x = scanner.nextInt();

        while (x > 0) {
            System.out.println("Общая сумма на данный момент: " + x);
            System.out.println("Введите число: ");
            x -= scanner.nextInt();
        }
        if (x <= 0) {
            System.out.println("x <= 0");
        }
    }
}
