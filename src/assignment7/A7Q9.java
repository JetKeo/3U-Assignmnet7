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
public class A7Q9 {
    public static void allDigitsOdd(int number){
        while(number > 10) {
            if(number % 2 == 0){
                break;
            } else {
                number = number / 10;
            }
        }
        if(number % 2 == 0) {
            System.out.println("The digits are not all odd.");
        }else{
            System.out.println("All the digits are odd.");
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        allDigitsOdd(number);
    }
    
}
