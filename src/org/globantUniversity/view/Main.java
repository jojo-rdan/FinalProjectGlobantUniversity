package org.globantUniversity.view;

import org.globantUniversity.data.Student;
import org.globantUniversity.data.University;
import org.globantUniversity.data.teacher.Teacher;
import org.globantUniversity.persistence.DataInitializer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University myUniversity = DataInitializer.loadUniversity();
        Scanner input = new Scanner(System.in);
        byte action;
        do {
            System.out.println("Welcome to the " + myUniversity.getName() + "\n");
            System.out.println("What do you want to do today?\n");
            System.out.println("1. List all the teachers");
            System.out.println("2. List all the lessons");
            System.out.println("3. Create a new student and add it to an existing class");
            System.out.println("4. Create a lesson with existing teacher and students");
            System.out.println("5. List lessons in which a given student is included");
            System.out.println("0. Exit");
            action = input.nextByte();
            switch (action){
                case 1:
                    printAllTeachers(myUniversity);
                    break;
                case 2:
                    printAllTheLessons(myUniversity);
                    break;
                case 3:
                    createStudentAndAddToClass(myUniversity);
                    break;
                case 4:
                    createLessonWithTeacherAndStudents(myUniversity);
                    break;
                default:
                    System.out.println("Please enter a valid option");
            }
        } while(action != 0);
    }
    public static void printAllTeachers(University university){
        if(university.getTeachersList().size() == 0){
            System.out.println("There are no professors registered at the university");
        } else {
            for (int i = 0; i < university.getTeachersList().size(); i++) {
                System.out.println(university.getTeacherByIndex(i));
            }
        }
    }
    public static void printAllTheLessons(University university){
        Scanner input = new Scanner(System.in);
        byte internalOptions;
        if(university.getLessonsList().size() == 0){
            System.out.println("There are no lessons registered in the university. Press 4 to create a lesson");
        } else {
            for (int i = 0; university.getLessonsList().size() > i; i++) {
                System.out.println("Lesson name= " + university.getLessonsList().get(i).getLessonName() + ", assigned classroom= " + university.getLessonsList().get(i).getAssignedClassroom());
            }
            do{
                System.out.println("If you want to see more details about an specific lesson, enter its assigned classroom, or press 0 to exit");
                internalOptions = input.nextByte();
                for (int i = 0; i < university.getLessonsList().size(); i++) {
                    if(internalOptions == university.getLessonsList().get(i).getAssignedClassroom()){
                        System.out.println(university.getLessonByIndex(internalOptions-1) + "\n");
                    }
                }
            } while (internalOptions != 0);
        }
    }
    public static void createStudentAndAddToClass(University university){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name = input.next();
        System.out.println("Enter the age of the student");
        int age = input.nextInt();
        System.out.println("Which lesson do you want to add the student to? Press the classroom number");
        for (int i = 0; university.getLessonsList().size() > i; i++) {
            System.out.println("Lesson name= " + university.getLessonsList().get(i).getLessonName() + ", assigned classroom= " + university.getLessonsList().get(i).getAssignedClassroom());
        }
        int assignedClassroom = input.nextByte();
        university.createStudent(name, age, assignedClassroom);
        System.out.println("The student was created and add it to a lesson!\n");
    }
    public static void createLessonWithTeacherAndStudents(University university){
        Scanner input = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        Teacher teacher;
        System.out.println("Enter the name ot the lesson");
        String lessonName = input.next();
        byte internalOptions;
        do {
            System.out.println("Choose the students for the lesson, or press 0 to exit");
            for (int i = 0; i < university.getStudentsList().size(); i++) {
                System.out.println("Name= " + university.getStudentsList().get(i).getName() + ", age= " + university.getStudentsList().get(i).getAge());
            }
            internalOptions = input.nextByte();
            students.add(university.getStudentByIndex(internalOptions));
            } while (internalOptions != 0);
            System.out.println("Choose the teacher for the lesson, or press 0 to exit");
            for (int i = 0; i < university.getTeachersList().size(); i++) {
                System.out.println("Name= " + university.getTeachersList().get(i).getName());
            }
            internalOptions = input.nextByte();
            teacher = university.getTeacherByIndex(internalOptions);
            university.createLesson(lessonName, students, teacher);
    }
}