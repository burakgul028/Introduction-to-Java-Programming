/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package output;

/**
 *
 * @author burak
 */
public class output {

   
    
       public static void main(String[] args)
	{
		int a=54;
		int b=36;
		
		int result=firstMethod(b,++a);
		System.out.println("Result="+result);
	
	}
	public static int firstMethod(int a,int b)
	{
		int number1=secondMethod(a,b);
		System.out.println("1st number ="+number1);
		
		int number2=secondMethod(b+9,a/9);
		System.out.println("2nd number ="+number2);
		
		return number1+number2;
	}
	public static int secondMethod(int a,int b)
	{
		a %=10;
		b/=10;
		
		return 100*a+b;
	}
	
} 

    

