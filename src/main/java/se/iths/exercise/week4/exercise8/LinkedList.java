package se.iths.exercise.week4.exercise8;

public class LinkedList {
    private Node head;
    public void add(String data) {
        if (isEmpty()) {
            System.out.println("Set head to: " + data);
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.nextNode != null) {
         current = current.nextNode;
        }
        System.out.println("Added pointer to: " + data + " from node " + current.data);
        current.nextNode = new Node(data);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Grillkorv");
        list.add("Hello, World!");
        list.add("Martin");
    }
}

class Node {
    final String data;
    Node nextNode;

    public Node(String data) {
        this.data = data;
    }
}
