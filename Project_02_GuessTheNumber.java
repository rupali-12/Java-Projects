// *********** Guess the number Game >>>> ************************************** 

import java.util.Random;
import java.util.Scanner;

class Game {
    public int UserInput, randomNumber, count = 1;
    private int noOfGuesses;

    public int getGuesses() {
        return noOfGuesses;
    }

    public void setGuesses(int g) {
        noOfGuesses = g;
    }

    Game() {
        Random random = new Random();
        randomNumber = random.nextInt(100);
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        UserInput = sc.nextInt();
    }

    public boolean isCorrectNumber() {
        if (UserInput == randomNumber) {
            System.out.println("You guessed correct in " + count + " attempts");
            return true;
        } else if (UserInput > randomNumber) {
            System.out.println("Lower Number Please");
        } else {
            System.out.println("Higher Number Please");
        }
        return false;
    }
}

public class Project_02_GuessTheNumber {
    public static void main(String[] args) {
        Game G1 = new Game();
        G1.setGuesses(10);
        boolean b = false;
        while (!b) {
            G1.takeUserInput();
            b = G1.isCorrectNumber();
            G1.count++;
        }
        if (G1.count <= G1.getGuesses()) {
            System.out.println("Congrats, You Win the Game");
        } else {
            System.out.println("Sorry, You Lose the Game");
        }
    }
}
