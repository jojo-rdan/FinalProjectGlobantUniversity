package org.globantUniversity.data;

import org.globantUniversity.data.teacher.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private String lessonName;
    private int assignedClassroom;
    private List<Student> studentsAssigned;
    private Teacher teacher;

    public Lesson(String lessonName, int assignedClassroom, List<Student> studentsAssigned, Teacher teacher) {
        this.lessonName = lessonName;
        this.assignedClassroom = assignedClassroom;
        this.studentsAssigned = studentsAssigned;
        this.teacher = teacher;
    }
    public String getLessonName() {
        return lessonName;
    }
    public int getAssignedClassroom() {
        return assignedClassroom;
    }
    public List<Student> getStudentsAssigned() {
        return studentsAssigned;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public String getStudentsName(int index){
        return this.studentsAssigned.get(index).getName();
    }
    @Override
    public String toString() {
        int i = 0;
        return "Lesson='" + lessonName + '\'' +
                ", assignedClassroom=" + assignedClassroom +
                ", studentsAssigned=" + getStudentsName(i) +
                ", teacher=" + teacher;
    }
}
