package manager;

import dao.ReadAndWriteStudent;
import model.Student;

import java.util.ArrayList;

public class StudentManger implements Manager<Student> {
    ArrayList<Student> studentArrayList;
    ReadAndWriteStudent readAndWriteStaff = new ReadAndWriteStudent();
    public StudentManger() {
        this.studentArrayList = readAndWriteStaff.readFile();
    }
    @Override
    public boolean add(Student student) {
        this.studentArrayList.add(student);
        readAndWriteStaff.writeFile(this.studentArrayList);
        return true;
    }

    @Override
    public boolean edit(int id, Student newStudent) {
        int index = findById(id);
        if (index == -1) {
            return false;
        }
        this.studentArrayList.set(index, newStudent);
        readAndWriteStaff.writeFile(this.studentArrayList);
        return true;
    }

    @Override
    public boolean delete(int id) {
        int index = findById(id);
        this.studentArrayList.remove(index);
        readAndWriteStaff.writeFile(this.studentArrayList);
        return true;
    }

    @Override
    public ArrayList<Student> showAll() {
        return this.studentArrayList;
    }

    public int findById(int id) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (id == this.studentArrayList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

//    public ArrayList<Student> sortIncrement() {
//        for (int i = 0; i < studentArrayList.size(); i++) {
//            for (int j = 0; j < studentArrayList.size() - 1; j++) {
//                if (studentArrayList.get(j).getAverage() > studentArrayList.get(j +1).getAverage()) {
//                    double temp = studentArrayList.get(j).getAverage();
//                    studentArrayList.get()[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
}
