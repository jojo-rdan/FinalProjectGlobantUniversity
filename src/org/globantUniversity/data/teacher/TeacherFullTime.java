package org.globantUniversity.data.teacher;

public class TeacherFullTime extends Teacher{
    private double baseSalary;
    private byte experienceYears;
    public TeacherFullTime(int professorID, String name, double salary,byte experienceYears){
        super(professorID, name);
        this.setBaseSalary(salary);
        this.setExperienceYears(experienceYears);
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public byte getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(byte experienceYears) {
        this.experienceYears = experienceYears;
    }
}
