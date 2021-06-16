public class SnakeLadder {
	
	public static void main(String[] args) {
		//Displaying Welcome Message
		System.out.println("Welcome to Snake & Ladder Simulator");
		//Constant
		int START_POSITION=0;
		int IS_SNAKE=1;
		int IS_LADDER=2;
		int playerPosition=START_POSITION;
		//Using random to get Dice number 
		int diceNumber = (int) (Math.floor(Math.random()*10)%6)+1;
		System.out.println("Dice number is "+diceNumber);
		//Using random to check for option of No Play, Snake or Ladder
		int option = (int) Math.floor(Math.random()*10)%3;
		if (option == IS_LADDER) {
			System.out.println("Ladder for the Player");
			playerPosition+=diceNumber;
			System.out.println("Player position is now "+playerPosition);
		} else if (option == IS_SNAKE) {
			System.out.println("Snake for the Player");
			playerPosition-=diceNumber;
			System.out.println("Player position is now "+playerPosition);
		} else {
			System.out.println("No play for the Player");
		}
	}
}