//==================================
// Foundations of Computer Science
// Student: Deepak Kumar Sharma, ID: a1778228 
// S2/2020/Practical-04-part-01
//===================================
// this class controls the flow of the RPS game.
import java.util.Scanner;
public class Referee {

	public String gameResult(){
		Scanner input = new Scanner(System.in);
		Player p1 = new Human();    //| Polymorphism
		Player p2 = new Computer(); //|
		// keep asking the user move until all the considerations are met
		String result = "";
		boolean action = true;
		while(action==true){			
			// printing the instructions for the user by calling method
			Controller.instruction();

			// reading players name
			System.out.print("Please insert your first name: ");
			p1.setName(p1.readName()); 
			System.out.println("Hello " + p1.getName() + "! You are going to play this game with a computer.");
			System.out.print("please insert your chosen computer player name: ");
			p2.setName(p2.readName());
			System.out.print("*************************************************	");

			// calling players moves 			
			System.out.print("\nPlease insert your move now: ");
			String humMove = p1.move(); 					
			String compMove = p2.move();

			// reporting if given considerations are met and asking the user to follow the instruction
			if((!humMove.equalsIgnoreCase("Rock"))&&(!humMove.equalsIgnoreCase("Paper"))&&(!humMove.equalsIgnoreCase("Scissors"))
			 	|| (!compMove.equalsIgnoreCase("Rock"))&&(!compMove.equalsIgnoreCase("Paper"))&&(!compMove.equalsIgnoreCase("Scissors"))){
			 	System.out.println("wrong input format! Please follow the instructions and try again\n");
			 	action = true;
			}
			else{
			    action = false;				
				
				if (humMove.equalsIgnoreCase(compMove)){
			    	result = "Tie";
			    }
			    // if p1(human) move is Rock         
			    else if (humMove.equalsIgnoreCase("Rock")){
			    	if(compMove.equalsIgnoreCase("Paper")){
			    		result = p2.getName() + " won the game";	    	
			    	}
			    	else{
			    		result = p1.getName() + " won the game";  	    			
			    	}
			    }
			    // if p1(human) move is Paper         
			    else if (humMove.equalsIgnoreCase("Paper")){
			    	if(compMove.equalsIgnoreCase("Scissors")){
			    		result = p2.getName() + " won the game";	    	
			    	}
			    	else{
			    		result = p1.getName() + " won the game";   	    			
			    	}
			    }
			    // if p1(human) is Scissor    
			    else{
			    	if(compMove.equalsIgnoreCase("Rock")){
			    		result = p2.getName() + " won the game";    		
			    	}
			    	else{
			    		result = p1.getName() + " won the game";  	    		
			    	}
			    } 
			    // printing game result 
			    System.out.println("------------------------------");
			    System.out.println(p1.getName() + " played " + humMove );
			    System.out.println(p2.getName() + " played " + compMove);		    
			  	
			} 
		}
		return result;
	}	
}