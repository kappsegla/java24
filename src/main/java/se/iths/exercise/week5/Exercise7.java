package se.iths.exercise.week5;

import java.util.Stack;

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
        System.out.println();
        tree.printAllUsingLoop();
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
        System.out.print(node.value + " ");
        //traverse right
        traverseInOrder(node.right);
    }

    void printAllUsingLoop() {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Current must be null at this point
            current = stack.pop();
            System.out.print(current.value + " ");

            // Visit the right subtree
            current = current.right;
        }
        System.out.println();
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
