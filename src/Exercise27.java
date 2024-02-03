import java.util.Scanner;

/***
 * 27. Напишите возвращающий метод типа String, который в качестве
 * параметра берет String word и целое положительное число n.
 * Нужно создать такой String в котором word будет повторяться n раз,
 * и в конце надо этот String вернуть.
 * Пример: “Hi”, 4 -> “HiHiHiHi”
 * */

public class Exercise27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write word: ");
        String word = scanner.nextLine();

        System.out.println("Write number n: ");
        int n = scanner.nextInt();

        System.out.println(getNewWord(word, n));
    }

    public static String getNewWord(String word, int n) {
        String newWord = "";
        for (int i = 0; i < n; i++) {
            newWord += word;
        }
        return newWord;
    }
}
