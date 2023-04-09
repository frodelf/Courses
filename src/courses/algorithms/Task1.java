package courses.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    static int itter;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір масиву");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Введіть елемент, який потрібно знайти");
        int searchElement = scanner.nextInt();
        int index = linearSearch(arr, searchElement);
        if (index != 0) {
            System.out.println("Елемент знаходиться під індексом " + index);
        } else {
            System.out.println("Даного числа в масиві немає.");
        }
        System.out.println("Кількість іттерацій " + itter);
    }

    public static int linearSearch(int arr[], int elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            itter++;
            if (arr[index] == elementToSearch)
                return index;
        }
        return 0;
    }
}
