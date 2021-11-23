//==================================
// Foundations of Computer Science
// Student: Deepak Kumar Sharma, ID: a1778228 
// S2/2020/Practical-04-part-01
//===================================
import java.util.Scanner;
public class Controller{
	// method to print welcome menu
	public static int menu(){
		Scanner input = new Scanner(System.in);	
		System.out.println("Welcome to the game: Rock-Paper-Scissors!");
		System.out.println("Please insert your choice");
		System.out.println("1. Play" + "\n2. Exit");
		int option = input.nextInt();
		return option;
	}
	public static void instruction(){
		// Important instructions for the human player
		System.out.println("********Important Instructions!*********");
		System.out.println("Please read the following instructions CAREFULLY before starting the game!");
		System.out.println("---------------------------------------------------------------------------------------");		
		System.out.println("1. Please insert your FIRST name only.");
		System.out.println("2. You are free to insert ANY name for the computer.");			
		System.out.println("3. Please insert only ONE of the moves(Rock or Paper or Scissors) with MATCHING letters.");
		System.out.println("4. The letters are NOT case-sensitive.\n"+
							"---------------------------------------------------------------------------------------");
		System.out.println("********************\n"+"Let's play the game!\n"+"********************");
	}
}