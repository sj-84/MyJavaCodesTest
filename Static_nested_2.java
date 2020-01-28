package LinkedList;
//VISUALIZE THE OBJECTS 
public class Static_nested_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterS ob=new OuterS();
		OuterS.InnerS ob1=ob.new InnerS();
		ob1.print();
		OuterS.InnerSS ob2=new OuterS.InnerSS();
		ob2.print();
		
		
		
	}

}
class OuterS
{
	int a=3;
	class InnerS
	{
		void print()
		{
			System.out.println(a);
		}
	}
	static class InnerSS
	{
		void print()
		{
			OuterS ob=new OuterS();
			System.out.println(ob.a);
		}
	}
}
