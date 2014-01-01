/*
 * Java For Beginners: Episode 7
 * Switch Statements and Conditional Operators
 */

//Import the Random Class
import java.util.Random;

//Always Obligatory Class Initialization
public class switchConditional{
	//Also Obligatory Main Statement
	public static void main(String args[]){
		//Variables
		int randInt = 0;
		int randInt2 = 0;
		int randInt3 = 0;
		boolean exampleBool = true;
		int assignInt = 0;
		
		//Generate a Random Number
		//Initialize the Random Object
		Random myRandom = new Random();
		//Generate the random number
		randInt = myRandom.nextInt(10) + 1;
		randInt2 = myRandom.nextInt(10) + 1;
		randInt3 = myRandom.nextInt(100) + 1;
		
		//Switch Statements
		//Instead of doing something like this:
		if(randInt == 1){
			//Execute this code
		} else if(randInt == 2){
			//Execute this code
		} else if(randInt == 3){
			//Execute this code
		} //etc... until randInt == 10
		//We could use a Switch Statement
		switch(randInt){
		case 1:
			//Execute this code
			//Once your done in the case, you have to break it
			break;
		case 2:
			//Execute this code
			break;
		case 3:
			//Execute this code
			break;
		//case etc... until 10
		//The optional default case
		default:
			//This code will execute if the value checked by the Switch does not equal one of the cases
			break;
		}
		
		//We could leave out breaks
		switch(randInt){
		case 1:
			//I don't have any code here
			//I'm not breaking
		case 2:
			//Again I don't have any code
			//I won't break again
		case 3:
			//Put some code here
			System.out.println("The number is either 1, 2, or 3");
			break;
		case 4:
			//I didn't put code or break it
		case 5:
			//Did put code
			System.out.println("The number is either 4 or 5");
			break;
		//I won't put a default here, because I don't have to
		}
		
		//Your expression for the switch doesn't have to be just one variable
		//Even though you can add variables, you can't use conditions as your expression.
		//You can't have a switch like this: switch(randInt2 && randInt3)
		switch(randInt2 + randInt3){
		//The cases don't have to be in order
		case 5:
			//Execute code
			break;
		case 2:
			//Execute code
			break;
		case 94:
			//Execute code
			break;
		}
		
		//Conditional Operators
		switch(randInt){
		case 1:
			
		case 2:
			
		case 3:
			
		case 4:
			
		case 5:
			exampleBool = true;
			break;
		case 6:
			
		case 7:
			
		case 8:
			
		case 9:
			
		case 10:
			exampleBool = false;
			break;
		}
		
		//Using the operator
		assignInt = exampleBool ? 15 : 20;
		//Formula for the conditional operator
		//booleanName ? valueIfTrue : valueIfFalse
	}
}