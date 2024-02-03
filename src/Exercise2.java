import java.util.Random;

/***
 * 2. Напишите класс, который генерирует 20 рандомных целых чисел
 * из диапазона -50 до +50, и определяет наименьшее число и
 * наибольшее число.
 * -Нельзя использовать массив
 * */

public class Exercise2 {
    public static void main(String[] args) {
        Random random = new Random();

        int maxNumber = 0;
        int minNumber = 0;

        String numbers = "";

        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(-50, 50);
            numbers += i != 19 ? randomNumber + ", " : randomNumber;
            if (randomNumber > maxNumber) {
                maxNumber = randomNumber;
            }
            if (randomNumber < minNumber) {
                minNumber = randomNumber;
            }
        }
        System.out.println("Все рандомные числа: [" + numbers + "]");
        System.out.println("Наименьшее число: " + minNumber);
        System.out.println("Наибольшое число: " + maxNumber);
    }
}
