package additionalTask;
/*Метод!drive()!(едь) должен возвращать!общее!
расстояние! пройденное! автомобилем! за!
заданное! время! Используйте! следующую!
формулу!дла!рассчёта!расстояния:!
distance = howlong*60; */


public class Car {

    public void start(){}

    public void stop(){}

    int distance = 0;
    public int drive(int howlong){
        distance+=howlong*60;
        return distance;
    }

}

