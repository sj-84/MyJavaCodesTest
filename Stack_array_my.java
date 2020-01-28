package stack;

public class Stack_array_my {

	public static void main(String[] args) {
		stack1 ob=new stack1();
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		ob.push(5);
		ob.push(6);
		ob.pop();
		ob.pop();
		ob.pop();
		ob.pop();
		ob.pop();
		ob.pop();
	}
}
	
class stack1{
	int arr[]=new int[5];
	int top=-1;
	
	void push(int n)
	{
		if(top==arr.length-1)
		{
			System.out.println("Full");
			return;
		}
		top++;
		arr[top]=n;
		System.out.println("Inserted"+n);
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Empty");
			return;
		}
		System.out.println("Popped"+arr[top]);
		top--;
	}
}