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
		int player1Position=START_POSITION;
		int player2Position=START_POSITION;
		int diceCount=0;
		int turn=1;
		int option=0;
		
		//Repeating till the Player reaches the winning position
		while(player1Position<WIN_POSITION && player2Position<WIN_POSITION){
			//Changing the Player turn
			if (option != IS_LADDER){
				++turn;
			}
			System.out.println("Player"+(turn%2+1)+"'s turn now");
			//Assigning the player1 or player2 position to common variable 'playerPosition'
			if (turn%2+1==1){
				playerPosition=player1Position;
			} else {
				playerPosition=player2Position;
			}
			//incremanting the dice count
			++diceCount;
			//Using random to get Dice number 
			int diceNumber = (int) (Math.floor(Math.random()*10)%6)+1;
			System.out.println("Dice number is "+diceNumber+" for Player"+(turn%2+1));
			//Using random to check for option of No Play, Snake or Ladder
			option = (int) Math.floor(Math.random()*10)%3;
			if (option == IS_LADDER) {
				System.out.println("Ladder for the Player"+(turn%2+1));
				playerPosition+=diceNumber;
				//if player position moves above 100, then the player moves to previous position
				if (playerPosition>WIN_POSITION){
					playerPosition-=diceNumber;
				}
			} else if (option == IS_SNAKE) {
				System.out.println("Snake for the Player"+(turn%2+1));
				playerPosition-=diceNumber;
				//if player position moves below 0, then the player restarts from Start Position
				if (playerPosition<0){
					playerPosition=START_POSITION;
				}
			} else {
				System.out.println("No play for the Player"+(turn%2+1));
			}
			//Printing Player Postion
			System.out.println("Player"+(turn%2+1)+" position is now "+playerPosition);
			//Assigning the 'playerPosition' to the individual player
			if (turn%2+1==1){
				player1Position=playerPosition;
			} else {
				player2Position=playerPosition;
			}
		}
		System.out.println("\nPlayer"+(turn%2+1)+" is winner\nDice was rolled "+diceCount+" times to reach the Winning position");
	}
}