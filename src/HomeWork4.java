import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        // First level: Level1: Астерикс и Обеликс варили зелье.
        // Зелье будет сварено правильно, если его будут варить больше 5 часов.
        // Астерикс варил его 3 часа, Обеликс в два раза меньше.
        // Получится ли у них сварить зелье? true - если получится, иначе false
        double timeOfAsteriks = 3;
        double timeOfObeliks = timeOfAsteriks/2;
        boolean theyCanCook =  ((timeOfAsteriks + timeOfObeliks) >= 5);
        System.out.println(theyCanCook);

        // Level2: Вводится число. Если оно четное, то выведите true, иначе false
        // Number %  > 0
        //  если остаток от деления 0 – четное - true
        //  если остаток от деления 1 – нечетное - false
        Scanner scanner = new Scanner(System.in); // урок 13
        System.out.println("Введите число ");
//        String numberString = scanner.nextLine();
//       int number = Integer.parseInt (numberString);
//        int oddOrEven = number % 2;
//        System.out.println( oddOrEven == 0);
        int number = scanner.nextInt();
        int oddOrEven = number % 2;
        System.out.println( oddOrEven == 0);
    }
}
