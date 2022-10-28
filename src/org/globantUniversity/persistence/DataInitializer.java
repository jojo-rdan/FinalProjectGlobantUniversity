package org.globantUniversity.persistence;

import org.globantUniversity.data.Lesson;
import org.globantUniversity.data.Student;
import org.globantUniversity.data.University;
import org.globantUniversity.data.teacher.Teacher;
import org.globantUniversity.data.teacher.TeacherFullTime;
import org.globantUniversity.data.teacher.TeacherPartTime;

import java.util.ArrayList;
import java.util.List;

public class DataInitializer {
    public static University loadUniversity(){
        University university = new University("Globant University");
        loadTeachersIntoUniversity(university);
        loadStudentsIntoUniversity(university);
        return university;
    }
    public static void loadTeachersIntoUniversity(University university){
        Teacher teacher1 = new TeacherFullTime("Felipe", 4);
        Teacher teacher2 = new TeacherFullTime("Juan", 2);
        Teacher teacher3 = new TeacherFullTime("Romina", 3);
        Teacher teacher4 = new TeacherPartTime("Camila", 24);
        Teacher teacher5 = new TeacherPartTime("Daniela", 22);
        Teacher teacher6 = new TeacherPartTime("Pedro", 18);
        university.registerTeacher(teacher1);
        university.registerTeacher(teacher2);
        university.registerTeacher(teacher3);
        university.registerTeacher(teacher4);
        university.registerTeacher(teacher5);
        university.registerTeacher(teacher6);
    }
    public static void loadStudentsIntoUniversity(University university){
        Student student1 = new Student("Carlos", 25);
        Student student2 = new Student("Margarita", 28);
        Student student3 = new Student("Eduardo", 23);
        Student student4 = new Student("Kiara", 22);
        Student student5 = new Student("Julián", 32);
        Student student6 = new Student("Ana", 27);
        Student student7 = new Student("Roberto", 30);
        Student student8 = new Student("Paola", 19);
        Student student9 = new Student("Lionel", 37);
        Student student10 = new Student("María", 20);
        university.registerStudent(student1);
        university.registerStudent(student2);
        university.registerStudent(student3);
        university.registerStudent(student4);
        university.registerStudent(student5);
        university.registerStudent(student6);
        university.registerStudent(student7);
        university.registerStudent(student8);
        university.registerStudent(student9);
        university.registerStudent(student10);
    }
    public static void loadLessonsIntoUniversity(University university){
        //List<Student> assignedStudents = new ArrayList<>();
        //Lesson lesson1 = new Lesson("Math", 104, assignedStudents, university.);
    }
}
