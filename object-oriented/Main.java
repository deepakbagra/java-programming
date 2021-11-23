//==================================
// Foundations of Computer Science
// Student: Deepak Kumar Sharma, ID: a1778228 
// S2/2020/Practical-04-part-01
//===================================
/* This project contains 5 class files in adidtion to the Main class file.
One Parent class(Player)>> Abstract class
		>one private attribute (player name)
		>Two abstract methods> 1. move():-to draw players move 2. readName():- to read their names
Two child classes>>
	1. Human()>> Override two abstract methods>
		 (a) move()>> user input to read the move of human player(Rock/Paper/Scissors) and return the same
		 (b) readName()>> user input to read the name of human player and return the same
	2. Computer()>>Override two abstract methods>
		 (a) move()>> generate random move of computer(Rock/Paper/Scissors) and return the same
		 (b) readName()>> user input to read the name of computer player and return the same
One Controller() class>> implement 2 static methods 
		 (a) menu()>> to print the welcome menu asking the choice to play or exit
		 (b) instruction()>> to print instructions(considerations) for the user to follow before starting the game
One Referee() class>> One method>> gameResult() - to delcare the result of the game
		>controls the flow of the game 
			> using Polymorphism to instantiate object of child classes from the parent class
			> calling instruction() method for the user to read and follow them 
			> calling readName() and move() methods to read players name and their moves
			> if inserted move is not in the given format, error message will be pop-up asking user to insert again 
			> comparing their moves and returning the result as string
Main() class>> Executable main() method		
		> give choice to user to play or exit the game by calling menu() method from Controller class
		> instantiate referee object and calling the gameResult() method to declare the result
		> use of Try-Catch to handle exceptions and printing constomised error message for wrong input type
		> keep asking user until the correct input type is inserted  */
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		boolean getInput = true;
		// keep playing the game until the user chooses to exit
		while(getInput){
			Scanner input = new Scanner(System.in);	
			// try-catch to handle exceptions 
			try{
				int option = Controller.menu(); // taking option from the player	
				if(option == 1){					
					
					//instantiate a referee object
					Referee referee = new Referee();		
					//calling referee decision 
					String result = referee.gameResult();
					System.out.println("------------------------------");
					System.out.println("Referee decision: " + result + "!");
					System.out.println("------------------------------");
				}
				else{
					getInput = false;
					System.out.println("Thank you for playing the RPS game! Good-bye.");
				}
			}catch(Exception e){
				System.out.println("Wrong input! Please try again.\n");
				
			}
		}
	}
}
