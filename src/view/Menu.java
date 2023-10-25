package view;

import input.Input;
import manager.StudentManger;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private StudentManger studentList = new StudentManger();
    Scanner input = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("QUẢN LÝ SINH VIÊN\n" +
                    "1. Xem danh sách sinh viên\n" +
                    "2. Thêm mới\n" +
                    "3. Cập nhật\n" +
                    "4. Xoá\n" +
                    "5. Sắp xếp\n" +
                    "6. Thoát\n");
            System.out.print("Chọn chức năng: ");
            choice = Input.getInputInt();
            switch (choice) {
                case 1:
                    showListStudent();
                    break;
                case 2:
                    showAddMenu();
                    break;
                case 3:
                    showEditMenu();
                    break;
                case 4:
                    showDelMenu();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }

    public void showAddMenu() {
        System.out.println("Thêm sinh viên");
        System.out.print("Mã sinh viên: ");
        int id = Input.getInputInt();
        System.out.print("Họ tên: ");
        String name = Input.getInputString();
        System.out.print("Tuổi: ");
        int age = Input.getInputInt();
        System.out.print("Giới tính: ");
        String gender = Input.getInputGender();
        System.out.print("Địa chỉ: ");
        String address = Input.getInputString();
        System.out.print("Điểm trung bình: ");
        double average = input.nextDouble();
        Student student = new Student(id, name, age, gender, address, average);
        studentList.add(student);
    }

    public void showEditMenu() {
        System.out.println("Sửa sinh viên");
        System.out.print("Mã sinh viên: ");
        int id = Input.getInputInt();
        System.out.print("Họ tên: ");
        String name = Input.getInputString();
        System.out.print("Tuổi: ");
        int age = Input.getInputInt();
        System.out.print("Giới tính: ");
        String gender = Input.getInputGender();
        System.out.print("Địa chỉ: ");
        String address = Input.getInputString();
        System.out.print("Điểm trung bình: ");
        double average = input.nextDouble();
        Student student = new Student(id, name, age, gender, address, average);
        studentList.edit(id, student);
    }

    public void showDelMenu() {
        System.out.println("Xoá sinh viên");
        System.out.print("Nhập mã sinh viên muốn xoá: ");
        int id = Input.getInputInt();
        studentList.delete(id);
    }

    public void showListStudent() {
        System.out.println("Danh sách sinh viên");
        ArrayList<Student> students = studentList.showAll();
        for (Student student :
                students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public void showSortMenu() {
        int choice;
        do {
            System.out.println("Sắp xếp sinh viên theo điểm trung bình\n" +
                    "1. Sắp xếp điểm trung bình tăng dần" +
                    "2. Sắp xếp điểm trung bình giảm dần" +
                    "3. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Input.getInputInt();
            switch (choice) {
                case 1:
            }
        } while (choice != 0);
    }
}
