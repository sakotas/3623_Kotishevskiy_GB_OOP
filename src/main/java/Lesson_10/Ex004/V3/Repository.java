package Lesson_10.Ex004.V3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class Repository<T extends Content> implements Iterator<T> {
    List<T> ds;
    private int position;
    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);
    }

    public void add(T content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public T get(Integer index) {
        return ds.get(index);
    }

    @Override
    public boolean hasNext() {
        return position < ds.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return ds.get(position++);
    }

    // В качестве тренировки реализуйте возможность работы с foreach

}
