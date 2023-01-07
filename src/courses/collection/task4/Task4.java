package courses.collection.task4;

import java.util.*;

public class Task4 {
    static List<Driver> drivers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Car> carsMap = new HashMap<>();
        String carNumbers = "";
        String name;
        int id;
        while (!carNumbers.equals("STOP")) {
            carNumbers = scanner.nextLine();
            if (carNumbers.equals("STOP")) break;
            else if (carNumbers.equals("LIST") || carNumbers.equals("CAR")) {
                for (Map.Entry entry : carsMap.entrySet()) {
                    System.out.println(entry.getKey());
                }
                continue;
            } else if (carNumbers.equals("DRIVERS")) {
                for (Driver driver : drivers) {
                    System.out.println(driver.name);
                }
                continue;
            } else if (carNumbers.equals("DRIVER")) {
                carNumbers = scanner.nextLine();
                for (Map.Entry entry : carsMap.entrySet()) {
                    if (entry.getKey().equals(carNumbers))
                        System.out.println(carsMap.get(entry.getKey()).driver.name);
                }
                continue;
            }
            id = Integer.parseInt(scanner.nextLine());
            name = scanner.nextLine();
            carsMap.put(carNumbers, new Car(getDriver(id, name, (ArrayList<Driver>) drivers), carNumbers));
        }
    }

    public static Driver getDriver(int id, String name, ArrayList<Driver> list) {
        for (Driver driver : list) {
            if (driver.id == id) {
                return driver;
            }
        }
        Driver driver = new Driver(id, name);
        drivers.add(driver);

        return driver;
    }
}
