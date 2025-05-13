package reverseList;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new List<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(reverse(list.get(0)));
    }

    public static Node reverse(Node current) {
        if (current == null || current.next == null) {
            return current;
        } else {
            Node newHead = reverse(current.next);
            current.next.next = current;
            current.next = null;
            return newHead;
        }
    }


    public static class Node<T> {
        Node next;
        T value;

        public Node(T value) {
            this.value = value;
        }
    }

    public static class List<T> {
        public int size;
        public Node first;

        public List() {
            size = 0;
            first = null;
        }

        public void add(T element) {
            if (first == null) {
                first = new Node(element);
                size++;
            } else {
                Node current = first;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new Node(element);
                size++;
            }
        }

        public Node get(int position) throws IndexOutOfBoundsException {
            if (position > size || position < 0) {
                throw new IndexOutOfBoundsException("Зашли за массив");
            }
            Node current = first;
            for (int i = 0; i < position; i++) {
                current = current.next;
            }
            return current;
        }
    }
}