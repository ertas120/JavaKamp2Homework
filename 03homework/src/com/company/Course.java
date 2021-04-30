package com.company;

public class Course {
    Teacher teacher;
    int id ;
    String detail;

    public Course(Teacher teacher, int id, String detail) {
        this.teacher = teacher;
        this.id = id;
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Teacher: " +teacher+ "\nId: " + id + "\ndetail: " +detail;
    }

}
