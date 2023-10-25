package model;

import dao.ReadAndWriteStudent;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double average;

    private ReadAndWriteStudent readAndWriteStudent = new ReadAndWriteStudent();

    public Student(int id, String name, int age, String gender, String address, double average) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.average = average;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "ID: " + getId() +
                ", Tên: " + getName() +
                ", Tuổi: " + getAge() +
                ", Giới tính: " + getGender() +
                ", Địa chỉ: " + getAddress() +
                ", Điểm trung bình: " + getAverage();
    }
}
