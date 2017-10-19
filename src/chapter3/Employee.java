package chapter3;
/*Task1 */
/* Предоставьте интерфейс Measurable с методом double getMeasure(), измеряющим объект определенным образом.
 Создайте класс Employee, реализующий интерфейс Measurable.
 Предоставьте метод double average(Measurable[ ] objects), вычисляющий среднюю меру.
 Воспользуйтесь им для расчета средней зарплаты в массиве работников*/


/*Task 2*/
/*
* Продолжите предыдущее упражнение, предоставив метод Measurable largest(Measurable[] objects).
 * Воспользуйтесь им, чтобы выяснить имя работника с самой высокой зарплатой.
 * Зачем требуется приведение типов?
* */
public class Employee implements Measurable {
    private double pay;
    private String nameEmployee;


    public Employee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public Employee(double pay) {
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public double getMeasure() {
        return pay;
    }
}


