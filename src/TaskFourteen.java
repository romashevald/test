import java.util.Scanner;
/*Напишите программу, вводящую двумерный массив целочисленных значений
и определяющую, содержится ли в нем магический квадрат (т.е. одинаковая сумма значений во всех строках, столбцах и диагоналях).
Принимая строки вводимых данных, разбивайте их на отдельные целочисленные значения, прекратив этот процесс, когда пользователь введет пустую строку.
Например, на следующие вводимые данные:
16 3 2 13
3 10 11 8
9 6 7 12
4 15 14 1
(Пустая строка) программа должна ответить утвердительно
*/
public class TaskFourteen {

    public boolean magicSquare(int row, int column, Integer[][] inputData) {
        int sumDiagonal = 0;
        int sumRow = 0;
        int sumColumn = 0;
        int standart = 0;

        for (int j = 0; j < column; j++) {
                standart += inputData[0][j];
        }

        for (int i = 0; i < inputData.length; i++) {
            for (int j = 0; j < inputData.length; j++) {
                sumRow += inputData[i][j];
            }
        }
        if(standart==sumRow) { return true; }


        for (int i = 0; i < inputData.length ; i++) {
            for (int j = 0; j < inputData.length; j++) {
                sumColumn += inputData[j][i];
            }
        }
        if(standart==sumColumn) {  return true; }


        for (int i = 0; i < inputData.length ; i++) {
            for (int j = 0; j < inputData.length ; j++) {
                if (i == j) {
                    sumDiagonal += inputData[i][j];
                }
            }
        }

        if(standart==sumDiagonal) {
            System.out.println("Magic");
            return true; }

        if (standart!=sumRow){
            System.out.println("no Magic");
            return false;
        }
        return true;
}

    public static void main(String[] args) {
        TaskFourteen app = new TaskFourteen();
        Scanner input = new Scanner(System.in);
        int row, column;
        Integer[][] inputData;
        row = input.nextInt();
        column = input.nextInt();
        inputData = new Integer[row][column];
        for (int i = 0; i < inputData.length; i++) {
            for (int j = 0; j < inputData[i].length; j++) {
                inputData[i][j] = input.nextInt();
            }
        }
        app.magicSquare(row,column, inputData);
    }
}
