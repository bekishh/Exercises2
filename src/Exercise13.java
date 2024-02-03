import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * 13. Напишите не возвращающий метод, который берет в параметры
 * массив из boolean типа, и выводит в консоль количество true
 * элементов массива.
 * */

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Write array length: ");
        int arrayLength = scanner.nextInt();

        boolean[] booleansArray = new boolean[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            booleansArray[i] = random.nextBoolean();
        }

        getTrueLength(booleansArray);
    }

    public static void getTrueLength(boolean[] array) {
        int trues = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                trues++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Количество true: " + trues);
    }
}
