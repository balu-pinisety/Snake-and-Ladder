public class SnakeLadder {
	
	public static void main(String[] args) {
		//Displaying Welcome Message
		System.out.println("Welcome to Snake & Ladder Simulator");
		//Constant
		int START_POSITION=0;
		int WIN_POSITION=100;
		int IS_SNAKE=1;
		int IS_LADDER=2;
		//Variable
		int playerPosition=START_POSITION;
		
		//Repeating till the Player reaches the winning position
		while(playerPosition<WIN_POSITION){
			//Using random to get Dice number 
			int diceNumber = (int) (Math.floor(Math.random()*10)%6)+1;
			System.out.println("Dice number is "+diceNumber);
			//Using random to check for option of No Play, Snake or Ladder
			int option = (int) Math.floor(Math.random()*10)%3;
			if (option == IS_LADDER) {
				System.out.println("Ladder for the Player");
				playerPosition+=diceNumber;
				//if player position moves above 100, then the player moves to previous position
				if (playerPosition>WIN_POSITION){
					playerPosition-=diceNumber;
				}
			} else if (option == IS_SNAKE) {
				System.out.println("Snake for the Player");
				playerPosition-=diceNumber;
				//if player position moves below 0, then the player restarts from Start Position
				if (playerPosition<0){
					playerPosition=START_POSITION;
				}
			} else {
				System.out.println("No play for the Player");
			}
			//Printing Player Postion
			System.out.println("Player position is now "+playerPosition);
		}
	}
}