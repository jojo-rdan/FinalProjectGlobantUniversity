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
            System.out.println("Welcome to the " + myUniversity.getName());
            System.out.println("What do you want to do today?\n 1. List all the teachers\n 2. List all the Lessons\n " +
                    "3. Create a new student\n 4. Create a Lesson\n 5. List all the Lessons\n 0. Exit");
            action = input.nextByte();
            switch (action){

            }
        } while(action != 0);
    }
}