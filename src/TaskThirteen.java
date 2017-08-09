/*Напишите программу, выбирающую и выводящую лотерейную комбинацию из шести отдельных чисел в пределах от 1 до 49.
Чтобы выбрать шесть отдельных чисел, начните со списочного массива, заполняемого числами от 1 до 49.
Выберите произвольный индекс и удалите элемент массива.
Повторите эти действия шесть раз подряд.
Выведите полученный результат в отсортированном порядке*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TaskThirteen {

    public List<Integer> getLotteryComp() {

        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 49; i++) {
            numbers.add(i, (int) (Math.random() * 48 + 1));
        }
        System.out.println(numbers);
        ArrayList<Integer> delElem = new ArrayList<>();
        for (int i = 0; i < 6; ++i) {
            int index = rand.nextInt(numbers.size());
            int nexNum = numbers.get(index);
            delElem.add(numbers.remove(index));
        }
        System.out.println("del" + delElem);
        Collections.sort(delElem);
        Collections.sort(numbers);
        System.out.println("num" + numbers);
        return delElem;
    }

    public static void main(String[] args) {
        System.out.println(new TaskThirteen().getLotteryComp());
    }
}
