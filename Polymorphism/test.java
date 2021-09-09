package Polymorphism;

public class test {
	public static void main(String[] args) {
		Demo1 d =new Demo1();
		d.display();
		
		
		d = new Teacher();
		d.display();
		
		
		d = new Student();
		d.display();
		
	}
}
