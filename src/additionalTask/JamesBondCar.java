package additionalTask;

/*Сделайте подкласс класса Car,назовите
его JamesBondCarи переопределите в нем метод drive().
Используйте следующую формулу дла рассчёта расстояния:
distance = howlong*180;
*/

public class JamesBondCar extends Car {
    public int drive(int howlong){
        distance= distance+ (howlong*180);
        System.out.println("distance " + distance);
        return distance;
    }

    public static void main(String[] args) {
        Car car= new Car();
        car.drive(8);
        car.drive(1);
    }

}
///67!!!
