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
        student.setStudentID(students.size()+1);
        this.students.add(student);
    }
    public void registerTeacher(Teacher teacher){
        teacher.setProfessorID(teachers.size()+1);
        this.teachers.add(teacher);
    }
    public void registerLesson(Lesson lesson){
        lesson.setAssignedClassroom(lessons.size()+1);
        this.lessons.add(lesson);
    }
    public List<Student> getStudentsList() {
        return this.students;
    }
    public List<Teacher> getTeachersList() {
        return this.teachers;
    }
    public List<Lesson> getLessonsList() { return this.lessons; }
    public Teacher getTeacherByIndex(int index){
        return this.teachers.get(index);
    }
    public Lesson getLessonByIndex(int index){
        return this.lessons.get(index);
    }
    public Student getStudentByIndex(int index){
        return this.students.get(index);
    }
    public String getName() {
        return name;
    }
    public void createStudent(String name, int age, int assignedClassroom){
        Student student = new Student(name, age);
        registerStudent(student);
        for (int i = 0; i < lessons.size(); i++) {
            if (assignedClassroom == lessons.get(i).getAssignedClassroom()){
                lessons.get(i).getStudentsAssigned().add(student);
            }
        }
        student.setItsAssignedToALesson(true);
    }
    public void createLesson(String lessonName,List<Student> students, Teacher teacher){
        Lesson lesson = new Lesson(lessonName, students, teacher);
        registerLesson(lesson);
    }
}
