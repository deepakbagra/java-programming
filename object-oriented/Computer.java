//==================================
// Foundations of Computer Science
// Student: Deepak Kumar Sharma, ID: a1778228 
// S2/2020/Practical-04-part-01
//===================================
// This class deminstrates inheritance 
import java.util.*;
public class Computer extends Player{	
	// @)Override method to draw a random move (Rock, Paper or Scissor)
	public  String move(){		
		
		Random ran = new Random();
		String move = "";		
		// random ordered strings (Rock, Paper or Scissor) generated based on randum numbers 		
		int num = ran.nextInt(3); 
		if(num==0){
			move = "Rock";
		}
		else if(num==1){
			move = "Paper";
		}
		else{
			move = "Scissors";
		}	
	
		return move; // retunring randum ordered string
	}

	// @Override method to read Computer player name 
	public String readName(){
		Scanner input = new Scanner(System.in);	
		String move = input.next();
		// convert input string into a string with first letter in capital and rest in lower case
		move = move.toLowerCase();
		move = move.substring(0, 1).toUpperCase() + move.substring(1);
		return move;
	}

}



		
	


	



	

