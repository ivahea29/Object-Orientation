package task3;
/* @author Ivan Heaslip */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	      System.out.println("Please enter a score: ");
	      int score;
	      try (Scanner console = new Scanner(System.in)) {
	        score = console.nextInt();
	      }
	      if (score == 0 && score <= 50)
	      {
	        System.out.println("D");
	      }
	      else if (score >= 50 && score >= 70)
	      {
	        System.out.println("C");
	      }
	      else if (score <= 70 && score <= 80)
	      {
	        System.out.println("B");
	      }
	      else if (score >= 80)
	      {
	        System.out.println("A");
	      }    
	    // display Grade
	    System.out.println("Score ");
	    System.out.println(score);
	    System.out.println("will recieve ");
	    System.out.println(score);

	}

}
