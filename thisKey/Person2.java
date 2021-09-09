package thisKey;

public class Person2 {
	
	void message() {
		System.out.println("I am message");
	}
	
	
	void display2() {
		//calling method using this keyword
		this.message();
		System.out.println("I am display");
	}

}
