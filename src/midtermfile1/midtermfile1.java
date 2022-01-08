/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midtermfile1;

/**
 *
 * @author burak gul
 * 2016556028
 */
public class midtermfile1
{

	public static void main(String[] args){
         int i,j;
        int letter=64;
        for(i=5; i>=1; i--){
            System.out.print("*");

            for(j=i; j>=1; j--){
                System.out.print((char)(j+letter));
            }
            System.out.println();
        }
        
    }
}
    
    

