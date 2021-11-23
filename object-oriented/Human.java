//==================================
// Foundations of Computer Science
// Student: Deepak Kumar Sharma, ID: a1778228 
// S2/2020/Practical-04-part-01
//===================================
// This class deminstrates inheritance 
import java.util.Scanner;
public class Human extends Player{

	// @Override method for human move (Rock, Paper or Scissor)
	public String move(){
		Scanner input = new Scanner(System.in);	
		String move = input.next();
		// convert input string into a string with first letter in capital and rest in lower case
		move = move.toLowerCase();
		move = move.substring(0, 1).toUpperCase() + move.substring(1);
		return move;
	}
	// @Override method to read human player name
	public String readName(){
		Scanner input = new Scanner(System.in);			
		return input.next();
	}
}