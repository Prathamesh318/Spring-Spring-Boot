package com.universtiy.beans;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Course> courses;

    public University() {
        this.courses = new ArrayList<>();
    }

    // Dependency injection via setter
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void enrollStudent(Students student, String courseTitle) {
        for (Course course : courses) {
            if (course.getTitle().equals(courseTitle)) {
                course.addStudent(student);
                System.out.println("Enrolled " + student + " in " + courseTitle);
                return;
            }
        }
        System.out.println("Course " + courseTitle + " not found!");
    }
}

