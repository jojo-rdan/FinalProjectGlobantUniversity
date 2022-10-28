package org.globantUniversity.data.teacher;

public class Teacher {
    private int professorID;
    private String name;

    public Teacher(String name) {
        this.professorID = (int)(100000 * Math.random());
        this.name = name;
    }
    public int getProfessorID() {
        return professorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
