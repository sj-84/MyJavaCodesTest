package LinkedList;
//USING STATIC METHODS
public class Linked_list_insertion_1 {

	public static void main(String[] args) {
		node head=null;
		//head=insert(head,3);
		//head=insert(head,6);
		//head=insert(head,9);
		head=insert_at_end(head,20);
		head=insert_at_end(head,24);
		head=insert(head,4);
		head=insert(head,7);
		print(head);

	}
	static node insert(node head,int data)            //insert at beginning
	{
		node n=new node(data);
		if(head==null)
		{	
			return n;
		}
		n.next=head;
		head=n;
		return head;
	}
	static node insert_at_end(node head,int data)
	{
		node p=head;
		node n=new node(data);
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
	static void print(node n)
	{
		for(;n!=null;)
		{
			System.out.print(n.data+"-> ");
			n=n.next;
		}
	}
}
class node
{
	int data;
	node next;
	
	node(int data)
	{
		this.data=data;
		next=null;
	}
}