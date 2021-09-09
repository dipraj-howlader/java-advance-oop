package FactRecursion;

public class Fact {
	int i;

	
	
	int recursion(int x) {
		i =x;
		if(i == 1) // base case
		{
			return 1;
		}
		else // Recursion cell 
		{
		return i * recursion(i-1);
		}
	}

}
