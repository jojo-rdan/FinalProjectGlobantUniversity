package org.globantUniversity.data.teacher;

public class Teacher {
    private int professorID;
    private String name;

    public Teacher(String name) {
        this.professorID = (int)(100000 * Math.random());
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "ID= " + professorID +
                ", name= " + name;
    }
}
