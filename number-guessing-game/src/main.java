import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int guess;
        int randomNumber;
        int chance = 0;
        int min = 1;
        int max = 10;
        String difficulty;

        randomNumber = rand.nextInt(min ,max + 1);
        System.out.println("WELCOME TO GUESS NUMBER GAME!");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("================================");
        System.out.print("Please select difficulty! (hard, normal, easy) : ");
        difficulty = input.next().toLowerCase();

        switch (difficulty) {
            case "hard" -> chance = 1;
            case "normal" -> chance = 3;
            case "easy" -> chance = 5;
        }
        System.out.println("chance: " + chance);

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if( guess < randomNumber ) {
                System.out.println("The guess number is too low");
            }else if( guess > randomNumber ) {
                System.out.println("The guess number is too high");
            }else{
                System.out.println("You won! The number is " + randomNumber);
            }

            chance--;
            String remainingChance = (guess != randomNumber) ? "chance remaining is : " + chance : " ";
            System.out.println(remainingChance);

        }while( randomNumber != guess && chance != 0);

        if( chance == 0 ) {
            System.out.println("End Game! the number is " + randomNumber);
        }
    }
}
