import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
/*Напишите программу, сохраняющую треугольник Паскаля вплоть до заданной
величины п в переменной типа ArrayList<ArrayList<Integer».
*/
public class TaskFifteen {

    public ArrayList<ArrayList<Integer>> pascalTriangle(int sizeTriangle) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int i = 1; i < sizeTriangle; i++) {
            triangle.add(new ArrayList<>());
            triangle.get(i).add(1);
            for (int j = 1; j < i + 1; j++) {
                if (i == j) {
                    triangle.get(i).add(1);
                } else {
                     triangle.get(i).add(triangle.get(i-1).get(j)+triangle.get(i-1).get(j-1));
                }
            }
        }
        return triangle;
    }

    public void print(ArrayList<ArrayList<Integer>> list)
    {
        for (int i = 0; i < list.size() ; i++) {
            for (int j = 0; j <list.get(i).size() ; j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TaskFifteen app = new TaskFifteen();
        app.print(app.pascalTriangle(5));
    }
}