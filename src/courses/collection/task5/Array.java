package courses.collection.task5;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List<Integer> listArr = new ArrayList<>();

        end((ArrayList<Integer>) listArr);

        beginning((ArrayList<Integer>) listArr);
        getLastElement((ArrayList<Integer>) listArr);
        firstHalf((ArrayList<Integer>) listArr);
        removeSecondHalf((ArrayList<Integer>) listArr);
        removeFirstHalf((ArrayList<Integer>) listArr);
    }

    static void end(ArrayList<Integer> list) {
        long m1 = System.currentTimeMillis();
        System.out.println("Дадавання в кінець");
        for (int i = 0; i < 100000; i++) {
            list.add((int) (Math.random() * 100));
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
    }

    static void beginning(ArrayList<Integer> list) {
        long m1 = System.currentTimeMillis();
        System.out.println("Дадавання в початок");
        for (int i = 0; i < 100000; i++) {
            list.add(0, (int) (Math.random() * 100));
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
    }

    static void getLastElement(ArrayList<Integer> list) {
        long m1 = System.currentTimeMillis();
        System.out.println("Отримати остані елементи");
        for (int i = 1; i < 1000; i++) {
            list.get(list.size() - i);
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
    }

    static void firstHalf(ArrayList<Integer> list) {
        long m1 = System.currentTimeMillis();
        System.out.println("Отримати першу половину");
        for (int i = 0; i < list.size() / 2; i++) {
            list.get(i);
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
    }

    static void removeSecondHalf(ArrayList<Integer> list) {
        long m1 = System.currentTimeMillis();
        System.out.println("Видалити другу половину");
        for (int i = list.size() - 1; i > list.size() / 2; i--) {
            list.remove(i);
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
    }

    static void removeFirstHalf(ArrayList<Integer> list) {
        long m1 = System.currentTimeMillis();
        System.out.println("Видалити першу половину");
        for (int i = list.size() / 2; i > 0; i--) {
            list.remove(i);
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
    }
}
