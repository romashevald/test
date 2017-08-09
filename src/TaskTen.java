/* Напишите программу, составляющую произвольную символьную строку из
букв и цифр, генерируя произвольное значение типа long и выводя его по основанию 36.*/

import java.util.Random;

public class TaskTen {
    public String randomGenerator(int length) {
        Random rnd = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            long number = rnd.nextLong();
            //System.out.println(number);
            builder.append((char) Math.abs(number % 36));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        TaskTen app = new TaskTen();
        System.out.println(app.randomGenerator(9));
    }
}
