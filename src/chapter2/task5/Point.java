package chapter2.task5;

/*Реализуйте неизменяемый класс Point ,  .
Предоставьте его конструктор, чтобы задать конкретную точку;
конструктор без аргументов, чтобы задать точку в начале координат;
а также методы getX(),getY(), translate( ) и scale( ).
В частности, метод translate() должен перемещать
точку на определенное расстояние в направлении координат х и у,
а метод scale() — изменять масштаб по обеим координатам на заданный коэффициент.
Реализуйте эти методы таким образом, чтобы они возвращали новые точки в качестве результата.
Например, в следующей строке кода:
Point р = new Point(3, 4).translate(1, 3).scale(0.5);
в переменной р должна быть установлена точка с координатами (2, 3,5).*/

/* + 7 задание сделано*/

/**
 * Неизменяемый класс Point
 *
 * @author Romasheva Lyubov
 * @version 1
 */
public final class Point {
    /**
     * x-первая координата точки на плоскости
     * y-вторая координата точки на плоскости
     */
    private double x, y;

    /**
     * Перегруженный констурктор класса Point
     *
     * @ one - копия первой координаты
     * @ two - копия второй координаты
     */

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /**
     * Перемещение точки на определенное расстояние в направлении координат х и у
     */
    public Point translate(double deltaX, double deltaY) {
        return new Point(x + deltaX, y + deltaY);
    }

    /**
     * Изменение масштаба по обеим координатам на заданный коэффициент
     *
     * @Coff - коэффициент, изменяющий заданные координаты
     */
    public Point scale(double coff) {
        return new Point(x * coff, y * coff);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        //в переменной р должна быть установлена точка с координатами (2, 3,5).*/
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);
    }
}
