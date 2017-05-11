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
public class A7Q5 {

    public static void chaotic(int lines) {
        //make a random set of * between 1-5
        for (int i = 0; i < lines; i++) {
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            for (int a = 0; a < randNum; a++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //user inut
        Scanner input = new Scanner(System.in);
        //variable for lines inputed
        System.out.println("Enter the amount of lines:");
        int lines = input.nextInt();
        //output the chaotic method with lines
        chaotic(lines);

    }

}
