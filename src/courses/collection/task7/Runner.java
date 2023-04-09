package courses.collection.task7;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] arr = new int[50000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println("Бульбашкове сортування:");
        sort.bubbleSort(arr);
        System.out.println("Сортування вставкою:");
        sort.insertionSort(arr);
        System.out.println("Сортування вибором:");
        sort.selectionSort(arr);
        System.out.println("Шелл сортування:");
        sort.shellSort(arr);
        System.out.println("Бистре сортування:");
        sort.quickSort(arr, arr.length - 1, 0);
        System.out.println("Сортування злиттям");
        sort.mergeSort(arr);
    }
}