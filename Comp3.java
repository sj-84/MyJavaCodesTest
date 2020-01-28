package Comparators1;
import java.util.*;

//COMPARATOR IN SEPERATE CLASS
public class Comp3 {

	public static void main(String[] args) {

		ArrayList<abc2> ar=new ArrayList();
		ar.add(new abc2(2,"s"));
		ar.add(new abc2(1,"a"));
		ar.add(new abc2(3,"x"));
		System.out.println(ar);
		Collections.sort(ar,new sss());
		System.out.println(ar);
		//Collections.sort(abc2);   not ok since sort of user defined types is unknown or comparable is 
		//not used
		

		
		
	}

}
class abc2 
{
	int a;
	String s;
//	abc2(){}       no need now
	abc2(int a,String s)
	{
		this.a=a;
		this.s=s;
	}
	 public String toString()
	 {
		 return s+" "+Integer.toString(a);
	 }
}
class sss implements Comparator<abc2>
{
	 public int compare(abc2 i,abc2 j)
	 {
		 return j.a-i.a;
	 }
}
