import java.util.Scanner;
//import Scanner from library

public class QuarterbackRating {
  public static void main(String[] args) {
	  // Create a Scanner
	  Scanner input = new Scanner(System.in);
	  
	  // Prompt user to enter the ATT of this player
	  System.out.print("Please enter numebr of passing attempts of this player: ");
	  double ATT = input.nextDouble();
	  
	  // Prompt user to enter the COMP of this player
	  System.out.print("Please enter number of completions of this player: ");
	  double COMP = input.nextDouble();
	  
	  // Prompt user to enter the YDS of this player
	  System.out.print("Please enter passing yields of this player: ");
	  double YDS = input.nextDouble();
	  
	  // Prompt user to enter the TD of this player
	  System.out.print("Please enter touchdown passes of this player: ");
	  double TD = input.nextDouble();
	  
	  // Prompt user to enter the INT of this player
	  System.out.print("Please enter interceptions of this player: ");
	  double INT = input.nextDouble();
	  
	  // To get the expression of a
	  double a = ((COMP / ATT) - 0.3) * 5;
	  
	  // To get the expression of b
	  double b = ((YDS / ATT) - 3) * 0.25;
	  
	  // To get the expression of c
	  double c = (TD / ATT) * 20;
	  
	  // To get the expression of d
	  double d = 2.375 - ((INT / ATT) * 25);
	  
	  // To get the QB rating of this player
	  double QBRating = ((a + b + c +d) / 6) * 100;
	  
	  // To display the result to user 
	  System.out.println("The QB rating of this player is " + QBRating);
			  
  }
}
