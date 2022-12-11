import java.util.Scanner;

public class HomeWork11_3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//        level2:
//        int numberThird = scanner.nextInt();
//        int firstSymbol = numberThird / 100;
//        int secondSymbol = (numberThird / 10) % 10;
//        int thirdSymbol = numberThird % 10;
//        System.out.println("first symbol " + firstSymbol);
//        System.out.println("second symbol " + secondSymbol);
//        System.out.println("third symbol " + thirdSymbol);
    int numberThird = getNumberFromConsoleC();
    firstSymbol(numberThird);
    secondSymbol(numberThird);
    thirdSymbol(numberThird);

}



    public static int getNumberFromConsoleC() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static int firstSymbol(int r) {
        int firstSymbol = r / 100;
        System.out.println("first symbol " + firstSymbol);
        return firstSymbol;
    }

    public static int secondSymbol(int r) {
        int secondSymbol = (r / 10) % 10;
        System.out.println("second symbol " + secondSymbol);
        return secondSymbol;
    }

    public static int thirdSymbol(int r) {
        int thirdSymbol = r % 10;
        System.out.println("third symbol " + thirdSymbol);
        return thirdSymbol;
    }


}
