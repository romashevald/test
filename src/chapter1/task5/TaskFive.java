package chapter1.task5;

/*Что произойдет, если привести числовое значение типа double  ±1.79769313486231570Е+308 к значению типа int = 2147483647,
которое больше самого большого значения типа int? Попробуйте сделать это.

*/
public class TaskFive {
    public static void main(String[] args) {
        double a = 2147483649.5;
        int c = (int) a;
        System.out.println(c);
        //Он его порежет
    }
}
