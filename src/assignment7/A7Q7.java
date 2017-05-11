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
public class A7Q7 {

    public static int firstDigit(int number) {
        //if the number is negative make it postive
        if (number < 0) {
            number = number * 1;
        }
        //keep dividing by 10 until there is only one number
        while (number >= 10) {
            number = number / 10;

        }
        return number;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        //output the first digit
        System.out.println("The first digit of the number is " + firstDigit(number));
    }

}
