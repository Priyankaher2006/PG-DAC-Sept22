/*
1. Insertion at StartDocument
static void insert(int new_data)
{
	Node new_node=new Node(new_data);
	new_node.next=head;
	head=new_node;
}

2. Insert at End

static void append(int new_data)
{
	Node new_node=new Node(new_data);
	if(head==null)
	{
		head=new_node;
		return;
	}
	
	new_node.next=null;
	Node n=head;
	
	while(n.next!=null)
	{
		n=n.next;
	}
	n.next=new_node;
	return;

}

3. Insert in between:

static void insertAfter(Node prev,int new_data)
{
	Node new_node=new Node(new_data);
	new_node.next=prev.next;   //always first step
	prev.next=new_node;   //alwasys second step
}

*/




class ListInsertSession
{
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;   //by def for all new nodes
		}
	}	
	//1. Insertion at Start
	static void insert(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	//2. Insert at End
	static void append(int new_data)
	{
		Node new_node=new Node(new_data);
		if(head==null)
		{
			head=new_node;
			return;
		}
		
		new_node.next=null;
		Node n=head;
		
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=new_node;
		return;

	}
	//3. Insert in between:
	static void insertAfter(Node prev,int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=prev.next;   //always first step
		prev.next=new_node;   //alwasys second step
	}
	static void display()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.println(n.data+"-->");
			n=n.next;
		}
	}
		
	public static void main(String args[])
	{
		//List1 l1=new List1();
		display();
		System.out.println("Empty List..");
		insert(5);
		insert(10);
		insert(15);
		insert(20);
		append(100);
		insertAfter(head.next.next,150);
		display();
	
	}
}