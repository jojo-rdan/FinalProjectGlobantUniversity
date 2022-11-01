package org.globantUniversity.view;

import java.util.Scanner;

public class Reader {
    public static byte optionsScanner(){
        try {
            Scanner input = new Scanner(System.in);
            return input.nextByte();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input, please enter a number without symbols");
            return -1;
        }
    }
}
