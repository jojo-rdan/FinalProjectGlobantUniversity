package org.globantUniversity.data.teacher;

public class TeacherPartTime extends Teacher{
    private double baseSalary;
    private byte activeHoursPerWeek;
    public TeacherPartTime(String name, byte activeHoursPerWeek){
        super(name);
        this.activeHoursPerWeek = activeHoursPerWeek;
        this.baseSalary = (1000000 / 48) * this.activeHoursPerWeek;
    }
    public double getBaseSalary() { return this.baseSalary; }

    public byte getActiveHoursPerWeek() { return this.activeHoursPerWeek;
    }
}
