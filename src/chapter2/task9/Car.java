package chapter2.task9;
/*Реализуйте класс Саг, моделирующий передвижение автомобиля на бензиновом топливе по оси х.
 Предоставьте методы для
  передвижения автомобиля на заданное количество километров,
  заполнения топливного бака заданным количеством литров бензина,
   вычисления расстояния, пройденного от начала координат,
 а также уровня топлива в баке.

 Укажите расход топлива (в км/л) в качестве параметра конструктора данного класса.
 Должен ли этот класс быть неизменяемым и почему?*/

public class Car {
    private double petrol;
    private double kilometers;
    private double petrolConsumption;

//    public Car() {
//        petrol = 0;
//        kilometers = 0;
//        petrolConsumption = 0;
//    }

    public Car(double fuelConsumption) {
        this.petrolConsumption = fuelConsumption;
    }

    //обработать ситуацию с отрицательным топливом
    //если petrolConsumption * kilometers получается больше текущего топлива, проехать сколько возможно и выбросить исключение
    //с сообщением по поводу пустого бака
    public void carMovement(double kilometers) {
        this.kilometers += kilometers;
        this.petrol -= petrolConsumption * kilometers;
    }

    public void addPetrol(double petrol){
       this.petrol += petrol;
    }

    public double getDistance() {
        return kilometers;
    }

    public double petrolLevel () {
        return petrol;
    }

    @Override
    public String toString() {
        return "Car{" +
                "petrol=" + petrol +
                ", kilometers=" + kilometers +
                ", petrolConsumption=" + petrolConsumption +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car(0.1);
        car.addPetrol(10);
        car.carMovement(120);
        System.out.println(car);
    }

}
