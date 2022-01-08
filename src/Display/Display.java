package Display;

import java.util.Scanner;

public class Display {
  public static void main(String[] args) {
      
    Scanner input = new Scanner(System.in);
    
    System.out.print("Saniye giriniz : ");
    int second = input.nextInt();
 
    int minute = second / 60; 
    
    int reSecond = second % 60; 
    
    System.out.println(second + " Saniye " + minute + 
      " dakika ve " + reSecond + " Saniyedir. ");  
  }
}