package seminar4.service;

import seminar4.model.Student;
import seminar4.model.User;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class StudentGroupIterator implements Iterator<User> {

    private final List<User> group;
    private int position;

    public StudentGroupIterator(List<User> studentsList) {
        this.group = studentsList;
    }

    @Override
    public boolean hasNext() {
        return position < group.size();
    }

    @Override
    public User next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return group.get(position++);
    }

    @Override
    public void remove() {
        group.remove(--position);
    }
}
