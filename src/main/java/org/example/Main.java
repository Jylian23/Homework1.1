package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("      Hello !");

        System.out.println("What's your name?");

        Scanner scanner = new Scanner (System.in);
        String userName = scanner.nextLine();

        System.out.println("Nice to meet you " + userName + "!" );

        System.out.println("What is your preferred hobby " + userName + "?" );
        System.out.println("Please choose from: 1 for Hiking , 2 for Swimming , 3 for Rock climbing , 4 for Playing video games , 5 for Football. ");

        int userHobie = scanner.nextInt();

        if (userHobie == 1 ) {
            System.out.println("That is my favorite.");
        }if (userHobie == 2) {
            System.out.println("I used to love swimming.");
        }if (userHobie == 3) {
            System.out.println("If it is indoor it's cool but im scared of outdoor Rock climbing.");
        }if (userHobie == 4) {
            System.out.println("Whats your favorite Video Game ?");
        }if (userHobie == 5){
            System.out.println("How good are you at football ?");
        }else {
            System.out.println("Please run the code again so that you would not break it and next time use the provided numbers!");
        }
    }
}