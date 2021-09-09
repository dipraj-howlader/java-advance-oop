package Demo1;

public class test {

	public static void main(String[] args) {
		
		ArugmentPassing r2 = new ArugmentPassing();
		r2.name = "Dipraj";
		System.out.println("Name is "+ r2.name);
		
		r2.change(r2);
		System.out.println("Name is "+ r2.name);
		
		
	}
	
}
