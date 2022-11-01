package org.globantUniversity.data.teacher;

public class TeacherPartTime extends Teacher{
    private double baseSalary;
    private int activeHoursPerWeek;
    public TeacherPartTime(String name, int activeHoursPerWeek){
        super(name);
        this.activeHoursPerWeek = activeHoursPerWeek;
        this.baseSalary = (int)(1000000 / 48) * this.activeHoursPerWeek;
    }
    @Override
    public String toString() {
        return "Teacher= " + super.getName() +
                ", base salary= " + baseSalary +
                ", active hours per week= " + activeHoursPerWeek;
    }
}
