package Demo2;

public class VariLenArgu {
	/*
	void add (int i ,int j) {
		System.out.println(i+j);
		
	}
	void add (int i ,int j, int k) {
		System.out.println(i+j+k);
		
	}
	void add (int i ,int j, int k ,int l) {
		System.out.println(i+j+k+l);
		
	}
	*/
	// যেকোন মেথোড পাডাও না কেন যেন সেটা সেই কয়েকটা নিয়ে যোগ করতে পারে,
	
	// Variable length arguments
	
	void add (int ... i) {
		int sum = 0;
		for(int x : i) {
			sum = sum +x;
			
		}
		System.out.println(sum);
	}
	
	
	
}
