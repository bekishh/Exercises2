import java.util.Scanner;

/***
 * 8. На спектакль в кассу театра было выделено определенное
 * количество билетов, и продажа осуществлялась до тех пор, пока не
 * были проданы все билеты.
 * Напишите класс, который сначала принимает с клавиатуры
 * количество билетов, переданных в кассу. Затем класс принимает с
 * клавиатуры серию чисел, каждое из которых указывает на число
 * билетов, которое желает приобрести покупатель.
 * Если нет возможности продать очередному покупателю требуемое
 * им число билетов, принимается заказ от следующего покупателя.
 * Класс должен вывести в консоль:
 * ● Какое число покупателей приобрели билеты
 * ● Какому числу покупателей было отказано в продаже билетов
 * */

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество билетов: ");
        int ticketsNumber = scanner.nextInt();

        int number;
        int buyers = 0;
        int refusals = 0;

        while (ticketsNumber > 0) {
            System.out.println("Сколько билетов вы хотите приобрести?");
            number = scanner.nextInt();

            if (ticketsNumber >= number) {
                ticketsNumber -= number;
                buyers++;
            } else {
                refusals++;
            }
        }
        System.out.println("Количество приобретших билеты: " + buyers);
        System.out.println("Количество получивших отказ: " + refusals);
    }
}
