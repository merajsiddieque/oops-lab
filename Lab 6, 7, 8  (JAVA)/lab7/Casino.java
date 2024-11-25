package lab7;
import java.util.Random;
public class Casino 
{
	

	
	    enum Status { CONTINUE, WON, LOST }

	    public static int rollDice() {
	        Random random = new Random();
	        int die1 = 1 + random.nextInt(6);
	        int die2 = 1 + random.nextInt(6); 
	        int sum = die1 + die2;
	        System.out.println("You rolled dice"+ die1 + "+" + die2 + "=" + sum);
	        return sum;
	    }
}

