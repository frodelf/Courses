package courses.collection.task6;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>(new CompareUser());
        users.add(new User(3, "Ivan", "A", 21));
        users.add(new User(5, "Denis", "B", 2));
        users.add(new User(1, "Sasha", "C", 10));
        users.add(new User(2, "Stas", "D", 12));
        users.add(new User(7, "Petro", "I", 21));
        users.add(new User(4, "Vasya", "H", 18));
        users.add(new User(6, "Misha", "G", 30));
        users.add(new User(5, "Max", "K", 22));

        for (Object user : users) {
            System.out.println(user);
        }
    }
}
