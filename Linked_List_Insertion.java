package LinkedList;
//NOT REALLY JUST CHECKING STATIC REQUIRED FOR DS IN JAVA
public class Linked_List_Insertion {
	int x=4;
	public static void main(String[] args) {
		Linked_List_Insertion.staticM();
		Linked_List_Insertion ob=new Linked_List_Insertion();
		ob.non_static();
	}
	void non_static()
	{
		int a=5;
		System.out.println(x);
	}
	static void staticM()
	{
		int b=9;
		System.out.println(b);
		Linked_List_Insertion ob=new Linked_List_Insertion();
		ob.x=13;
		System.out.println(ob.x);
	}
}
