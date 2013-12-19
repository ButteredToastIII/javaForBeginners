//This is a comment.
/* This is for comments that will span multiple lines
 * 
 * Comments will not be seen by the compiler.  The compiler will basically skip anything that's in a comment block.
 */

//This is a class that is public.
public class simple { 
	//Brackets tell the compiler where blocks of code end.
	
	/*
	 * This defines the main method.  This tells the compiler that this is the code to execute when the program is run
	 * the "static" keyword tells the compiler that the block of code between the brackets will not be permanently changing value
	 * Within the parenthesis are the arguments that will go into the method
	 * a String which is basically a "list" of either characters or numbers.  "I want money" is a String
	 * args again stands for arguments
	 */
	public static void main(String args[]){
		//Variables
		//int stands for integer which holds only whole number values
		int firstVariable = 1;
		//double which holds decimal values
		double secondVariable = 1.5;
		//char stands for character which holds a single letter or number value
		char thirdVariable = 'a';
		//String which is a line of characters or numbers
		String fourthVariable = "This is a String.  It can contain letters, symbols, and numbers.  Like 5.";
		String fifthVariable = "This is a second String.  See below.";
		
		//Don't worry what an if statement is yet
		//== is for comparing while = is for assigning.  && is basically saying firstStatment AND secondStatement is true.  || is basically saying firstStatement OR secondStatement is true.
		if(firstVariable == 1 && secondVariable == 1.5 || thirdVariable == 'a' && fourthVariable == fifthVariable){
			//Everything within the curly braces for the if statement is interpreted by the compiler to be within the if statement
			//Everything within the quotation marks is a "literal"
			System.out.println("It will take what I type in here and print it to the screen.");
			//You must have a semicolon at the end of every statement.  It tells the compiler that I'm done with the statement
		}
	}
}

