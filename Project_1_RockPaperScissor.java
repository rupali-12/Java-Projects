// **************** project 1(Java) Rock scissor paper game ***************************** 
// take input from user and from computer 
// decides comditions for win , lose or draw 

import java.util.Scanner;
public class Project_1_RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("You are welcomed in Rock paper Scissor Game!!!!!");
        System.out.println("Enter: 0 for Rock\t1 for Scissor\t2 for Paper");
        int nTrial=0;
        int userScore=0, CompScore=0;
        System.out.println("User's Turn");
        while(nTrial != 5){
        int userInput = sc.nextInt();
        switch(userInput){
            case 0->System.out.println("You choosed Rock");
            case 1->System.out.println("You choosed Scissor");
            case 2->System.out.println("You choosed Paper");
            default->System.out.println("Invalid choice");
        }
        System.out.println("Now, Computer's Turn");
        int compInput = sc.nextInt();
        switch(compInput){
            case 0->System.out.println("Computer choosed Rock");
            case 1->System.out.println("Computer choosed Scissor");
            case 2->System.out.println("Computer choosed Paper");
            default->System.out.println("Invalid choice");
        }
            if((userInput == 0 && compInput == 1) || (userInput==1 && compInput==2) || (userInput==2 && compInput==0)){
                System.out.println("You get 1 point");
                userScore++; CompScore--;
            }
            else if((userInput == 1 && compInput == 0) || (userInput==2 && compInput==1) || (userInput==0 && compInput==2)){
                System.out.println("You lose 1 point");
                userScore--; CompScore++;
            }
            else{
                System.out.println("Draw Trial");
                }
            nTrial++;
        }
        // check for Score 
        if(userScore> CompScore){
            System.out.println("Congratulations, you win the Game..");
        }
        else if(userScore< CompScore){
        System.out.println("You Lose the Game, Better Luck Next Time..");
        }
        else{
            System.out.println("Game Draw");
        }
    }
}
