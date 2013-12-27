/*
 * Episode 5 of Java For Beginners
 * A more in-depth look at variables
 * Looking at char and boolean
 * We will also look at comparison operators
 */

//Import Scanner class
import java.util.Scanner;

//Obligatory Class Initialization
public class characters{
	//Also obligatory main statement
	public static void main(String args[]){
		//Initialize Scanner object
		Scanner myScanner = new Scanner(System.in);
		
		//Char type
		//Formula: variableType(char) variableName = 'variableValue(1 character)'
		char var1 = 'b';
		//char can store numbers
		char var3 = '3';
		
		//you can make value in a char uppercase using a method
		char var2 = Character.toUpperCase(var1);
		//Display the value of var2
		System.out.println(var2);
		
		//reassign variables to new values
		var1 = 'c';
		
		//If we have user input, we can find characters in the input at a certain point
		//To do this we need a Scanner
		//Prompt for input
		System.out.println("User Input: ");
		//Reassign var3 value
		var3 = myScanner.findInLine(".").charAt(0);
		myScanner.nextLine();
		//Display the value of var3
		System.out.println(var3);
		
		//If you are using an int you can use multiple instances of the nextInt() to find more than one integer
		//Initialize two int variables
		int var4;
		int var5;
		//Prompt for two numbers
		System.out.print("Two numbers: ");
		var4 = myScanner.nextInt();
		var5 = myScanner.nextInt();
		//Display value of var4 and var5
		System.out.println(var4);
		System.out.println(var5);
		
		//Booleans
		//Booleans will only hold true or false
		//Formula: variableType(boolean) variableName = true/false
		boolean var6 = true;
		
		//Comparison operators for variable values
		/*
		 * == which compares for similar values
		 * 		1 == 1
		 * != which compares for values that are not the same
		 * 		1 != 2
		 * < which compares for values greater than the first value
		 * 		1 < 2
		 * > which compares for values less than the first value
		 * 		2 > 1
		 * <= which compares for values that are greater than or equal to the first value
		 * 		1 <= 2
		 * 		1 <= 1
		 * >= which compares for values that are less than or equal to the first value
		 * 		2 >= 1
		 * 		2 >= 2
		 */
		
		//A < B
		//a < b
		//Z > a
		//from greater to lesser = ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz
	}
}