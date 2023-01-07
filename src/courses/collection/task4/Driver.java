package courses.collection.task4;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    int id;
    List<Car> cars;
    String name;

    public Driver(int id, String name) {
        this.id = id;
        this.name = name;
        cars = new ArrayList<>();
    }
}
