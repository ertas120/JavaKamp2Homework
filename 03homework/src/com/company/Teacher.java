package com.company;

public class Teacher {
    public Teacher(int id, String name, String detail) {
        this.id = id;
        this.name = name;
        this.detail = detail;
    }

    int id;
    String name;
    String detail;

    @Override
    public String toString() {
        return "id: " + id + "\nName: " + name + "\ndetail: " + detail ;
    }
}
