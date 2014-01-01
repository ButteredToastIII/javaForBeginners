/*
 * Java For Beginners Episode 8
 * Loops: While, For, and Do While loops
 */

//import the Random class
import java.util.Random;

//Obligatory Class Initialization
public class loops {
	//Also Obligatory Main Statement
	public static void main(String args[]){
		//Variables
		int die1 = 0;
		int die2 = 0;
		
		//Initialize Random Object
		Random myRandom = new Random();
		
		//While Loop
		//Basic formula:  while(conditions){Code to execute}
		while(die1 + die2 != 12){
			System.out.println("The dice do not equal 12");
			//You must be really careful not to initiate an infinite loop
			
			die1 = myRandom.nextInt(6) + 1;
			die2 = myRandom.nextInt(6) + 1;
			
			//You can next loops in loops
			/*while(die1 + die2 != 11){
			 *	System.out.println("The dice also do not equal 11");
			 *	
			 *	die1 = myRandom.nextInt(6) + 1;
			 *	die2 = myRandom.nextInt(6) + 1;
			 *}
			 */
		}
		
		//For Loop
		//Basic Formula:  for(varType varName = varVal; varName <= value; varName++)
		for(int i = 1; i <= 10; i++){
			System.out.println("This is loop: " + i);
		}
		
		//Do While Loop
		//Formula for a Do While: do{Code to execute} while();
		do{
			System.out.println("The dice do not equal 12");
			
			die1 = myRandom.nextInt(6) + 1;
			die2 = myRandom.nextInt(6) + 1;
		} while(die1 + die2 != 12);
	}
}
