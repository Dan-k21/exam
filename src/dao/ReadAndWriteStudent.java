package dao;

import model.Student;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteStudent {
    File file = new File("student.csv");

    public void writeFile(ArrayList<Student> studentList) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "";
            for (Student student :
                    studentList) {
                data += student.getId() + ", " +
                        student.getName() + ", " +
                        student.getAge() + ", " +
                        student.getGender() + ", " +
                        student.getAddress() + ", " +
                        student.getAverage() + "\n";
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Student> readFile() {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(", ");
                Student student = new Student(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), data[3], data[4], data[5]);
                studentArrayList.add(student);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return studentArrayList;
    }
}
