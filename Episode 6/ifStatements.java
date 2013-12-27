/*
 * Episode 6 of Java For Beginners
 * We're going to talk about if statements, logical operators, and enums
 */

//Obligatory class initialization
public class ifStatements{
	//Also obligatory main statement
	public static void main(String args[]){
		/*
		 * Logical Operators
		 * && which means and
		 * 		statement1 && statement2
		 * || which means or
		 * 		statement1 || statement2
		 * ! which means not
		 * 		!statement1
		 */
		
		//Variables
		int var1 = 1;
		int var2 = 2;
		
		//If statements
		//Basic format
		if(var1 == 1){
			System.out.println("The statement is true");
		} else {
			System.out.println("The statement is false");
		}
		if(var2 == 1){
			System.out.println("The statement is true");
		} else {
			System.out.println("The statement is false");
		}
		
		//Logical Operators
		if(var1 == 1 || var2 == 1){
			System.out.println("Either var1 or var2 = 1");
		} else {
			System.out.println("Neither var1 or var2 = 1");
		}
		if(var1 == 1 && var2 == 1){
			System.out.println("Both var1 and var2 = 1");
		} else {
			System.out.println("Either var1 or var2 does not equal 1");
		}
		
		//Order of operations does exist
		//Careful of the parenthesis
		if((var1 == 1 || var2 == 1) || (var1 == 1 && var2 == 1)){
			System.out.println("either the statement in front is true or the statement behind it is true");
		}
		
		//Nested if statements
		if(var1 == 1){
			if(var2 == 1){
				System.out.println("Both var1 and var2 = 1");
			} else {
				System.out.println("Only var1 = 1");
			}
		} else {
			System.out.println("Var1 does not equal 1");
		}
		
		//Else If
		if(var1 == 2){
			System.out.println("Var1 = 2");
		} else if( var1 == 3){
			System.out.println("Var1 = 3");
		} else if(var1 == 1){
			System.out.println("Var1 = 1");
		} else {
			System.out.println("Var1 is unknown");
		}
		
		//We're going to look at enums now
		//Initialize the enum object
		testEnum enum1 = null;
		if(var1 == 1){
			enum1 = testEnum.val1;
		}
		
		if(enum1 == testEnum.val1){
			System.out.println("Our enum is evaluating at the first value");
		}
	}
}