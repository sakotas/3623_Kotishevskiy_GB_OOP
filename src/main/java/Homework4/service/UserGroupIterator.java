package Homework4.service;

import Homework4.model.Student;
import Homework4.model.User;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class UserGroupIterator<T extends User> implements Iterator<T> {

    private final List<T> usersList;
    private int position;


    public UserGroupIterator(List<T> usersList) {
        this.usersList = usersList;
    }

    @Override
    public boolean hasNext() {
        return position < usersList.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return usersList.get(position++);
    }

    @Override
    public void remove() {
        usersList.remove(--position);
    }
}
