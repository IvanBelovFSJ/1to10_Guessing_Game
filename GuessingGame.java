import java.util.Scanner;
import java.util.Random;
/* I have imported only needed packages / classes
 * required for the execution of this program.

/* Assignment_11_GuessingGame_Modification.java is written
 * with the purpose of understanding
 *
 * and practicing different loop scenarios.
 * In this example we observe an if - else loop
 * This Java program will pick a random number from 1 to 10,
 * a user has to guess a number picked by a program.
 *
 * Algorithm for this code was found on the dedicated
 * leap year wiki page.
 *
 * Author: Ivan Belov
 * Student ID: T00637195
 * Course: COMP 1130 - 03
 */

public class GuessingGame
{

 public static void main (String[] args)
 {

  final int RANGEVAL = 10; // Initializing the number limit to : 1 to 10
  int computerSelection = 0;
  int mySelection = 0;
  byte guessCount = 0;
  String nextGame;

  @SuppressWarnings("resource")
  Scanner myGuessScanner = new Scanner (System.in); // Creating an instance of a scanner object
  Random numberGenerator = new Random(); // Creating an instance of a random object
  
  String welcomeMessage = " \n \t Hello and Welcome to the Guessing Game! ";
  System.out.print(welcomeMessage);
  computerSelection = numberGenerator.nextInt(RANGEVAL) + 1;
  
  do
  {
	  do
	  {
		  String instructions = " \n \t Enter a number 1 to 10 to see if a program picked the same number: ";

		  System.out.print(instructions);
		  computerSelection = numberGenerator.nextInt(RANGEVAL) + 1;
		  mySelection = myGuessScanner.nextInt();

		  /* two above lines of code
		   * represent declaration for the number
		   * picked by a user and a program algorithm
		   */
		  
		  String correctGuess = " \n \t You guessed correctly. Computer also selected number : " + mySelection + ".";
		  
		  String wrongGuess = " \n \t You guessed wrong. Computer selected : " + computerSelection + ".";
		  
		  while ( mySelection < 0 || mySelection > 10 )
		  {
		   System.out.print(" \n \t Number selected is out of range. Enter it again.");
		   mySelection = myGuessScanner.nextInt();
		  }
		  
		  if ( mySelection == computerSelection )
		 {
		  System.out.print(correctGuess);
		  break;
		 }
		  else
		 {
		  System.out.print(wrongGuess);
		 }
		  guessCount++;
		  System.out.println(" \n \t You have played : " + guessCount + " game(s).");
		  
	  }
	  while(guessCount <=4 );
	  {
		  System.out.println(" \n \t End of the game.");
	  }
	  guessCount = 0;
	  
	  System.out.print(" \n \t Want to play again? ( y / n ) : ");
	  
	  nextGame = myGuessScanner.next();
	  
	  if (Character.toLowerCase(nextGame.charAt(0)) == 'n')
	  {
		  System.out.print(" \n \t Shutting Down.");
		  nextGame = null;
		  break;
	  }
  }
  while (true); 
  // infinite loop which brakes on 'n' for doN't want to play another game
  {
	  
  }
  
 } // End of main
} // End of class