package org.globantUniversity.data.teacher;

public class TeacherPartTime extends Teacher{
    private double baseSalary;
    private int activeHoursPerWeek;
    public TeacherPartTime(String name, int activeHoursPerWeek){
        super(name);
        this.activeHoursPerWeek = activeHoursPerWeek;
        this.baseSalary = (1000000 / 48) * this.activeHoursPerWeek;
    }
    public double getBaseSalary() { return this.baseSalary; }
    public int getActiveHoursPerWeek() { return this.activeHoursPerWeek; }
}
