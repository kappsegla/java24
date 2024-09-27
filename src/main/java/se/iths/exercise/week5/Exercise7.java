package se.iths.exercise.week5;

public class Exercise7 {
    public static void main(String[] args) {
        SortedTree tree = new SortedTree();
        tree.add(6);
        tree.add(8);
        tree.add(4);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);
        tree.printAll();  //3 4 5 6 7 8 9
    }
}

class SortedTree {
    Node root;

    boolean add(int value) {
        if (isEmpty()) {
            root = new Node(value);
            return true;
        }
        Node current = root;
        while (true) {
            if (value < current.value) {
                //Left
                if (current.left == null) {
                    current.left = new Node(value);
                    return true;
                }
                current = current.left;
            } else if (value > current.value) {
                //Right
                if (current.right == null) {
                    current.right = new Node(value);
                    return true;
                }
                current = current.right;
            } else
                return false;
        }
    }

    void printAll() {
        traverseInOrder(root);
    }

    void traverseInOrder(Node node) {
        if (node == null) return;
        //traverse left
        traverseInOrder(node.left);
        //print ourself
        System.out.println(node.value + " ");
        //traverse right
        traverseInOrder(node.right);
    }


    boolean isEmpty() {
        return root == null;
    }
}

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}
