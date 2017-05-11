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
public class A7Q1 {

    public static double circleArea(double radius) {
        //calculating the area of the circle
        double circle = Math.pow(radius, 2) * Math.PI;
        //sends back the answer
        return circle;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        //enter a radius
        double radius = input.nextDouble();
        //output the area of the circle
        double circle = circleArea(radius);
        System.out.println("The area of the circle is " + circle + " units.");
    }

}
