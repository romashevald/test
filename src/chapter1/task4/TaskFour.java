package chapter1.task4;

/**
 * Created by TTT on 25.07.2017.
 */
/*Напишите программу, выводящую наименьшее и наибольшее положительные значения типа double.
     Подсказка: воспользуйтесь методом Math.nextUp () из прикладного программного интерфейса Java API*/

public class TaskFour {
    public static  void nextUp()
    {
        double x = 98.157;
        double y = 98.157;
        double max = Math.max(x,y);
        double min = Math.min(x,y);
        System.out.print("Max.nextUP " + Math.nextUp(max));
        System.out.println("");
        System.out.print("Min.nextUP " + Math.nextUp(min));
    }

    public static void main(String[] args) {
    nextUp();
    }
}
