/*Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
*/

public class AveragePercentage {

   public static void main(String args[]) {
      // create a variable math marks
      int mathMarks = 94;

      // create a variable physics Marks
      int physicsMarks = 95;

      // create a variable chemistry marks
      int chemistryMarks = 96;
      
	  //calculate AveragePercentage and print 
      System.out.println("Sam's average mark in PCM is " + (mathMarks + physicsMarks + chemistryMarks) / 3);

   }

}