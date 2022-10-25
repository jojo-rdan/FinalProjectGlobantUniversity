package org.globantUniversity.data;

public class Teacher {
    private int professorID;
    private String name;

    public Teacher(int professorID, String name) {
        this.professorID = professorID;
        this.name = name;
    }

    public int getProfessorID() {
        return professorID;
    }

    public void setProfessorID(int professorID) {
        this.professorID = professorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
