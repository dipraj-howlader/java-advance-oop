package methodOverriding;

public class Teacher extends Person {

	String qual;
	int year;
	@Override
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(qual);
	}
	
	@Override
	void dd() {
		System.out.println(year);
	}
	
}
