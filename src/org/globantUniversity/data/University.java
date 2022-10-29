package org.globantUniversity.data;

import org.globantUniversity.data.teacher.Teacher;

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
        lesson.setAssignedClassroom(lessons.size()+1);
        this.lessons.add(lesson);
    }
    public List<Student> getStudentsList() {
        return this.students;
    }
    public List<Teacher> getTeachersList() { return this.teachers; }
    public List<Lesson> getLessonsList() { return this.lessons; }
    public Teacher getTeacherByIndex(int index){
        return this.teachers.get(index);
    }
    public Lesson getLessonByIndex(int index){
        return this.lessons.get(index);
    }
    public String getName() {
        return name;
    }
}
