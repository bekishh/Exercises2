import java.util.Random;

/***
 * 1. Напишите класс, который создает 20 случайных чисел диапазона
 * 1 - 99. Следует вывести в консоль только те числа которые делятся
 * на 1-ое рандомное число без остатка.
 * -Нельзя использовать массив.
 * */

public class Exercise1 {
    public static void main(String[] args) {
        Random random = new Random();

        String favoriteNumbers = "";
        int amount = 0;
        String sum = "";

        int firstRandomNumber = random.nextInt(1, 100);

        for (int i = 0; i < 19; i++) {
            int randomNumber = random.nextInt(1, 100);
            if (randomNumber % firstRandomNumber == 0) {
                favoriteNumbers += randomNumber + ", ";
                amount++;
            }
            sum += i != 18 ? randomNumber + ", " : randomNumber;
        }

        System.out.println("Все рандомные числа: [" + firstRandomNumber + ", " + sum + "]");

        if (amount != 0) {
            System.out.println("Эти числа делятся на " + firstRandomNumber + " (первое рандомное число) без остатка: " + favoriteNumbers);
        } else {
            System.out.println("Нету чисел которые делятся на " + firstRandomNumber + " (первое рандомное число) без остатка!");
        }
    }
}
