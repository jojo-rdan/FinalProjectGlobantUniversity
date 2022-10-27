package org.globantUniversity.data;

import org.globantUniversity.data.teacher.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private String lessonName;
    private int assignedClassroom;
    private List<Student> studentsAssigned = new ArrayList<>();
    private Teacher teacher;

    public Lesson(String lessonName, int assignedClassroom, List<Student> studentsAssigned, Teacher teacher) {
        this.lessonName = lessonName;
        this.assignedClassroom = assignedClassroom;
        this.studentsAssigned = studentsAssigned;
        this.teacher = teacher;
    }
}
