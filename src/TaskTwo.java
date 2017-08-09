//<editor-fold desc="Description">

/**
 * Created by TTT on 25.07.2017.
 */
/*
Напишите программу, вводящую целочисленное (как положительное, так и отрицательное) значение угла и нормализующую его в пределах от 0 до 359
градусов. Попробуйте сделать это сначала с помощью операции %, а затем метода f lo o r M o d ( ).
* */
public class TaskTwo {
    public int normalizeAngleByMod(int angle) {
        angle %= 360;
        if (angle < 0) {
            return angle += 360;
        }
        return angle;
    }

    public int normalizeByFloorMod(int angle) {
        return Math.floorMod(angle, 360);
    }

    public static void main(String[] args) {
        TaskTwo app = new TaskTwo();
        System.out.println(app.normalizeAngleByMod(3645));
        System.out.println(app.normalizeByFloorMod(3645));
    }
}
//</editor-fold>
