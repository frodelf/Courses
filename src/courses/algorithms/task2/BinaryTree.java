package courses.algorithms.task2;

import java.util.*;

public class BinaryTree {
    char value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(char value, BinaryTree left, BinaryTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void deep() {
        System.out.println(value);
        if (left != null) {
            left.deep();
        }
        if (right != null) {
            right.deep();
        }
    }

    public void wide() {
        BinaryTree root = this;
        LinkedList<BinaryTree> list = new LinkedList<>();
        list.add(root);

        while (!list.isEmpty()) {
            //print(list);
            BinaryTree node = list.remove();
            System.out.println(node.value);
            if (node.left != null) {
                list.add(node.left);
            }
            if (node.right != null) {
                list.add(node.right);
            }
        }
    }

    static void print(LinkedList<BinaryTree> list) {
        for (BinaryTree tree : list) {
            System.out.print(tree.value + "\t");
        }
        System.out.println();
    }
}