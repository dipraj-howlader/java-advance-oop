package Abstraction;

public class test {
	public static void main(String[] args) {
		
		MobileUser mu;
		
		mu = new Rahim();
		mu.sendMessage();
		mu.call();
		
		mu = new Karim();
		mu.sendMessage();
	}
}
