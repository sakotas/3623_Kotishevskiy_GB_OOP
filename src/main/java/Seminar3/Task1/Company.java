package Seminar3.Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Company implements Iterable<User> {

    private User boss;

    public Company(User boss) {
        this.boss = boss;
    }

    private List<User> deepTree(User user) {
        List<User> resultList = new ArrayList<>();
        resultList.add(user);

        if (user.getSubordinates() == null || user.getSubordinates().size() == 0) {
            return resultList;
        }
        for (User item : user.getSubordinates()) {
            resultList.addAll(deepTree(item));
        }
        return resultList;
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            List<User> userList = deepTree(boss);
            Iterator<User> iterator = userList.iterator();
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public User next() {
                return iterator.next();
            }
        };
    }

}
