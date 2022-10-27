package org.globantUniversity.data;

public class Student {
    private int studentID;
    private String name;
    private byte age;

    public Student(String name, byte age) {
        this.studentID = (int)(100000 * Math.random());
        this.name = name;
        this.age = age;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public String getName() {
        return this.name;
    }

    public byte getAge(){ return this.age; }

    public void setName(String name) {
        this.name = name;
    }
}
