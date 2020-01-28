package Comparators1;
import java.util.*;
public class Normal_sort {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList();
		a.add(2);
		a.add(1);
		a.add(3);
		System.out.println(a);
		Collections.sort(a);        //here ok since known types 
		System.out.println(a);

	}

}
