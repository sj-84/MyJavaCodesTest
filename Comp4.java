package Comparators1;
import java.util.*;

//WHY COMPARABLE CANNOT BE IN SEPERATE CLASS SINCE 'this.a' CANNOT BE ACCESSED FROM ANOTHER CLASS
public class Comp4 {

	public static void main(String[] args) {

		ArrayList<abc3> ar=new ArrayList();
		ar.add(new abc3(2,"s"));
		ar.add(new abc3(1,"a"));
		ar.add(new abc3(3,"x"));
		System.out.println(ar);
		Collections.sort(ar,new sss3());     //not possible 
		System.out.println(ar);

	}

}
class abc3 
{
	int a;
	String s;
//	abc3(){}       no need now
	abc3(int a,String s)
	{
		this.a=a;
		this.s=s;
	}
	 public String toString()
	 {
		 return s+" "+Integer.toString(a);
	 }
}
class sss3 implements Comparable<abc3>
{
	 public int compareTo(abc3 i)
	 {
		 
		// return this.a-i.a;            //not ok since not accessible
		 
		 /*or*/ return a-i.a; // i.e, a cannot be found
	 }
}
