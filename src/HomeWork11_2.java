import java.util.Scanner;

public class HomeWork11_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Взять домашнюю работу за 7 ноября и
//        решить задачу второго уровня в "функциональном" стиле.
//            То есть разбить код на методы
//        Level2:
//        В программу вводится строка из двух букв A и B,
//        замените все буквы A на B, а все B на A.
//        Например ABBA -> BAAB
        replaceSymbolAToSymbolB();


    }

    public static String replaceSymbolAToSymbolB(){
        Scanner scanner = new Scanner(System.in);
        String thirdString = scanner.nextLine();
        thirdString = thirdString.replace('A', 'C');
        thirdString = thirdString.replace('B', 'A');
        thirdString = thirdString.replace('C', 'B');
        System.out.println(thirdString);
        return thirdString;

    }


}