package Inheritance;

public class Demo2Teacher extends Demo1 {
// Child class
	//sub class
	// derived class
	
	//after extending Demo1 class
//	now all the value of Demo1 class in extends to the Demo2Techer class
//	so we dont need to declare variables and methods in Demo2Teacher classs
//	thats the benifies of inheriance

	//name
	//age
	//display()
	
	String qual;
	void displayInfoTwo() {
		display();
		System.out.println("Qualification is :"+ qual);
	} 
	
}
