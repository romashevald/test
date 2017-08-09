/*Напишите программу, вводящую два числа в пределах от 0 до 65535,
сохраняющую их в переменных типа short и вычисляющую
их сумму, разность, произведение, частное и остаток без знака, не преобразуя эти величины в тип int*/

public class TaskSeven {

    public void rand() {
        int intRandomNumberOne = (int) (Math.random() * 65535);
        System.out.println("randomNumberOne: " + intRandomNumberOne);
        int intRandomNumberTwo = (int) (Math.random() * 65535);
        System.out.println("randomNumberOne: " + intRandomNumberTwo);
        short shortRandomNumberOne = (short) intRandomNumberOne;
        System.out.println("intRandomNumberOne " + intRandomNumberOne);
        short shortRandomNumberTwo = (short) intRandomNumberTwo;
        System.out.println("intRandomNumberTwo " + intRandomNumberTwo);
        System.out.println("Sum " + (shortRandomNumberOne + shortRandomNumberTwo));
        System.out.println("Dif " + (shortRandomNumberOne - shortRandomNumberTwo));
        System.out.println("Mul" + (shortRandomNumberOne * shortRandomNumberTwo));
        System.out.println("Div" + (shortRandomNumberOne / shortRandomNumberTwo));
        System.out.println("Rem" + (shortRandomNumberOne % shortRandomNumberTwo));
    }

    public static void main(String[] args) {
        TaskSeven app = new TaskSeven();
        app.rand();
    }
}
