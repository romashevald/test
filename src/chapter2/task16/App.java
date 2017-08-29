package chapter2.task16;


import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        Queue queue = new Queue();
        // System.out.println(queue.remove());
        for (int i = 0; i < 15; i++) {
            // В данном случае мы складываем в очередь строки
            queue.add("Строка:" + i);
        }
//        while (queue.size() > 0) {
//            // Мы делаем жесткое приведение типа, т.к. знаем, что там лежат строки
//            String s = queue.remove();
//            System.out.print(s + " ");\
//        }
//        ArrayList<String> states = new ArrayList<String>();
//        states.add("Германия");
//        states.add("Франция");
//        states.add("Италия");
//        states.add("Испания");

        Queue.Iterator iter = queue.iterator();
        System.out.println(iter.hasNext());
        while (iter.hasNext()) {
            System.out.println(iter.next().getContent());
        }
    }
}
