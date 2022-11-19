import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Level1:
//        1) В программу (в консоль) вводится строка.
//        Найдите длину строки, если она больше 10,
//        то выведите true, иначе false
        String firstString = scanner.nextLine();
        int length = firstString.length();
        if (length > 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

//        2) В программу (в консоль) вводится строка. Если первый и
//        последний символ равны - выведите true, иначе false
        String secondString = scanner.nextLine();
        length = secondString.length();
        if (secondString.charAt(0) == secondString.charAt(length - 1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

//        Level2:
//        В программу вводится строка из двух букв A и B,
//        замените все буквы A на B, а все B на A.
//        Например ABBA -> BAAB

        // String secondStr = scanner.next(); //считывает, илм все, что ДО пробела
        // String newStr = scanner.nextLine(); //считывает всю строку, до символа \n (переноса строки)
        String thirdString = scanner.nextLine();
        thirdString = thirdString.replace('A', 'C');
        thirdString = thirdString.replace('B', 'A');
        thirdString = thirdString.replace('C', 'B');
        System.out.println(thirdString);


    }
}
