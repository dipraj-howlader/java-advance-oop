package super_keyword;

public class Car extends Vehicle {
	// name, color, weight ,  display()
	int gear;
	
	Car(String n, String c, double w , int g) {
//calling super constractor
		
		super(n, c, w);
		gear = g;
		
	}
		
	void display() {
		System.out.println(name +" " + color + " "+ weight + " "+ gear);
	}
}
