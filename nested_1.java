package LinkedList;

public class nested_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc ob=new abc();                 //ok
		//System.out.println(ob.a);        //ok
		//System.out.println(ob.b);        //not ok
		//abcd ob1=new abcd();             //not ok
		abc.abcd ob1=ob.new abcd();        //ok
		System.out.println(ob1.b);        //ok
		//System.out.println(ob1.a);        //not ok    see why    THE REASON IS GIVEN BELOW IN CAPS
		ob1.t();      //ok
		//ob.t_outer();                     //ok
		//ob1.t_outer();
		/////////////TRY AGAIN ^^^^^ CODES/////////////////////
	
		//INNER CLASS INSTANCE CANNOT ACCESS MEMBERS OF OUTER CLASS OUTSIDE OF THE TWO CLASSES
		//THIS IS THE DIFFERENCE BETWEEN INHERITANCE AND NESTED CLASSES
		abc.abcd xx=ob.new abcd();
		int g=xx.b;
		//int gg=a;        //same prob 
	}

}
class abc{
	int a=3;
	void t_outer() {
		abcd ob=new abcd();
		//System.out.println(b); not ok
		System.out.println(ob.b);
		ob.t();
	}
	
	
	 class abcd{
		//public static int a = 0;
		int b=5;
	
		void t() {
			System.out.println(a);
		}
	}
}	