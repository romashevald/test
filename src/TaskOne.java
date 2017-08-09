import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by TTT on 21.07.2017.
 */
/*
1 Напишите программу, вводящую целочисленное значение и выводящую его в двоичной, восьмеричной и шестнадцатеричной форме.
 Организуйте вывод обратного значения в виде шестнадцатеричного числа с плавающей точкой.
* */
public class TaskOne {

    public String transfer(int number, int radix) {
        return Integer.toString(number, radix);
    }

    public static void transfer() {
        Scanner in = new Scanner(System.in);
        int intValue = in.nextInt();
        //   System.out.format(" ", intValue );
        if (intValue > 0) {
            System.out.println("Двоичная");
            System.out.println(Integer.toString(intValue, 2));
            System.out.println("Восьмеричная");
            System.out.println(Integer.toString(intValue, 8));
            System.out.println("Шестнадцатеричная");
            System.out.println(Integer.toString(intValue, 16));
        } else {
            System.out.println("err");
        }
    }

    public static void main(String[] args) {
        System.out.println("Ввести число");
        transfer();
    }
}
