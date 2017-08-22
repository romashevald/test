package chapter2.task16;

/*Реализуйте в классе Queue неограниченную очередь символьных строк.
Предоставьте метод add () для ввода элемента в хвост очереди и метод remove () для удаления элемента из головы очереди.
Организуйте хранение элементов в виде связного списка узлов, создав вложенный класс Node.
Должен ли этот класс быть статическим?*/

public class Queue {
    private Node head;
    private Node tail;

    public static class Node {
        private String content;
        private Node next;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }
}