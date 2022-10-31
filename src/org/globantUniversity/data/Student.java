package org.globantUniversity.data;

public class Student {
    private int studentID;
    private String name;
    private int age;
    private boolean itsAssignedToALesson;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.itsAssignedToALesson = false;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public String getName() {
        return this.name;
    }

    public int getAge(){ return this.age; }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setItsAssignedToALesson(boolean itsAssignedToALesson) {
        this.itsAssignedToALesson = itsAssignedToALesson;
    }
}
