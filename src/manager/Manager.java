package manager;

import model.Student;

import java.util.ArrayList;

public interface Manager<S> {
    boolean add(S student);
    boolean edit(int id, S newStudent);
    boolean delete(int id);
    ArrayList<Student> showAll();
}
