import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
//        Level1
//        Дано целое число, не меньшее 2. Выведите его НАИБОЛЬШИЙ делитель
//        (число, на которое введенное число делится без остатка), отличный от самого этого числа.
//        проверка
//        int number1 = 3451;
//        int NumberOfDivisor = 0;
//        int j = 1;
//        while (j < number1) {
//            if (number1 % j == 0) {
//                System.out.println(j);
//                NumberOfDivisor++;
//                System.out.println(NumberOfDivisor);
//            }
//            j++;
//        }
        int number = 3451;
        for (int i = number; i <= number; i--) {
            if (number % i == 0 && i != number) {
                System.out.println(i);
                break;
            }
        }

//        Level2
//        Вклад в банке составляет x рублей. Ежегодно он увеличивается на p процентов, после чего
//        дробная часть копеек отбрасывается. Каждый год сумма вклада становится больше. Определите,
//       сколько будет на счету через k лет.
//       До начала программирования решите эту задачу на бумаге - возьмите p=10, k=2, x = 1000
//        Обе задачи решаются через for
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начальная сума: ");
        int startMoney = scanner.nextInt();
        System.out.println("Проценты банка: ");
        double interest = scanner.nextDouble();
        System.out.println("Крличество лет: ");
        int years = scanner.nextInt();
        int y = 0;
        double currentDeposit = 0;
        currentDeposit += startMoney;
        while (y < years) {
            currentDeposit = currentDeposit + currentDeposit * interest;
            y++;
            System.out.println("Year " + y + " - " + currentDeposit);
        }

    }
}