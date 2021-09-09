package thisKey;

public class Person {
	
	String name;
	int age;
	String hairColor;
	
	
	Person(String name, int age){
		//this current class instance variable
		this.name = name;
		this.age = age;
	}
	
	Person(String name, int age,String hairColor){
		//this calling current class constractor
		this(name,age);
		this.hairColor = hairColor;
		
	}
	
	void display() {
		System.out.println(name + " " + age);
		System.out.println(hairColor);
	}
	
	
	
	
}
