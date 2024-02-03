import java.util.Random;
import java.util.Scanner;

/***
 * 21. Напишите возвращающий метод типа массива char [], который в
 * качестве параметра берет число n и boolean b.
 * Число n означает количество букв для заполнения, если boolean b
 * будет true, то нужно вернуть char[] массив состоящий из n заглавных
 * букв, если же false то прописными буквами (маленькими).
 * */

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество букв для заполнения: ");
        int n = scanner.nextInt();

        System.out.println("Введите true либо false: ");
        boolean b = scanner.nextBoolean();

        System.out.println(getChars(n, b));
    }
    public static char[] getChars(int n, boolean b) {
        char[] symbolsArray = new char[n];

        for (int i = 0; i < n; i++) {
            char symbol = (char) ('a' + i % 26);
            symbolsArray[i] = b ? Character.toUpperCase(symbol) : Character.toLowerCase(symbol);
        }
        return symbolsArray;
    }
}
