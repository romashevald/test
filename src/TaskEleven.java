/*Напишите программу, вводящую текстовую строку и выводящую все символы,
не представленные в коде ASCII, вместе с их значениями в Юникоде.
*/
public class TaskEleven {

    public String textString(String text){

        for (int i = 0; i < text.length(); i++) {
            int codePoint = text.codePointAt(text.offsetByCodePoints(0, i));
            if (codePoint > 255) {
                System.out.println("are not ASCII " + codePoint);
            }
            else {
                //метод для юникода

                System.out.println("ASCII " + codePoint);
            }

        }
        return  text;
    }

    public  static void main(String[] args) {
        TaskEleven app = new TaskEleven();
        System.out.println(app.textString("®asd@#3#^&%⍹"));
    }
}
