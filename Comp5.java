package Comparators1;
import java.util.*;

//WHY COMPARABLE CANNOT BE IN SEPERATE CLASS SINCE 'this.a' CANNOT BE ACCESSED FROM ANOTHER CLASS
public class Comp5 {

	public static void main(String[] args) {

		ArrayList<abc5> ar=new ArrayList();
		ar.add(new abc5(2,"s"));
		ar.add(new abc5(1,"a"));
		ar.add(new abc5(3,"x"));
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);

	}

}
class abc5 implements Comparable<abc5>
{
	int a;
	String s;
//	abc5(){}       no need now also
	abc5(int a,String s)
	{
		this.a=a;
		this.s=s;
	}
	 public String toString()
	 {
		 return s+" "+Integer.toString(a);
	 }
	 public int compareTo(abc5 i)
	 {
		 //return i.a-this.a;              //now ok
		 return a-i.a;             // also ok no need for this i.e, this is redundant
	 }
}
