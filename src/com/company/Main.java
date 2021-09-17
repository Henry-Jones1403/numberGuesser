package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int userN = -1;
        int attempts = 0;
        Random random = new Random();
        int randomNumber = (random.nextInt(100));
        System.out.println("choose your number");
        while (userN != randomNumber) {
            userN= input.nextInt();
            if ((randomNumber - userN)<10){
                String warmth = "hot";
            }
            else if((userN-randomNumber)<10){
                String warmth = "hot";
            }
            else{
                String warmth = "cold";
            }
            System.out.println("oops try again!!!       Attempts = " + (attempts = attempts + 1) + " however you are " + warmth);


        }
        System.out.println("You got it!! My number way " + randomNumber + ", it took you " + attempts + " goes to get it");


    }
}
