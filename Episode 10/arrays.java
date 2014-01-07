/*
 * Java For Beginners | Episode 9
 * Arrays
 */

//Import Random Class
import java.util.Random;

//Obligatory class initialization
public class arrays {
	//Also obligatory main statement
	public static void main(String args[]){
		//Initialize the Random Object
		Random myRandom = new Random();
		
		//Get into arrays
		//An array is basically a list of values.  Basically a variable that stores a list of values instead of just one value
		
		//Initialize an array
		//Formula: varType arrayName[] = new varType[numOfIndexes]
		int exampleArray[] = new int[10];
		
		//Store variables in the array
		exampleArray[5] = 9;
		for(int i = 0; i < 10; i++){
			exampleArray[i] = myRandom.nextInt(10) + 1;
		}
		
		//Display the values in the array
		for(int i = 0; i < 10; i++){
			System.out.println("Array Index " + i + " has value " + exampleArray[i]);
		}
	}
}
