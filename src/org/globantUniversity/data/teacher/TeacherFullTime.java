package org.globantUniversity.data.teacher;

public class TeacherFullTime extends Teacher{
    private double baseSalary;
    private int experienceYears;
    public TeacherFullTime(String name,int experienceYears){
        super(name);
        this.experienceYears = experienceYears;
        this.baseSalary = (experienceYears * 1.1) * 1000000;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public int getExperienceYears() {
        return experienceYears;
    }
}
