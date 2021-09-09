package methodOverriding;

public class Test {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name ="Dipraj";
		t.age = 55;
		t.qual = "MSC";
		t.year= 86;
		
		t.display();
		t.dd();
		
		Person p = new Person();
		p.age= 85;
		p.name = "aa";
		p.display();
		p.money = 55;
		p.dd();
	}
}
