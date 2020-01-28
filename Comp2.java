package Comparators1;
import java.util.*;
public class Comp2 {

	public static void main(String[] args) {

		ArrayList<abc1> ar=new ArrayList();
		ar.add(new abc1(2,"s"));
		ar.add(new abc1(1,"a"));
		ar.add(new abc1(3,"x"));
		System.out.println(ar);
		Collections.sort(ar,new abc1());
		System.out.println(ar);
		//Collections.sort(abc1);   not ok since sort of user defined types is unknown and comparable not used
	}

}
class abc1 implements Comparator<abc1>
{
	int a;
	String s;
	abc1(){}
	abc1(int a,String s)
	{
		this.a=a;
		this.s=s;
	}
	 public int compare(abc1 i,abc1 j)
	 {
		 return j.a-i.a;
	 }
	 public String toString()
	 {
		 return s+" "+Integer.toString(a);
	 }
}
