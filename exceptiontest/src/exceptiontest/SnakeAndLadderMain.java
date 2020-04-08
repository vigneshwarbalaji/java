package exceptiontest;

import java.util.Scanner;


public class SnakeAndLadderMain 
{
		public static String loadGame()
		{
			SnakeAndLadderPosStorage snakeNladStorage = new SnakeAndLadderPosStorage();
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter player 1 name:");
			String playerOneName = s.nextLine();
			playerOneName.replaceAll("\\s", "");
			
			
				if(playerOneName == null||playerOneName.length() == 0)
				{
					//System.out.println("hi i am exception");
					try {
					throw new StringCannotBeNullException();
					}catch (StringCannotBeNullException e) {
						// TODO: handle exception
						playerOneName = e.enterAValidName();
					}
				}
				
				
				
			int playerOnePos = 1;
			//Players p1 = new Players(playerOneName,playerOnePos);
			
			System.out.println("Enter player 2 name:");
			String playerTwoName = s.nextLine();
			playerTwoName.replaceAll("\\s", "");
			
			if(playerTwoName == null||playerTwoName.length() == 0)
			{
				try {
					throw new StringCannotBeNullException();
					}catch (StringCannotBeNullException e) {
						// TODO: handle exception
						playerTwoName = e.enterAValidName();
					}
			}
			
			int playerTwoPos = 1;
			//Players p2 = new Players(playerTwoName,playerTwoPos);
			
			int currentPlayer = -1;
			int diceValue = 0;
			String playAgain = "y";
			
			do
		    {
		        System.out.println(currentPlayer==-1?"\n\n "+playerOneName:"\n\n "+playerTwoName);
		        System.out.println("Press y to roll Dice");
		        playAgain = s.next();
		        diceValue = snakeNladStorage.rollingDice();
		          
		          
		        if(currentPlayer == -1)
		        {
		            playerOnePos = snakeNladStorage.calculatePlayerPosition(playerOneName,playerOnePos,diceValue);
		            System.out.println(playerOneName+" had got a dice value: "+diceValue);
		            System.out.println(playerOneName+" is in position : " + playerOnePos);
		            System.out.println(playerTwoName+" is in position : " + playerTwoPos);
		            System.out.println("------------------");
		            if(snakeNladStorage.hasWon(playerOnePos))
		            {
		                System.out.println(playerOneName+" wins");
		                return "n";
		            }
		        }
		        else
		        {
		            playerTwoPos = snakeNladStorage.calculatePlayerPosition(playerTwoName,playerTwoPos,diceValue);
		            System.out.println(playerTwoName+" had got a dice value: "+diceValue);
		            System.out.println(playerOneName+" is in position : " + playerOnePos);
		            System.out.println(playerTwoName+" is in position : " + playerTwoPos);
		            System.out.println("------------------");
		            if(snakeNladStorage.hasWon(playerTwoPos))
		            {
		                System.out.println(playerTwoName+" wins");
		                return "n";
		            }
		        }
		          
		        currentPlayer= -currentPlayer;
		          
		    }while("y".equals(playAgain));
			return playAgain;
			
		}
		
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
	        
	        System.out.println("Welcome to Snakes and Ladders Game");

	        String play = "y";
	        System.out.println("Do you want to play the game: y or n");
	        play = s.next();

	        if(play.equals("y") || play.equals("Y"))
	        {
	            play = loadGame();
	        }
	        System.out.println("Thank you have a nice day");
		}
}
