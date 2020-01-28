package LinkedList;

public class static_var_non_static_method {

	static int a=5;
	
	public static void main(String[] args) {
		System.out.println(a);
		static_var_non_static_method ob=new static_var_non_static_method();
		ob.abc();
		abcd();
	}
	void abc()
	{
		System.out.println(a);
	}
	static void abcd()
	{
		System.out.println(a);
	}
}
