/**
 * Rock Paper and scissor game
 */
package Exercises;

import java.util.Random;// Use to Generate random number
import java.util.Scanner;

public class Exe2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random ran = new Random();

        int com_score = 0;
        int player_score = 0;
        int n = 1;

        System.out.println("*********   Welcome to Rock,Paper and Scissor game  *********");
        while (n <= 5) {
            int com = ran.nextInt(3);
            com = com + 1;


            System.out.println("1 for Rock\n2 for Paper\n3 for scissor ");
            int player = s.nextInt();

            if ((player == 1 && com == 2) || (player == 2 && com == 3) || (player == 3 && com == 1)) {
                com_score += 1;
            } else if (player == com) {
                com_score += 1;
                player_score += 1;
            } else if (player > 3 || player == 0)
                System.out.println("Invalid Choice");
            else {
                player_score += 1;
            }

            System.out.println("Your Score is " + player_score);
            System.out.println("Computer Score is " + com_score);
            System.out.println();
            System.out.println();

            n++;
        }



        if (player_score > com_score)
            System.out.println("You are a winner");
        else if (player_score == com_score)
            System.out.println("It's Draw");
        else
            System.out.println("Computer is Winner");
    }
}
