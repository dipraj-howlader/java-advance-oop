package PolymorphismExtra;

public class test {
public static void main(String[] args) {
	
	
	

	
	Shape [] s = new Shape[3];
	
	s[0] = new Shape();
	System.out.println(s[0].area());
	
	// reference variable
	// dynamic method dispatch
	//runtime polymorphism
//	Shape s1 = new Rectangle(10,10);
//	System.out.println(s1.area());
//	
//	Shape s2 = new Triangel(20,20);
//	
//	System.out.println(s2.area());
	
	s[1] = new Rectangle(12.5, 10.5);
	System.out.println(s[1].area());
	
	
	s[2] =new Triangel(5.5, 6.5);
	System.out.println(s[2].area());
	

	

	
}
}
