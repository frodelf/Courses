package courses.collection.task5;

import java.util.LinkedList;
import java.util.List;

public class Linked {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList();
        end((LinkedList<Integer>) list);
        beginning((LinkedList<Integer>) list);
        getLastElement((LinkedList<Integer>) list);
        firstHalf((LinkedList<Integer>) list);
        removeSecondHalf((LinkedList<Integer>) list);
        removeFirstHalf((LinkedList<Integer>) list);
    }

    static void end(LinkedList<Integer> list) {
        long m1 = System.currentTimeMillis();
        System.out.println("Дадавання в кінець");
        for (int i = 0; i < 100000; i++) {
            list.add((int) (Math.random() * 100));
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
    }

    static void beginning(LinkedList<Integer> list) {
        long m1 = System.currentTimeMillis();
        System.out.println("Дадавання в початок");
        for (int i = 0; i < 100000; i++) {
            list.add(0, (int) (Math.random() * 100));
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
    }

    static void getLastElement(LinkedList<Integer> list) {
        long m1 = System.currentTimeMillis();
        System.out.println("Отримати останій елемент");
        for (int i = 1; i < 1000; i++) {
            list.get(list.size() - i);
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
    }

    static void firstHalf(LinkedList<Integer> list) {
        long m1 = System.currentTimeMillis();
        System.out.println("Отримати першу половину");
        for (int i = 0; i < list.size() / 2; i++) {
            list.get(i);
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
    }

    static void removeSecondHalf(LinkedList<Integer> list) {
        long m1 = System.currentTimeMillis();
        System.out.println("Видалити другу половину");
        for (int i = list.size() - 1; i > list.size() / 2; i--) {
            list.remove(i);
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
    }

    static void removeFirstHalf(LinkedList<Integer> list) {
        long m1 = System.currentTimeMillis();
        System.out.println("Видалити першу половину");
        for (int i = list.size() / 2; i > 0; i--) {
            list.remove(i);
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
    }
}
