import java.util.Scanner;

/***
 * 22. Напишите возвращающий метод  типа boolean, который в
 * качестве параметра берет заполненный массив именами, и String
 * name.
 * Нам нужно в массиве найти 2-ой параметр name, если мы его
 * нашли и его индекс это четное число то вернуть true, в иных случаях
 * вернуть false.
 * */

public class Exercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Aizhamal", "Aizat", "Ulan", "Mukhammed", "Datka", "Ainazik"};

        System.out.println("Write name: ");
        String name = scanner.nextLine();

        System.out.println(getBoolean(names, name));
    }

    public static boolean getBoolean(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(name)){
                return i % 2 == 0;
            }
        }
        return false;
    }
}
