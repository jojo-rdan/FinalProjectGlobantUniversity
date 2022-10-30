package org.globantUniversity.view;

import org.globantUniversity.data.University;
import org.globantUniversity.persistence.DataInitializer;

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
            System.out.println("3. Create a new student");
            System.out.println("4. Create a lesson");
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
    public static void printTheLessonDetail(University university){
        if(university.getLessonsList().size() == 0){
            System.out.println("There are no lessons registered in the university. Press 4 to create a lesson");
        } else {
            for (int i = 0; university.getLessonsList().size() > i; i++) {
                System.out.println(university.getLessonByIndex(i));
            }
        }
    }
}