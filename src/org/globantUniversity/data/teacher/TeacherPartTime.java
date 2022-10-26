package org.globantUniversity.data.teacher;

public class TeacherPartTime extends Teacher{
    private double baseSalary;
    private byte activeHoursPerWeek;
    public TeacherPartTime(int professorID, String name, double salary, byte activeHoursPerWeek){
        super(professorID, name);
        this.setBaseSalary(salary);
        this.setActiveHoursPerWeek(activeHoursPerWeek);
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public byte getActiveHoursPerWeek() {
        return activeHoursPerWeek;
    }

    public void setActiveHoursPerWeek(byte activeHoursPerWeek) {
        this.activeHoursPerWeek = activeHoursPerWeek;
    }
}
