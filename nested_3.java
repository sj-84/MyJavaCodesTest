package LinkedList;

public class nested_3 {

	public static void main(String[] args) {
		outer1 ob=new outer1();
		
		ob.try1();
		//ob.try2();           not ok obviously
		outer1.inner1 obi=ob.new inner1();
		obi.try2();
	}

}
class outer1{
	int a;
	void try1() {
		inner1 ob=new inner1();
		System.out.println(ob.c);
		//ob.try2();             ok
	}
	class inner1{
		private int c=4;
		void try2()
		{
			System.out.println("hj");
		}
	}
}
