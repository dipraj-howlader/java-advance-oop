package Super;

public class B extends super_key {
	int i = 5;
	
	void display() {
		System.out.println(i);
	}
	void superDisplay() {
		System.out.println(super.i);
	}
	
	void superClass() {
		//super method calling
		super.superClass();
		System.out.println("Inside B class");
	}
	B(){
		// calling super class constructor
		super();
		System.out.println("B Constractor");
	}
	
}
