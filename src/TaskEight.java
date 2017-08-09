import java.util.ArrayList;

/**
 * Created by TTT on 31.07.2017.
 */
/*Напишите программу, вводящую символьную строку и выводящую все ее непустые подстроки.*/
public class TaskEight {

    public ArrayList<String> readLine(String line) {
        int length = line.length();
        ArrayList<String>  result;
        result = new ArrayList<>();
        for (int i = 0; i < length ; i++) {
            for (int j = i + 1; j < length + 1 ; j++) {
                result.add(line.substring(i,j));
            }
        }

        return result;
    }

    public  static void main(String[] args){
        String names = new String ("asdf");
        TaskEight app = new TaskEight();
         System.out.println(app.readLine(names));

    }
}
