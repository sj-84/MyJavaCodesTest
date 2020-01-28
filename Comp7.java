package Comparators1;
import java.util.*;
public class Comp7 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList();
		a.add(1);
		a.add(3);
		a.add(2);
		Collections.sort(a);
		System.out.println(a);
		//HERE DOES NOT MATTER SINCE WE ARE DEFINING THE SORTING IN CLASS aac AND IS NOT PASSED IN SORT()
		
		System.out.println();
		
		ArrayList<aac> aa=new ArrayList();
		aa.add(new aac(2));
		aa.add(new aac(1));
		System.out.println(aa);
		Collections.sort(aa);          //NOT POSSIBLE FOR COMMENTED BUT FOR LATER POSSIBLE
		System.out.println(aa);
	}

}
//NOT POSSIBLE SINCE ONLY ONE SEQUENCE IS POSSIBLE AND IS DEFINED ALREADY FOR INTEGERS
/*class aac implements Comparable<Integer>              //NOT POSSIBLE
{
	int a;
	aac(int a)
	{
		this.a=a;
	}
	public String toString ()
	{
		return Integer.toString(a);
	}
	public int compareTo(Integer x)
	{
		return x-a;
	}
}*/






class aac implements Comparable<aac>              //NOW POSSIBLE
{
	int a;
	aac(int a)
	{
		this.a=a;
	}
	public String toString ()
	{
		return Integer.toString(a);
	}
	public int compareTo(aac x)
	{
		return a-x.a;
	}

}

