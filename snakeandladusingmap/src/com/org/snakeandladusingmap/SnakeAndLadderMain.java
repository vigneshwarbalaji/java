package com.org.snakeandladusingmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;



//Using hashmap reduces the lines of code required than arraylist
//Hashtable can also be used
//vector can also be used

//Changes given
//appropriate data structure needs to be used
//Game must need to start only when 1 is thrown
//1 r 5 r 6 when thrown player must need to get another chance to throw the dice

public class SnakeAndLadderMain 
{
	
	//Snake and ladder Position storage
	final static int WIN = 100; 
	
	static Map<Integer,Integer>snakes = new HashMap<Integer,Integer>(5);
	static Map<Integer,Integer>ladder = new HashMap<Integer,Integer>(5);
	
	{
		snakes.put(90,54);
		snakes.put(70,55);
		snakes.put(52,42);
		snakes.put(25,2);
		snakes.put(95,72);
		
		ladder.put(6,25);
        ladder.put(11,40);
        ladder.put(60,85);
        ladder.put(46,90);
        ladder.put(17,69);

	}
	
	//calculating player position
	public static int calculatePlayerPosition(String playerName,int playerPos, int diceValue)
	{
		
	    playerPos = playerPos + diceValue;
	      
	    if(playerPos > WIN)
	    {
	        playerPos = playerPos - diceValue;
	        return playerPos;
	    }
	      
	    if(null!=snakes.get(playerPos))
	    {
	        System.out.println(playerName+" had got swallowed by a snake,get down");
	        playerPos = snakes.get(playerPos);
	    }
	      
	    if(null!=ladder.get(playerPos))
	    {
	        System.out.println(playerName+" had got a ladder,get up");
	        playerPos = ladder.get(playerPos);
	    }
	    
	    return playerPos;
	}
	
	//Dice
	public static int rollingDice()
	{
	    Random random = new Random();
		
		int max = 6;
		int min = 1;
		
		int randomNum = random.nextInt((max - min) + 1) + min;
		
		return randomNum;
	}
	
	/*public static String gamePlay()
	{
	
		return playAgain;
	}*/
	
	public static int shiftInChance(int diceValue,int currentPlayer)
	{
		if(diceValue != 1 && diceValue != 5 && diceValue != 6)
        {
        	currentPlayer= -currentPlayer;
        }
		return currentPlayer;
	}

	
	//winning user
	public boolean hasWon(int playerPos)
	{
		return(WIN == playerPos);
	}
	
	//Game
		public static String loadGame()
		{
			SnakeAndLadderMain snakeNladMain = new SnakeAndLadderMain();
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter player 1 name:");
			String playerOneName = s.next();
			int playerOnePos = 1;
			//Players p1 = new Players(playerOneName,playerOnePos);
			
			System.out.println("Enter player 2 name:");
			String playerTwoName = s.next();
			int playerTwoPos = 1;
			//Players p2 = new Players(playerTwoName,playerTwoPos);
			
			int currentPlayer = -1;
			int diceValue = 0;
			String playAgain = "y";
			boolean firstPlayersFirstThrow = false;
			boolean secondPlayersFirstThrow = false;
			
			do
		    {
		        System.out.println(currentPlayer==-1?"\n\n "+playerOneName:"\n\n "+playerTwoName);
		        System.out.println("Press y to roll Dice");
		        playAgain = s.next();
		        diceValue = snakeNladMain.rollingDice();
		            
			        if(currentPlayer == -1)
			        {
			        	if(diceValue == 1||firstPlayersFirstThrow == true)
			        	{
			        		firstPlayersFirstThrow = true;
			        		playerOnePos = snakeNladMain.calculatePlayerPosition(playerOneName,playerOnePos,diceValue);
			        	}
			        	
			        	System.out.println(playerOneName+" had got a dice value: "+diceValue);
			            System.out.println(playerOneName+" is in position : " + playerOnePos);
			            System.out.println(playerTwoName+" is in position : " + playerTwoPos);
			            System.out.println("------------------");
			            if(snakeNladMain.hasWon(playerOnePos))
			            {
			                System.out.println(playerOneName+" wins");
			                return "n";
			            }
			        }
			        else
			        {
			        	if(diceValue == 1||secondPlayersFirstThrow == true)
			        	{
			        		secondPlayersFirstThrow = true;
			        		playerTwoPos = snakeNladMain.calculatePlayerPosition(playerTwoName,playerTwoPos,diceValue);
			        	}
			        	
			        	System.out.println(playerTwoName+" had got a dice value: "+diceValue);
			            System.out.println(playerOneName+" is in position : " + playerOnePos);
			            System.out.println(playerTwoName+" is in position : " + playerTwoPos);
			            System.out.println("------------------");
			            if(snakeNladMain.hasWon(playerTwoPos))
			            {
			                System.out.println(playerTwoName+" wins");
			                return "n";
			            }
			        }
			        
			        currentPlayer = shiftInChance(diceValue, currentPlayer);
			        
			        /*if(diceValue != 1 && diceValue != 5 && diceValue != 6)
			        {
			        	currentPlayer= -currentPlayer;
			        }*/
			          
			    }while("y".equals(playAgain));
			    
			    
			return playAgain;
			
		}
		
		
		//main
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
	        
	        System.out.println("Welcome to Snakes and Ladders Game");

	        String play = "y";
	        System.out.println("Do you want to play the game: y or n");
	        play = s.next();

	        if(play.equalsIgnoreCase("y"))
	        {
	            play = loadGame();
	        }
	        System.out.println("Thank you have a nice day");
		}
}
