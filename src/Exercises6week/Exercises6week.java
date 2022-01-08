/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises6week;

import java.util.Scanner;

public class Exercises6week {

    public static void main(String args[]) {
    
       
   
        Scanner input = new Scanner(System.in);

    
    int count=0;
    int correctcount=0;
    
    while(correctcount<5){
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        System.out.print("What is " + num1 + " + " + num2 + "?\t");
        int answer = input.nextInt();
        if(num1 + num2 != answer) {
      System.out.print("Wrong answer, try again! What is " 
        + num1 + " + " + num2 + "?\t ");
      answer = input.nextInt();
        }
        else 
            System.out.println("You got it!");
              count ++;
              correctcount++;
    
    
 
    }
    
   System.out.println("Your Quiz Ended.");
    }
}

