package Comparators1;
import java.util.*;
public class Comp8 {

	public static void main(String[] args) {
		List<Integer> i=new ArrayList<Integer>();
		i.add(1);
		i.add(3);
		i.add(2);
		List<axx> ii=new ArrayList<>();
		ii.add(new axx(1));
		ii.add(new axx(2));
		Collections.sort(ii);
		System.out.println(ii);

	}

}
class axx implements Comparable<axx>
{
	int a;
	axx(int a)
	{
		this.a=a;
	}
	public String toString()
	{
		return Integer.toString(a);
	}
	public int compareTo(axx i)
	{
		return a-i.a;
	}
}