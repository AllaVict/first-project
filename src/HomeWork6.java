import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
 //        level1
//        С консоли считывается число. Если это число равно 0 -
//        тогда напишите на экран "ошибок не обнаружено",
//        если число не равно 0, тогда выведите три сообщения "ERROR"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int yourNumber = scanner.nextInt();
        if (yourNumber == 0) {
            System.out.println("ошибок не обнаружено ");
        } else {
            System.out.println("ERROR");
            System.out.println("ERROR");
            System.out.println("ERROR");
        }
//        Level2
//        Мартин играет в рулетку. Он крутит ее два раза.
//        Если в первый раз выпадет 36 И во второй выпадет 17, то он выиграет джекпот.
//        Если в первый раз выпадет 36 ИЛИ во второй раз выпадет 17, то он выиграет маленький приз.
//        Если выпадет НЕ 36 И НЕ 17, то он все проиграет.
//        С консоли считывается два числа, первое число - сколько выпало на рулетке первый раз,
//        второе число - сколько выпало второй раз. Напишите, что выиграет Марин

        System.out.println("Введите первое число - сколько выпало на рулетке: ");
        int FirstNumber = scanner.nextInt();
        System.out.println("Введите второе число - сколько выпало на рулетке: ");
        int SecondNumber = scanner.nextInt();
        if (FirstNumber == 36 && SecondNumber == 17) {
            System.out.println("Твой выигрыш - джекпот ");
        }
        if (FirstNumber == 36 || SecondNumber == 17) {
            System.out.println("Твой выигрыш - маленький приз ");
        }
        if (FirstNumber != 36 && SecondNumber != 17) {
            System.out.println("Все проиграно! ");
        }


    }
}
