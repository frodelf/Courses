package courses.collection.task7;

import java.util.Arrays;

public class Sort {

    public static int[] bubbleSort(int[] arr) {
        long m1 = System.currentTimeMillis();
        int rezerv;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    rezerv = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = rezerv;
                }
            }
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        long m1 = System.currentTimeMillis();
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > current) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = current;
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        long m1 = System.currentTimeMillis();
        int index = 0;
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MAX_VALUE;
            int j = i;
            for (; j < arr.length; j++) {
                if (max > arr[j]) {
                    max = arr[j];
                    index2 = j;
                }
            }
            arr[index2] = arr[index];
            arr[index++] = max;
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
        return arr;
    }

    public static int[] shellSort(int[] arr) {
        long m1 = System.currentTimeMillis();
        int length = arr.length;
        for (int step = length / 2; step > 0; step /= 2) {
            for (int i = step; i < length; i++) {
                for (int j = i - step; j >= 0; j -= step) {
                    if (arr[j] > arr[j + step]) {
                        int x = arr[j];
                        arr[j] = arr[j + step];
                        arr[j + step] = x;
                    }
                }
            }
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
        return arr;
    }


    public static int[] quickSort(int[] arr, int low, int high) {
        long m1 = System.currentTimeMillis();
        int middle = low + (high - low) / 2;
        int opora = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] > opora) {
                i++;
            }
            while (arr[j] < opora) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(arr, low, j);
        if (high > i)
            quickSort(arr, i, high);
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
        return arr;
    }


    public static int[] mergeSort(int[] sortArr) {
        long m1 = System.currentTimeMillis();
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("час: " + time + "мс");
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
