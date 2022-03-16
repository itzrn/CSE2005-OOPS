package Harry_Java_Tutorial.Exercises;

import java.util.Random;
import java.util.Scanner;

class GameGuessNumber{
    private final int randomNumber;

    public GameGuessNumber(){
        Random random=new Random();
        randomNumber=random.nextInt(5);
//        System.out.println(randomNumber);
    }
    public int takeUserInput(){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        return a;
    }
    public boolean isCorrectNumber(int num1){
        boolean correctOrNot;
        int num = randomNumber;
        if(num ==num1){
            correctOrNot=true;
        }
        else if(num >num1){
            correctOrNot=false;
            System.out.print("Enter a bigger number ---> ");
        }
        else {
            correctOrNot=false;
            System.out.print("Enter a Smaller Number ---> ");
        }
        return correctOrNot;
    }
}
public class T43_Exercise_03 {
    public static void main(String[] args) {
        /*
        Que --->
        Create a class Game, Which allows a user to play
        "Guess the number" game once.
        Game should have the following methods
        1. Constructor() to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is tue
        use properties such as
        4.getters and setter for noOfGuesses(integer rhega), etc to get this task done
         */
        Scanner cs = new Scanner(System.in);
        GameGuessNumber GGN = new GameGuessNumber();
        int playOnceMore = 1;
        while (playOnceMore > 0) {
            System.out.print("Enter Your guessed Number between 1 to 5---> ");
            boolean a = false;
            int count = 0;
            while (!a) {
                a = GGN.isCorrectNumber(GGN.takeUserInput());
                count += 1;
            }
            System.out.format("You guessed the number in %d times", count);
            System.out.println();
            System.out.print("\nTo play the Game Once more Enter '1'(One) or to End the Game Enter '0'(Zero) ---> ");
            playOnceMore = cs.nextInt();
        }
    }
}