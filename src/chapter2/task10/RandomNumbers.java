package chapter2.task10;
/*Предоставьте в классе RandomNumbers два статических метода типа random Element, получающих произвольный элемент из обычного или списочного массива целочисленных значений.
(Если обычный или списочный массив пуст, должен быть возвращен нуль.)
Почему эти методы нельзя сделать методами экземпляра типа t[] или ArrayList<Integer>?*/
/*public static int getRandomElement(List<Integer> lst)
так же от массива
проверки на Null
на пустоту
и если не налл и не пуст, то в пределах от 0 до размера массива, сгенерить рандом
(ну не включая последнее число)
а то за пределы выйдешь)*/
/*сгенерили индекс
и возвратили элемент по индексу*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
    public static int getRandomElement(List<Integer> lst) {
        if (lst == null || lst.size() == 0) {
            return 0;
        }
        return lst.get(new Random().nextInt(lst.size()));
//            Random generator = new Random();
//            int result = 0;
//            for (int i = 0; i < lst.size(); i++) {
//                generator.nextInt(i);
//            }
//
//            return result;
//        }
    }


    //сделать с массивом
    //


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        //  int first = numbers.get(0);
        //    System.out.println(first);
        System.out.println(getRandomElement(numbers));
    }
}
