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
public class A7Q4 {

    public static double compoundInterest(double initial, double rate, double years) {
        //calculate the compound interest
        double b = initial + Math.pow((1 + rate), years);
        //sends back the answer
        return b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //user input
        Scanner input = new Scanner(System.in);
        //enter variables
        System.out.println("Enter the initial principal:");
        double initial = input.nextDouble();
        System.out.println("Enter the interest rate:");
        double rate = input.nextDouble();
        System.out.println("Enter the amount of years:");
        double years = input.nextDouble();
        //output the balance after the compound interest
        double b = compoundInterest(initial, rate, years);
        System.out.println("Your balance will be " + b);
    }
}
