package com.universtiy.beans;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private List<Students> students;

    public Course() {
        this.students = new ArrayList<>();
    }

    public Course(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void addStudent(Students student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "Course{title='" + title + "', students=" + students + "}";
    }
}

