package Abstraction;

abstract public class MobileUser {
			
	// hiding implemantation
	// showing functionality
	
	//non - abstract method
	void call() {
		System.out.println("Calling");
	}
	
	
	abstract void sendMessage(); // abstact method
	
}
