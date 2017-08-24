package chapter2.task16;

/**
 * Created by nkurtushin on 24.08.2017.
 */
public class App {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.remove());
//
//        for (int i = 0; i < 10; i++) {
//            // В данном случае мы складываем в очередь строки
//            queue.add("Строка:" + i);
//        }
//
//        while (queue.size() > 0) {
//            // Мы делаем жесткое приведение типа, т.к. знаем, что там лежат строки
//            String s = queue.remove();
//            System.out.print(s + " ");
//        }
    }
}
