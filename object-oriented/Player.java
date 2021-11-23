//==================================
// Foundations of Computer Science
// Student: Deepak Kumar Sharma, ID: a1778228 
// S2/2020/Practical-04-part01
//===================================
// abstract class
abstract public class Player{
	private String name;
	// basic constructor
	Player(){
		this.name = "unknown";		
	}
	// parametrized constructor
	Player(String name){
		this.name = name;
	}
	// accessor 
	public String getName(){
		return this.name;
	}
	// mutator
	public void setName(String name){
		this.name = name;
	}

	// abstract methods
	abstract public String move(); // to draw a move from the players
	abstract public String readName(); // to read players name

}