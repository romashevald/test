import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by TTT on 26.07.2017.
 */
/*Напишите программу, вычисляющую факториал п ! = 1 х 2 * . . . х п,
используя класс Biglnteger. Вычислите факториал числа 1000*/
/*Biglnteger г = Biglnteger.valueOf(5).multiply(n.add(k));
// что равнозначно операции г = 5 * (n + k)
*/
public class TaskSix {

    public static BigInteger factorial(int n) {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Ввести n");
        Scanner in = new Scanner(System.in);
        int numbersOfElements = in.nextInt();
        System.out.println(factorial(numbersOfElements).toString());
    }
}
