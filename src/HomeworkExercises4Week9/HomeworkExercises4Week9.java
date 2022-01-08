/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HomeworkExercises4Week9;

/**
 *
 * @author burak gul 2016556028
 */
import java.util.Scanner;

public class HomeworkExercises4Week9
{
    
  public static void main(String[] args) {
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
    char[][] answers = new char[8][10];
   for(int i=0;i<8;i++){
    System.out.println("Student " + i + "'s exam answers");
    for(int j=0;j<10;j++){
        char newanswer = (char)(int)(65+(Math.random()*5));
         System.out.print(newanswer+" ");
        answers[i][j] = newanswer;

}
System.out.println();
}

  
    for (int i = 0; i < answers.length; i++) {
     
      int correctCount = 0;
      for (int j = 0; j < answers[i].length; j++) {
        if (answers[i][j] == keys[j])
          correctCount +=10;
      }

      System.out.println("Student " + i + "'s exam point is " +
        correctCount);
    }
  }
}
