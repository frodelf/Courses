package courses.collection;

import java.util.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listOfCarNumbers = new ArrayList<>();
        String carNumbers = "";
        while (!carNumbers.equals("STOP")) {
            carNumbers = scanner.nextLine();
            if (carNumbers.equals("LIST")) {
                for (String el : listOfCarNumbers) {
                    System.out.println(el);
                }
                continue;
            }
            listOfCarNumbers.add(carNumbers);
        }
    }
}
