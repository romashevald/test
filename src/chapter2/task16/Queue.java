package chapter2.task16;

/*Реализуйте в классе Queue неограниченную очередь символьных строк.
Предоставьте метод add () для ввода элемента в хвост очереди и метод remove () для удаления элемента из головы очереди.
Организуйте хранение элементов в виде связного списка узлов, создав вложенный класс Node.
Должен ли этот класс быть статическим?*/

public class Queue {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void add(String str) {
        Node node = new Node();
        node.setContent(str);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public String remove() {
        if (size == 0) {
            return null;
        }
        String obj = head.getContent();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return obj;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

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


    //TODO: написать метод расчета размера очереди без использования size
    public int getSizeCounting() {
        Node iterator = head;
        int count = 0;
        if (iterator!= null) {
            count++;
            while (iterator.getNext() != null) {
                count++;
                iterator = iterator.getNext();
            }
        } else {
            return 0;
        }
        return count;
    }
}