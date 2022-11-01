package org.globantUniversity.data.teacher;

public class TeacherFullTime extends Teacher{
    private double baseSalary;
    private int experienceYears;
    public TeacherFullTime(String name,int experienceYears){
        super(name);
        this.experienceYears = experienceYears;
        this.baseSalary = (int)(experienceYears * 1.1) * 1000000;
    }
    @Override
    public String toString() {
        return "Teacher= " + super.getName() +
                ", base salary= " + baseSalary +
                ", experience years= " + experienceYears;
    }
}
