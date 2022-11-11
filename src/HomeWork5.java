import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        level1:
//        Считывается 2 числа, произвести все арифм. операции с ними
//         (поделить, умножить, сложить, вычесть)
        double numberFirst = scanner.nextInt();
        double numberSecond = scanner.nextInt();
        double sum = numberFirst + numberSecond;
        System.out.println("sum = " + sum);
        double difference = numberFirst - numberSecond;
        System.out.println("difference = " + difference);
        double product = numberFirst * numberSecond;
        System.out.println("product = " + product);
        double division = numberFirst / numberSecond;
        System.out.println("division = " + division);

//        Level2:
//        С консоли вводится трехзначное число. Найдите в нем первую, вторую и третью цифры.
//        Используйте при этом / и (или) %
        int numberThird = scanner.nextInt();
        int firstSymbol = numberThird / 100;
        int secondSymbol = (numberThird / 10) % 10;
        int thirdSymbol = numberThird % 10;
        System.out.println("first symbol " + firstSymbol);
        System.out.println("second symbol " + secondSymbol);
        System.out.println("third symbol "  + thirdSymbol);

    }
}
