package lab7;

public class casinoMain extends Casino
{



    public static void main(String[] args) 
    {
        Status gameStatus = null;
        int myPoint = 0; 

        int sumOfDice = rollDice();

     
        switch (sumOfDice) {
            case 7: 
            	gameStatus = Status.WON;
                break;
            case 11:
                gameStatus = Status.WON;
                break;
            case 2: 
            	gameStatus = Status.LOST;
                break;
            case 3: 
            	gameStatus = Status.LOST;
                break;
            case 12:
                gameStatus = Status.LOST;
                break;
            case 4:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.println("Your point is" + myPoint);
                break;
            case 5:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.println("Your point is" + myPoint);
                break;
            case 6:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.println("Your point is" + myPoint);
                break;
            case 8:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.println("Your point is" + myPoint);
                break;
            case 9:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.println("Your point is" + myPoint);
                break;
            case 10:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.println("Your point is" + myPoint);
                break;
            default:
            	System.out.println("Wrong values");
            	break;
            	
                	
        }

       
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) {
                gameStatus = Status.WON; 
            } else if (sumOfDice == 7) {
                gameStatus = Status.LOST; 
            }
        }

       
        if (gameStatus == Status.WON) {
            System.out.println("Congratulations you win!");
        } else {
            System.out.println("Oh! you lose.");
        }

    }

}
