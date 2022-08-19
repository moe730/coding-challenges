package com.madlibs;

import java.util.Scanner;

public class MadLibs {

    public void madLibs(){
       Scanner keyboard = new Scanner(System.in);
//        System.out.println("please enter a verb: ");
//        String verb = keyboard.next();
//        System.out.println("please enter a noun: ");
//        String noun = keyboard.next();
//        System.out.println("please enter a place: ");
//        String place = keyboard.next();
        System.out.println("please enter a name: ");
        String name = keyboard.next();
       // System.out.println("please enter an age: ");
     //   int age = keyboard.nextInt();

        String story = name+  " is having a party";
        System.out.println(story);

    }

    public static void main(String[] args) {
        MadLibs ml = new MadLibs();
        ml.madLibs();

    }
}





