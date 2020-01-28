package Comparators1;

//CANNOT IMPLEMENT COMPARATOR WITHOUT OVERRIDING compare() SINCE THEN IT WOULD ALSO BE A ABSTRACT CLASS


import java.util.*;
public class Comp6 {

	public static void main(String[] args) {
		ArrayList<abcx> a=new ArrayList();
		a.add(new abcx(1));
		a.add(new abcx(2));
		Collections.sort(a,new sort1());
		
		ArrayList<Integer> a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		Collections.sort(a1,new sort1());   //not possible since a1 is of type integer and integer class
		//does not implement comparator and so has a default way of sort in collections.sort(a1)
		
		//^^^HERE MAIN REASON WE ARE DEFINING SORTING OF CLASS abcx AND PASSING ARRAYLIST 0F INTEGER AND 
		//PASSING IT TO SORT SO ERROR
		
		
		Collections.sort(a1,new Integer());  //should have been this but integer class does not implement
		//comparator ----- THIS LOGICALLY DEFINES THE DEFAULT WAY OF INTEGER SORTING DEFINED
		Collections.sort(a1);   //actually should have been this
		
		
		
		
		
		
//*********BUT INTEGER CAN BE SORTED IN DIFFERENT WAY IN ARRAYLIST BY MAKING A CLASS AND IMPLEMENT 
		//Comparator<Integer> AND OVERRIDE compare() AND NO INTEGER CLASS HAS TO BE MADE LIKE abcx SINCE IT
		//IS ALREADY PRESENT---------------see in Comp1.java*********//
		
		
	}

}
class abcx
{
	int a;
	abcx(int x)
	{
		a=x;
	}
}
class sort1 implements Comparator<abcx>
{
	public int compare(abcx x,abcx y)    
	{
		return x.a-y.a;
	}
}