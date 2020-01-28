package Comparators1;
import java.util.*;
public class Comp1 {

	public static void main(String[] args) {
		int arr[]= {1,3,2,6,5};int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//Arrays.sort(arr,new abc());
		// ArrayList<Integer> ar= Arrays.asList(arr);   //not ok
		//There is no shortcut for converting from int[] to List<Integer> as Arrays.asList does not deal with boxing and will just create a List<int[]> which is not what you want. You have to make a utility method.
		
		ArrayList<Integer> ar=new ArrayList();
		ar.add(1);
		ar.add(3);
		ar.add(2);

		Collections.sort(ar,new abc());
		System.out.println(ar);
	}

}
class abc implements Comparator<Integer>
{
	 public int compare(Integer i,Integer j)
	 {
		 return j-i;
	 }
}