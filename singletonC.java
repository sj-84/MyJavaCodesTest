package LinkedList;

public class singletonC {
	static singletonC x;
	int y;
	private singletonC(int y)
	{
		this.y=y;
	}
	static singletonC get(int y)
	{
		if(x==null)
		{
			x=new singletonC(y);
		}
		return x;
	}
//}
//class TestS
//{
	public static void main(String args[])
	{
	//	singletonC ob1=new singletonC();   not ok since constructor is private
		singletonC ob1=singletonC.get(2);
		System.out.println(ob1.y);
		singletonC ob2=singletonC.get(4);
		System.out.println(ob2.y);
	}
}
