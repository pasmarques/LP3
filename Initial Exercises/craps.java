import java.util.Random;
import java.util.Scanner;

public class craps 
{   
    
    public static final boolean ONGAME=true;
    public static final boolean ENDGAME=false;

    public static void main(String[] args)
    {
        int flag=1;
        
        Random dice1 = new Random();
        Random dice2 = new Random();

        Scanner optionInput = new Scanner(System.in);

            do
            {
                int firstDice;
                int secondDice;

                firstDice= dice1.nextInt(6)+1;
                secondDice = dice2.nextInt(6)+1;

                //verifyGame(firstDice, secondDice);

                System.out.println("Do you want continue the game? Press 0 to exit 1 to continue):");
                flag=optionInput.nextInt();
            }while(flag==1);
    }

    public static boolean verifyGane(int firstDice, int secondDice)
    {
        int sumOfDices;

        sumOfDices=firstDice+secondDice;

        if((sumOfDices == 7) || (sumOfDices== 11))
        {
            System.out.format("Dice 1: %d Dice 2: %d\nPoints: %d\nYou win\n\n", firstDice, secondDice, sumOfDices);
            return ENDGAME;
        }

        else if(sumOfDices==4||sumOfDices==5||sumOfDices==6||sumOfDices == 8||sumOfDices==9||sumOfDices==10)
        { 
            System.out.format("Dice 1: %d Dice 2: %d\nPoints: %d\nInitializing stage 2\n\n", firstDice, secondDice, sumOfDices);
        
            int amountRolls= 1;

            while(ONGAME)
            {
           
                Random dice1OtherStage=new Random();
                Random dice2Othertage=new Random();

                int dice1OfOtherStages;
                int dice2OfOtherStages;

                dice1OfOtherStages=dice1OtherStage.nextInt(6)+1;
                dice2OfOtherStages=dice2Othertage.nextInt(6)+1;

                int sumOfDicesOtherStages =dice1OfOtherStages+dice2OfOtherStages;

                System.out.format("Dice 1: %d Dice 2: %d\nRoll %d: %d\n\n", dice1OfOtherStages, dice2OfOtherStages, amountRolls, sumOfDicesOtherStages);

                if((sumOfDicesOtherStages == 7))
                {
                    System.out.println("You lose :-(");
                    return ENDGAME;
                }
                else if(sumOfDices==sumOfDicesOtherStages)
                {
                    System.out.println("You win, congrats!");
                    return ENDGAME; 
                }
                    amountRolls+=1;
            }
        }
                else 
                {
                return ENDGAME;
                }
    }

}

    







            

