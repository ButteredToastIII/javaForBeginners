/*
 * Java For Beginners: Episode 11
 * Creating (and utilizing) an External Class File
 */

//Obligatory Class Initialization
public class createAClass {
	//Also Obligatory Main Statement
	public static void main(String args[]){
		//Variables
		boolean whateverBoolean = false;
		
		//Initialize Our External Object
		External exampleExternal = new External(2.5, whateverBoolean);
		
		//Utilize Accessor Methods
		System.out.println(exampleExternal.getVar1());
		System.out.println(exampleExternal.getVar2());
		System.out.println(exampleExternal.getVar3());
		System.out.println();
		
		//Utilize Mutator Methods
		exampleExternal.setVar1(2);
		exampleExternal.setVar2(2.5 + 6.7);
		exampleExternal.setVar3(whateverBoolean);
		
		//Display the results of the Mutators
		System.out.println(exampleExternal.getVar1());
		System.out.println(exampleExternal.getVar2());
		System.out.println(exampleExternal.getVar3());
	}
}
