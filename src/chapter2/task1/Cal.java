package chapter2.task1;
/* Измените представленную в этой главе программу вывода календаря таким образом,
 чтобы неделя начиналась с воскресенья.
 Кроме того, организуйте перевод на новую строку в конце предыдущей, но только один раз.*/

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Cal {


    public static void main(String[] args) {
        int month = 8, year = 2017;
        LocalDate date = LocalDate.of(year, month, 1);

        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        DayOfWeek weekday = date.getDayOfWeek();//метод возвращает день недели, на который приходится дата

        int value = date.getDayOfWeek().getValue(); // 1 = Monday, ... 7 = Sunday
        for (int i = 0; i < value; i++)
            System.out.print("    ");


        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);

            if (date.getDayOfWeek().getValue() == 7)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 7)
            System.out.println();

    }
}
