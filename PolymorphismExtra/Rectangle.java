package PolymorphismExtra;

public class Rectangle extends Shape {

	// area
	double len, wei;
	
	Rectangle(double len , double wei){
		this.len = len;
		this.wei = wei;
		
	}
	
	@Override
	
	double area() {
		System.out.println("Area dor Reactangle");
		return 0.5*len*wei;
	}
	
}
