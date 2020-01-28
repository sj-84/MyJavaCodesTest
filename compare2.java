package Comparators1;
// Java program to demonstrate working 
// of compare() method 

class compare2 { 

	// Function to compare both objects 
	public static int compare(Object obj1, Object obj2) 
	{ 

		// Converting the two objects to integer 
		// for comparison 
		int intObj1 = (int)obj1; 
		int intObj2 = (int)obj2; 

		// Get the difference 
		int difference = intObj1 - intObj2; 

		if (difference == 0) { 

			// Both are equal 
			return 0; 
		} 
		else if (difference < 0) { 

			// obj1 < obj2 
			return -1; 
		} 
		else { 

			// obj1 > obj2 
			return 1; 
		} 
	} 

	// driver code 
	public static void main(String args[]) 
	{ 
		int a = 10; 
		int b = 20; 

		// as 10 less than 20, 
		// Output will be a value less than zero 
		System.out.println(compare(a, b)); 

		int x = 30; 
		int y = 30; 

		// as 30 equals 30, 
		// Output will be zero 
		System.out.println(compare(x, y)); 

		int w = 15; 
		int z = 8; 

		// as 15 is greater than 8, 
		// Output will be a value greater than zero 
		System.out.println(compare(w, z)); 
	} 
} 
