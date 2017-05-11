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
public class A7Q2 {

    public static void examGrade(int mark) {
        //determine there equivalent grade to their mark
        if (mark >= 80) {
            System.out.println("Your final grade is an A");
        }
        if (mark >= 70 && mark <= 79) {
            System.out.println("Your final grade is a B");
        }
        if (mark >= 60 && mark <= 69) {
            System.out.println("Your final grade is a C");
        }
        if (mark >= 50 && mark <= 59) {
            System.out.println("Your final grade is a D");
        }
        if (mark < 50) {
            System.out.println("Your final grade is a F");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your exam mark:");
        //enter the mark
        int mark = input.nextInt();
        //output their grade
        examGrade(mark);
    }

}
