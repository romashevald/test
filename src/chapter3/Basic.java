package chapter3;

/**
 * Created by TTT on 18.10.2017.
 */
public class Basic {

   static double average(Measurable[ ] objects){
        double sum= 0;
        for (int i = 0; i < objects.length; i++) {
            sum+=objects[i].getMeasure();
        }
        return sum/objects.length;
    }

    static Measurable largest(Measurable[] objects){
        int max= 0;
        for (int i = 0; i < objects.length; i++) {
            if(objects[0].getMeasure() < objects[i].getMeasure()){
                max=i;
            } else{
                max=i;
            }
        }
        return objects[max];
    }

   public static void main(String[] args){
        Employee emp = new Employee(120);
        Employee emp1 = new Employee(100);
        Employee emp3 = new Employee(90);
        Employee[] arr = {emp, emp1, emp3};
        double avg = average(arr);
        System.out.println(avg);

       Employee name = new Employee("leha");
       name.setPay(10);
       Employee name1 = new Employee("olegha");
       name1.setPay(546);
       Employee name2 = new Employee("kol'ka");
       name2.setPay(89);
       Employee[] arrName = {name, name1, name2};
       Measurable large = largest(arrName);
    if(large instanceof Employee){
        Employee largeEmp = (Employee)large;
        System.out.println(largeEmp.getNameEmployee());
    }
   }
}
