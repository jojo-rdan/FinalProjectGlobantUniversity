package org.globantUniversity.data.teacher;

public class Teacher {
    private int professorID;
    private String name;
    public Teacher(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setProfessorID(int professorID) {
        this.professorID = professorID;
    }
    public int getProfessorID() {
        return professorID;
    }
}
