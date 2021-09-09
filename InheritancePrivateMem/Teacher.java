package InheritancePrivateMem;

public class Teacher extends Demo1{
	
	// getName,setName,getAge, setAge
	
	private	String qual;
	
	public void setQual(String qual) {
		this.qual = qual;
		
	}
	public String getQual() {
		return qual;
	}
	void display() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getQual());
	
}
	

	
}