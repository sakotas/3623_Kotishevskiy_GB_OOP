package Seminar3.Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Personnel implements Iterable<User> {

    List<User> userList = new ArrayList<>();

    public Personnel addUser(User user) {
        userList.add(user);
        return this;
    }

    public List<User> toList() {
        List<User> resultList = new ArrayList<>();
        for (User user : this) {
            resultList.add(user);
        }
        return resultList;
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < userList.size();
            }

            @Override
            public User next() {
                return userList.get(index++);
            }
        };
    }

    public int size() {
        return this.userList.size();
    }
}
