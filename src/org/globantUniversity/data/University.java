package org.globantUniversity.data;
import org.globantUniversity.data.teacher.Teacher;
import org.globantUniversity.data.teacher.TeacherFullTime;
import org.globantUniversity.data.teacher.TeacherPartTime;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Teacher> teachers;
    private List<Student> students;
    private List<Lesson> lessons;

    public University(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.lessons = new ArrayList<>();
    }
    public void registerStudent(Student student){
        this.students.add(student);
    }
    public void registerTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }
    public void registerLessons(Lesson lesson){
        this.lessons.add(lesson);
    }

    public List<Student> getStudentsList() {
        return students;
    }
}
