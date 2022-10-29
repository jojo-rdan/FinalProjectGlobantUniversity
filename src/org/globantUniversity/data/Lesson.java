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
    public Teacher getTeacher() {
        return teacher;
    }
    public String getStudentsName(){
        for (int i = 0; i < studentsAssigned.size(); i++) {
            return this.studentsAssigned.get(i).getName();
        }
        return null;
    }
    @Override
    public String toString() {
        return "Lesson= " + lessonName +
                ", Assigned Classroom= " + assignedClassroom +
                ", Students Assigned= " + getStudentsAssigned() +
                ", Teacher= " + teacher.getName();
    }
}
