package courses.collection.task6;

import java.util.Comparator;

public class CompareUser implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o2.getId() - o1.getId();
    }
}
