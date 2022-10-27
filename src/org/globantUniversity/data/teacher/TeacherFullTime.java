package org.globantUniversity.data.teacher;

public class TeacherFullTime extends Teacher{
    private double baseSalary;
    private byte experienceYears;
    public TeacherFullTime(String name,byte experienceYears){
        super(name);
        this.experienceYears = experienceYears;
        this.baseSalary = (experienceYears * 1.1) * 1000000;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public byte getExperienceYears() {
        return experienceYears;
    }
}
