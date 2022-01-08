/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midtermfile2;

/**
 *
 * @author burak
* 2016556028
 */
import java.util.Scanner;
public class midtermfile2 {

    
     public static void main(String[] args) 
     {
         final String alphabet="abcdefghijklmnopqrstuvwxyz";
         
         int num1, num2;
         
         Scanner input = new Scanner(System.in);
         System.out.println("Input A Line: ");
         String line= input.nextLine();
         line = line.toLowerCase();
         System.out.println("Line You have Entered : "+line);
         
         
         
       
         num1 =(int)(Math.random()*26);
         num2 =(int)(Math.random()*26);
         
         
         System.out.println("Num1 Index :"+alphabet.charAt(num1)+" ;  Char For  Num2 Index :"+alphabet.charAt(num2) );
         
         System.out.println("Converted : "+convertCharacters(line, alphabet.charAt(num1), alphabet.charAt(num2) ));
         
     }
     
     public static String convertCharacters(String line, char c1, char c2) 
     {
         
         while (line.indexOf(c1)>= 0 )
         {
             System.out.println(line);
             
             line = line.replace(c1, c2);
             
         }
         return line;
     }
}

