//Variables.

//Import Scanner
import java.util.Scanner;

//Always declare the class
public class variables{
	//Always declare the main method
	public static void main(String args[]){
		/*
		 * Variable Types
		 * byte		=	-128 through 127
		 * short 	=	-32768 through 32767
		 * int		=	-2147483648 through 2147483647
		 * long		=	-9223372036854775808 through 9223372036854775807
		 * float	=	-3.4x10^38 through 3.4x10^38
		 * double	=	-1.8x10^308 through 1.8x10^308
		 */
		
		//Initialize Scanner object
		Scanner myScanner = new Scanner(System.in);
		
		//Declaring Variables
		//One by one
		double accBal;
		double withAmount;
		//Variables of the same type
		int varOne, varTwo, varThree;
		double varFour, varFive;
		
		//Assign Values to Variables
		//At initialization (when you declare it.  See above.)
		int varSix = 1;
		double varSeven = 1.5, varEight = 2.5;
		//Assign using values or other Variable Values
		varOne = 14;
		varTwo = varSix;
		//Assign using user input
		varThree = myScanner.nextInt();
		
		//Manipulate Variable Values
		/*
		 * Operators
		 * + to add
		 * - to subtract
		 * * to multiply
		 * forwardSlash to divide
		 */
		varFour = varSeven / varEight; //dividing so I can show you the forward slash
		
		/*
		 * +=
		 * -=
		 * *=
		 * forwardSlash=
		 */
		varOne += varSix;
		
		//++ and --
		varOne++;
		++varOne;
		varSix--;
		--varSix;
		//If you have the operator in front of the variable, the compiler will add or subtract one to that variable and then reference the value
		//If you have the operator behind the variable, the compiler will reference the variable then add or subtract one
		
		//Will display the value in varSix and then add one
		System.out.println(varSix++);
		//Will add one to varSix and then display the value
		System.out.println(++varSix);
	}
}