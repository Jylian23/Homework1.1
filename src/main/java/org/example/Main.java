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
        System.out.println("Please choose a number from: 1 for Hiking , 2 for Swimming , 3 for Rock climbing , 4 for Playing video games , 5 for Football. ");

        int userHobby = scanner.nextInt();

        if (userHobby == 1 ) {
            System.out.println("Hiking is my favorite hobby.");
        }if (userHobby == 2) {
            System.out.println("I used to love swimming.");
        }if (userHobby == 3) {
            System.out.println("Rock climbing is really cool hobby.");
        }if (userHobby == 4) {
            System.out.println("Whats your favorite Video Game ?");
        }if (userHobby == 5){
            System.out.println("How good are you at football ?");
        }else {
            System.out.println("Please run the code again so that you would not break it and next time use the provided numbers!");
        }
    }
}