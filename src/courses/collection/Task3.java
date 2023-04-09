package courses.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> listOfCarNumbers = new HashSet<>();
        String s = "";
        while (!s.equals("STOP")) {
            if (s.equals("LIST")) {
                for (String el : listOfCarNumbers) {
                    System.out.println(el);
                }
                continue;
            }
            s = scanner.nextLine();
            listOfCarNumbers.add(s);
        }
    }
}
