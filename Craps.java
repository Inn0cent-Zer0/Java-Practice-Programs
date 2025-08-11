
import java.util.Random;
public class Craps {
    private final Random RandomNumbers = new Random();
    private enum Status{CONTINUE,WON,LOST}

    private final static int SNAKE_EYES=2;
    private final static int TREY=3;
    private final static int SEVEN=7;
    private final static int YO_LEVEL =11;
    private final static int BOX_CARS=12;
    public void play()
    {
        int myPoint=0;
        Status gameStatus;
        int sumOfDice= RollDice();
        switch (sumOfDice) {
            case SEVEN, YO_LEVEL -> gameStatus = Status.WON;
            case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d\n", myPoint);
            }
        }
        while(gameStatus==Status.CONTINUE)
        {
            sumOfDice=RollDice();
            if(sumOfDice==myPoint)
            {
                gameStatus=Status.WON;
            }
            else
                if(sumOfDice==SEVEN)
                {
                    gameStatus= Status.LOST;
                }
        }
        if(gameStatus==Status.WON)
        {
            System.out.println("Player wins");
        }
        else
        {
            System.out.println("Player loses");
        }
    }
    public int RollDice()
    {
        int die1=1+RandomNumbers.nextInt(6);
        int die2=1+RandomNumbers.nextInt(6);
        int sum=die1+die2;
        System.out.printf("Player rolled %d + %d = %d\n",die1,die2,sum);
        return sum;
    }
}

