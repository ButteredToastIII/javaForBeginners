/*
 * Example External Class File
 */

public class External {
	//Instance Variables
	int var1 = 0;
	double var2 = 0.0;
	boolean var3 = true;
	
	//Constructor
	public External(double nVar2, boolean nVar3){
		var1 = 1;
		var2 = nVar2;
		var3 = nVar3;
	}
	
	//Methods
	//Accessors - methods that get the values from the instance variables
	public int getVar1(){
		return var1;
	}
	public double getVar2(){
		return var2;
	}
	public boolean getVar3(){
		return var3;
	}
	
	//Mutators - methods that change the values in the instance variables
	public void setVar1(int nVar1){
		var1 = nVar1;
	}
	public void setVar2(double nVar2){
		var2 = nVar2;
	}
	public void setVar3(boolean nVar3){
		var3 = nVar3;
	}
}
