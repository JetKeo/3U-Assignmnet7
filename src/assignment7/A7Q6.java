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
public class A7Q6 {

    public static int lastDigit(int number) {
        // get the remainder (the very last number)
        number = number % 10;
        //if the number is negative multiply the number by -1
        if (number < 0) {
            number = number * -1;
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
        //number variable
        int number = input.nextInt();
        //output the last digit
        lastDigit(number);
        System.out.println("The last digit of the number is " + lastDigit(number));

    }

}
