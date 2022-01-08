/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HomeworkExercises3Week6;

/**
 *
 * @author burakgul 2016556028
 */
public class HomeworkExercises3Week6 {

    /**
     * Snake eyes program
     */
    public static void main(String args[]){

       int die1, die2;   
           int Rolls;  
           
           Rolls = 0;
           
           do {
              die1 = (int)(Math.random()*6) + 1;  
              die2 = (int)(Math.random()*6) + 1;
              Rolls++;                        
           } while ( die1 != 1 || die2 != 1 );
           
           System.out.println("It found " + Rolls + " rolls to get snake eyes.");
    }
}

 
