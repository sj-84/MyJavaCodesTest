package LinkedList;


public class nested_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abcinner ob=new abcinner();                 //ok
		//System.out.println(ob.a);        //ok
		//System.out.println(ob.b);        //not ok
		//abcd ob1=new abcd();             //not ok
		//abc.abcd ob1=ob.new abcd();        //ok
		//System.out.println(ob1.b);        //ok
		//System.out.println(ob1.a);        //not ok    see why
		//ob1.t();      //ok
		//ob.t_outer();                     //ok
		
		 
		
		
		
		
		
		abcinner.abcd ob1= new abcinner.abcd();
		
		int xx=abcinner.abcd.s;
		
		int p=ob1.b;
		//int pp=ob1.a;      //same prob as inner classes be it static or non static  cannot access members of
		//of outer class from outside of both the classes
		
		
		
	}

}
class abcinner{
	int a=3;
	//void t_outer() {
		//abcd ob=new abcd();
		//System.out.println(b); not ok
		//System.out.println(ob.b);
		//ob.t();
	//}
	
	
	static class abcd{
		int b=5;
		static int s=6;
		//void t() {
			//System.out.println(a);
		//}
	}
}	