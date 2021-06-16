public class SnakeLadder {
	
	public static void main(String[] args) {
		//Displaying Welcome Message
		System.out.println("Welcome to Snake & Ladder Simulator");
		//Constant
		int START_POSITION=0;
		//Using random to get Dice number 
		int diceNumber = (int) (Math.floor(Math.random()*10)%6)+1;
		System.out.println("Dice number is "+diceNumber);
	}
}