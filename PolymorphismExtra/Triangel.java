package PolymorphismExtra;

public class Triangel extends Shape {
	
	double base, height;
	
	Triangel(double base, double height){
		this.base =base;
		this.height = height;
		
	}
	
	@Override
	double area() {
		System.out.println("Area for Triangle");
		return base*height;
	}
	
}
