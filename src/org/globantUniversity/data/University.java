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

    /***
     * Save a student and save their index as their ID
     * @param student The type of data to be saved in the students list
     */
    public void registerStudent(Student student){
        student.setStudentID(students.size()+1);
        this.students.add(student);
    }

    /***
     * Save a teacher and save their index as their ID
     * @param teacher the type of data to be saved in the teachers list
     */
    public void registerTeacher(Teacher teacher){
        teacher.setProfessorID(teachers.size()+1);
        this.teachers.add(teacher);
    }

    /***
     * Save a lesson and save their index as their ID
     * @param lesson the type of data to be saved in the lessons list
     */
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

    /***
     * Create a new student and register it
     * @param name the name of the student
     * @param age the age of the student
     * @param assignedClassroom the classroom to which you will be assigned
     */
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

    /***
     * Create a new lesson, with a teacher and students
     * @param lessonName the name of the lesson
     * @param students the students who will be assigned to the lesson
     * @param teacher the teacher who will be assigned to the lesson
     */
    public void createLesson(String lessonName,List<Student> students, Teacher teacher){
        Lesson lesson = new Lesson(lessonName, students, teacher);
        registerLesson(lesson);
    }
}
