/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

/**
 *
 * @author jetkeo
 */
public class A7Q8 {

    public static void season(int month, int day) {
        //If the date falls between winter
        if (month == 12) {
            if (day >= 16) {
                System.out.println("Winter");
            } else {
                System.out.println("Fall");
            }
        } else if (month < 3) {
            System.out.println("Winter");
        }
        //if the falls between spring
        if (month == 3) {
            if (day >= 16) {
                System.out.println("Spring");
            } else {
                System.out.println("Winter");
            }
        } else if (month < 6 && month > 3) {
            System.out.println("Spring");
        }
        //if the date falls between summer
        if (month == 6) {
            if (day >= 16) {
                System.out.println("Summer");
            } else {
                System.out.println("Spring");
            }
        } else if (month < 9 && month > 6) {
            System.out.println("Summer");
        }
        //if the date falls between fall
        if (month == 9) {
            if (day >= 16) {
                System.out.println("Fall");
            } else {
                System.out.println("Summer");
            }
        } else if (month < 12 && month > 9) {
            System.out.println("Fall");
        }
        //if the date is not an actual date
        if (month > 12 || day > 31) {
         System.out.println("That is not a actual date");
          }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //user input
        Scanner input = new Scanner(System.in);
        //enter the month and day
        System.out.println("Enter the month (in a number):");
        int month = input.nextInt();
        System.out.println("Enter the day (in a number):");
        int day = input.nextInt();
        //output the date and the season it is in
        System.out.println("The season on " + month + "/" + day + " is:");
        season(month, day);
    }

}
