package org.vistula.clazz;

import java.util.Scanner;

public class ClassExample {

    public static void main(String[] args) {
        Scanner myConsole = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myConsole.nextLine();  // Read user input
        Person me = new Person(userName); // Creates new Person object with name 'me'
        me.printName(); // Invoking printName() method on 'me' object
    }//
}
