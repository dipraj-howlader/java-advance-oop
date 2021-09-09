package InheritancePrivateMem;

public class Demo1 {
	// this is not possible to inherite private members
	// To access private , we have to use setter and getter
	// using encapsulation
	
	private String name;
	private	int age;
	
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public int getAge() {
		return age;
	}
	
	
}
