package courses.algorithms;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть функцію:");
        String function = scanner.nextLine();
        System.out.println(equals(function));
    }

    static boolean equals(String function) {
        char[] arr = function.toCharArray();
        int c = 0, j = 0;
        for (char element : arr) {
            if (element == '(') c++;
            else if (element == ')') {
                j++;
                if (j > c) return false;
            }
        }
        if (c == j) return true;
        return false;
    }
}
