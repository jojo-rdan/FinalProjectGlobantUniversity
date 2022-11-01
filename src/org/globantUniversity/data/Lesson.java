package org.globantUniversity.data;

import org.globantUniversity.data.teacher.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private String lessonName;
    private int assignedClassroom;
    private List<Student> studentsAssigned;
    private Teacher teacher;
    public Lesson(String lessonName, List<Student> studentsAssigned, Teacher teacher) {
        this.lessonName = lessonName;
        this.studentsAssigned = studentsAssigned;
        this.teacher = teacher;
    }
    public void setAssignedClassroom(int assignedClassroom) {
        this.assignedClassroom = assignedClassroom;
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
    @Override
    public String toString() {
        return "Lesson= " + lessonName +
                ", Assigned Classroom= " + assignedClassroom +
                ", Students Assigned= " + studentsAssigned.toString() +
                ", Teacher= " + teacher.getName();
    }
}
