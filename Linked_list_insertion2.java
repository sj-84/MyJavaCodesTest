package LinkedList;

//TRY CREATING ALL THE METHODS IN ONE CLASS AND ONLY ONE TEST CLASS



//TRYING USING NON STATIC METHODS
public class Linked_list_insertion2 {

	public static void main(String[] args) {
		Linked_list_insertion2 ob=new Linked_list_insertion2();
		node1 head=null;
		//head=insert(head,3);//trying using non static
		//head=insert(head,6);
		//head=insert(head,9);
		head=ob.insert_at_end(head,20);
		head=ob.insert_at_end(head,24);
		head=ob.insert(head,4);
		head=ob.insert(head,7);
		ob.print(head);

	}
	node1 insert(node1 head,int data)            //insert at beginning
	{
		node1 n=new node1(data);
		if(head==null)
		{	
			return n;
		}
		n.next=head;
		head=n;
		return head;
	}
	node1 insert_at_end(node1 head,int data)
	{
		node1 p=head;
		node1 n=new node1(data);
		if(head==null)
		{
			return n;
		}
		for(;head.next!=null;)
		{
			head=head.next;
		}
		head.next=n;
		return p;
	}
	void print(node1 n)
	{
		for(;n!=null;)
		{
			System.out.print(n.data+"-> ");
			n=n.next;
		}
	}
}
class node1
{
	int data;
	node1 next;
	
	node1(int data)
	{
		this.data=data;
		next=null;
	}
}