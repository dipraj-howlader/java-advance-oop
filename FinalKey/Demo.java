package FinalKey;

public class Demo {
	
	//something that I want to declare as a FINAL , then we have to
//	use the final keyword in this case
	// that means constant
	
	
	final String Name = "PSTU";
	static final int fee; 
	//static blank final variable
	//to init blank final variable, have to decalere CONSTRACTOR
	
	
	
	//to init blank final variable
//	Demo(){
//		fee = 5446856;
//	}
//	
	static{
		fee = 12555;
	}
	void display() {
		System.out.println(Name + " " +fee);
	}
	
}
