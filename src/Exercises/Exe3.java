// Guess the number using oop


package Exercises;
import java.util.Scanner;
import java.util.Random;

class Game
{
    public int number;
    public int input_number;

    public int getNoofGuess() {
        return noofGuess;
    }

    public void setNoofGuess(int noofGuess) {
        this.noofGuess = noofGuess;
    }

    public int noofGuess = 0;

    Game()
    {
        Random rd = new Random();
        this.number = rd.nextInt(100);
    }
    public void take_input(){

        System.out.println("Guess the Number");

        Scanner sc = new Scanner(System.in);

        input_number = sc.nextInt();

    }
    boolean is_correct()
    {
        noofGuess++;
         if(input_number == number)
         {
             System.out.printf("You Guess the %d number and You guessed it in %d attempts",number,noofGuess);
             return true;
         }
         else if(input_number>number)
         {
             System.out.println("Number is too high....");
         }
         else  if(input_number<number)
         {
             System.out.println("Number is too low....");
         }
             return false;

    }

}

public class Exe3 {
    public static void main(String[] args) {

        Game gb = new Game();

        boolean b = false;

        while (!b)
        {
            gb.take_input();
            b = gb.is_correct();

        }
    }
}
