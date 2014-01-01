/*
 * Java For Beginners: Episode 9
 * Reading/Writing to/from the harddrive
 */

//Import the necessary class files
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

//Obligatory Class Initialization
public class readWrite {
	//Also Obligatory Main Statement with a FileNotFoundException
	public static void main(String args[]) throws FileNotFoundException{
		//Initialize the objects
		Scanner diskScanner = new Scanner(new File("test.txt")); //FILE NAME IS IS CASE-SENSITIVE
		PrintStream diskWriter = new PrintStream("test2.txt"); //FILE NAME IS IS CASE-SENSITIVE
		
		//Variables
		double price = 0.0, total = 0.0;
		int quantity = 0;
		
		//Gather cost and quantity
		price = diskScanner.nextDouble();
		quantity = diskScanner.nextInt();
		
		//Calculate the total
		total = price * quantity;
		
		//Write the total to the file
		diskWriter.println(total);
		
		/*
		 * Loop until there is no information on the file
		 * diskScanner.hasNext()
		 * while(diskScanner.hasNext()){}
		 */
	}
}
