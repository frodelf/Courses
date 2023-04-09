package courses.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listOfCarNumbers = new ArrayList<>();
        String carNumbers = "";
        int index;
        while (!carNumbers.equals("STOP")) {
            carNumbers = scanner.nextLine();

            if (carNumbers.equals("LIST")) {
                for (String el : listOfCarNumbers) {
                    System.out.println(el);
                }
                continue;
            }

            index = Integer.parseInt(scanner.nextLine());

            if (index > listOfCarNumbers.size()) {
                listOfCarNumbers.add(carNumbers);
                continue;
            }
            listOfCarNumbers.add(index, carNumbers);
        }
    }
}
