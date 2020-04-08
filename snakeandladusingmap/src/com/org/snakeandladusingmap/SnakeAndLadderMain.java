package com.org.snakeandladusingmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;



//Using hashmap reduces the lines of code required than arraylist
//Hashtable can also be used
//vector can also be used

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
	        System.out.println(playerName+" have got swallowed by a snake,get down");
	        playerPos = snakes.get(playerPos);
	    }
	      
	    if(null!=ladder.get(playerPos))
	    {
	        System.out.println(playerName+" have got swallowed by a snake,get down");
	        playerPos = ladder.get(playerPos);
	    }
	    
	    
	    /*
	    if(snakes.get(0) == playerPos)
	    {
	    	
	    	playerPos = 54;
	    }
	    else if(snakes.get(1) == playerPos)
	    {
	    	System.out.println(playerName+" have got swallowed by a snake,get down");
	    	playerPos = 55;
	    }
	    else if(snakes.get(2) == playerPos)
	    {
	    	System.out.println(playerName+" have got swallowed by a snake,get down");
	    	playerPos = 42;
	    }
	    else if(snakes.get(3) == playerPos)
	    {
	    	System.out.println(playerName+" have got swallowed by a snake,get down");
	    	playerPos = 2;
	    }
	    else if(snakes.get(4) == playerPos)
	    {
	    	System.out.println(playerName+" have got swallowed by a snake,get down");
	    	playerPos = 72;
	    }
	    
	    
	    if(ladder.get(0) == playerPos)
	    {
	    	System.out.println(playerName+" have got into a ladder,get up");
	    	playerPos = 25;
	    }
	    else if(ladder.get(1) == playerPos)
	    {
	    	System.out.println(playerName+" have got into a ladder,get up");
	    	playerPos = 40;
	    }
	    else if(ladder.get(2) == playerPos)
	    {
	    	System.out.println(playerName+" have got into a ladder,get up");
	    	playerPos = 85;
	    }
	    else if(ladder.get(3) == playerPos)
	    {
	    	System.out.println(playerName+" have got into a ladder,get up");
	    	playerPos = 90;
	    }
	    else if(ladder.get(4) == playerPos)
	    {
	    	System.out.println(playerName+" have got into a ladder,get up");
	    	playerPos = 69;
	    }
	    */
	    
	    return playerPos;
	}
	
	//Dice
	public static int rollingDice()
	{
	    int n = 0;
	    Random r = new Random();
	    n=r.nextInt(7);
	    
	    if(n == 0)
	    {
	    	return 1;
	    }
	    else
	    {
	    	return n;
	    }
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
			
			do
		    {
		        System.out.println(currentPlayer==-1?"\n\n "+playerOneName:"\n\n "+playerTwoName);
		        System.out.println("Press y to roll Dice");
		        playAgain = s.next();
		        diceValue = snakeNladMain.rollingDice();
		          
		          
		        if(currentPlayer == -1)
		        {
		            playerOnePos = snakeNladMain.calculatePlayerPosition(playerOneName,playerOnePos,diceValue);
		            
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
		            playerTwoPos = snakeNladMain.calculatePlayerPosition(playerTwoName,playerTwoPos,diceValue);
		            System.out.println(playerOneName+" is in position : " + playerOnePos);
		            System.out.println(playerTwoName+" is in position : " + playerTwoPos);
		            System.out.println("------------------");
		            if(snakeNladMain.hasWon(playerTwoPos))
		            {
		                System.out.println(playerTwoName+" wins");
		                return "n";
		            }
		        }
		          
		        currentPlayer= -currentPlayer;
		          
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

	        if(play.equals("y") || play.equals("Y"))
	        {
	            play = loadGame();
	        }
	        System.out.println("Thank you have a nice day");
		}
}
