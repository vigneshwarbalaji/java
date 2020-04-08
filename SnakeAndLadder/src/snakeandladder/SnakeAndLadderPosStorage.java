package snakeandladder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SnakeAndLadderPosStorage 
{
	final static int WIN = 100; 
	
	static List<Integer>snakes = new ArrayList<Integer>(5);
	static List<Integer>ladder = new ArrayList<Integer>(5);
	
	{
		snakes.add(90);
		snakes.add(70);
		snakes.add(52);
		snakes.add(25);
		snakes.add(95);
		
		ladder.add(6);
        ladder.add(11);
        ladder.add(60);
        ladder.add(46);
        ladder.add(17);

	}
	
	public int rollingDice()
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
	
	public boolean hasWon(int playerPos)
	{
		return(WIN == playerPos);
	}
	
	public static int calculatePlayerPosition(String playerName,int playerPos, int diceValue)
	{
	    playerPos = playerPos + diceValue;
	      
	    if(playerPos > WIN)
	    {
	        playerPos = playerPos - diceValue;
	        return playerPos;
	    }
	      /*
	    if(null!=snake.get(player))
	    {
	        System.out.println("swallowed by snake");
	        player= snake.get(player);
	    }
	      
	    if(null!=ladder.get(player))
	    {
	        System.out.println("climb up the ladder");
	        player= ladder.get(player);
	    }*/
	    
	    if(snakes.get(0) == playerPos)
	    {
	    	System.out.println(playerName+" have got swallowed by a snake,get down");
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
	    
	    
	    return playerPos;
	}
}
