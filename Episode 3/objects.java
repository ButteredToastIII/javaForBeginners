/*
 * This is the source code for Episode 3 of Java for Beginners
 * See the tutorials and other videos here: http://www.youtube.com/user/ButteredToastIII
 * You can view or download this code at butteredgaming.com/source
 */

//Above the class (outside of it) you must import the classes you want to use.
import java.util.Scanner;
//Another class that's used a lot is the Random class.
import java.util.Random;

//A class called objects based on the title of the episode
//Everything in Java is case-sensitive.  For example:  The public keyword must be lower-case and the String variable type must be capitalized
public class objects {
	//Obligatory Main Statement
	public static void main(String args[]){
		/* Indentation doesn't really make a difference, but it makes it easier for you and anyone else viewing your code to read it.
		 * Indentation makes it easier to tell where blocks of code start and stop
		 */
		
		//Create a String Variable
		String copy = "";
		//Create an integer Variable
		int randomInt = 0;
		
		//Create a Scanner object
		Scanner myScanner = new Scanner(System.in);
		//Create a Random object
		Random myRandom = new Random();
		
		//Use the myScanner object
		System.out.print("Input a line to copy: ");
		copy = myScanner.nextLine();
		System.out.println(copy);
		
		//Use the myRandom object
		randomInt = myRandom.nextInt(10) + 1;
		System.out.println("Random Number: " + randomInt);
	}
}
