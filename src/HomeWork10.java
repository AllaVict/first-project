import java.util.Arrays;

public class HomeWork10 {
    public static void main(String[] args) {
//        level1:
//        Создайте массив размером 100 символов, заполните все ячейки значением 10.
//        1 и 99 ячейки заполните значениями, равными 0
        int[] arrayFirst = new int[100];
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = 10;
        }
        System.out.println(Arrays.toString(arrayFirst));
        arrayFirst[0] = 0;
        arrayFirst[99] = 0;
        System.out.println(Arrays.toString(arrayFirst));

//        level2:
//        Создайте массив размером 100 символов, заполните все ячейки согласно такому правилу:
//        1 ячейка - 111, 2ая - 222, 3ая - 333,….
//        11ая - 111, 12ая - 222, 13ая - 333.
//        Найдите сумму значений всех ячеек
        int[] arraySecond = new int[100];
        int a = 111;
        int sumaOfArraySecond = 0 ;
        for (int i = 0; i < arraySecond.length; i++) {
            arraySecond[i] = a * (i % 10 + 1);
            sumaOfArraySecond += arraySecond[i];
        }
        System.out.println(Arrays.toString(arraySecond));
        System.out.println("suma of array Second = " + sumaOfArraySecond);
    }

}
