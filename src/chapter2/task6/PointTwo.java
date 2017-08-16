package chapter2.task6;

import chapter2.task5.Point;

/*Повторите предыдущее упражнение, но на этот раз сделайте методы translate() и scale() модифицирующими.
*/
public class PointTwo {

    private double x, y;

    private PointTwo(double one, double two) {
        this.x = one;
        this.y = two;
    }

    public void Point() {
        x = 0.0;
        y = 0.0;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    private PointTwo translate(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
        return new PointTwo(x,y);
    }

    public PointTwo scale(double Coff) {
        this.x *= Coff;
        this.y *= Coff;
        return new PointTwo(x,y);
    }

    @Override
    public String toString() {
        return ("(" + x + ";" + y + ")");
    }

    public static void main(String[] args) {
        //в переменной р должна быть установлена точка с координатами (2, 3,5).*/
        PointTwo p = new PointTwo(3,4).translate(1,3).scale(0.5);
        System.out.println(p);
    }
}
