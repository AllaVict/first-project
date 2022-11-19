import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        //   First level: Level1:
        //   Вводится число. Напишите на экран сообщение "Я начинаю разбираться с циклами"
        //   количество раз, равное введенному числу
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши число: ");
        int yourNumber = scanner.nextInt();
        int i = 0;
        while (i < yourNumber) {
            i++;
            System.out.println("Я начинаю разбираться с циклами");
        }

        //   Level2:
        //   Вводится строка, выведите первый ее символ на экран количество раз,
        //   равное длине всей строки. Например, строка "привет", значит результат будет такой:
        //  Если строка "Как дела?", то в ней 9 символов, значит ответ будет:
        System.out.println("Напиши текст: ");
        String secondString = scanner.nextLine();
        int lengthOfSecondString = secondString.length();
        int k = 0;
        while (k < lengthOfSecondString) {
            k++;
            System.out.println(secondString.charAt(0));
        }


    }
}
