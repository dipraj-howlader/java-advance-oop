package super_keyword;

public class Vehicle {
	
	String name;
	String color;
	double weight;
	
	Vehicle(String n , String c , double w){
		name = n;
		color = c;
		weight  =w;
		
	}
	void display() {
		System.out.println(name +" " + color + " "+ weight);
	}
	
}
