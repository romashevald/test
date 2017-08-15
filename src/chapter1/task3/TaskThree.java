package chapter1.task3;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Scanner;

/*Напишите программу, вводящую три целочисленных значения и выводящую
самое большое из них, используя только условную операцию.
 Сделайте то же самое с помощью метода M a t h .ш ах ().*/
public class TaskThree {



    public static int compareWithConditions(int one, int two, int three) {
    //Scanner in = new Scanner(System.in);
    //int one = in.nextInt();
    //int two = in.nextInt();
        //int three = in.nextInt();

        if (one == two && two == three) {
          System.out.println(one);
        }

        if ((one > two) && (one > three)) {
            System.out.println(one);
        }
        if ((two > one) && (two > three)) {
           System.out.println(two);
        }
        if ((three > one) && (three > two)) {
            System.out.println(three);
            return three;
        }

        if (one == two) {
            System.out.println(one);
            return one;
        }
        if (one == three) {
            System.out.println(three);
        }
        if (two == three) {
            System.out.println(three);

        }
    return 0;
    }


    public static int compareWithMath(int one, int two, int three) {
       /* Scanner in = new Scanner(System.in);
        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();*/

        int max1 = Math.max(one, two);
        int max2 = Math.max(two, three);
        int max3 = Math.max(max1, max2);
        System.out.println(max3);
        return max3;
    }


    public static void main(String[] args) {
        System.out.println("Введите 3 числа");
        compareWithConditions(1,2,3);
        System.out.println("Введите еще раз 3 числа");
        compareWithMath(1,2,3);
    }

}
