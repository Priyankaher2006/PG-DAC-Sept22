class SingleLL_Reverse
{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	static Node head=null;
	static void insert(int data)
	{
		Node new_node = new Node(data);
		new_node.next=head;
		head=new_node;
	}
	static void insertend(int data)
	{
		Node new_node = new Node(data);
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=new_node;
	}
	static void insertpos(int data,int p)
	{
		Node new_node = new Node(data);
		Node temp=head;
		for(int i=1;i<(p-1);i++)
		{
			temp=temp.next;
		}
		new_node.next=temp.next;
		temp.next=new_node;
	}
	static Node Reverse(Node head)
	{
		Node current=head;
		Node prev=null;
		while(current!=null)
		{
			Node temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;
		}
		return prev;
	}
	static Node recursiveReverse(Node head)
	{
		if(head==null || head.next==null)
			return head;
		Node newhead = recursiveReverse(head.next);
		Node headnext = head.next;
		headnext.next=head;
		head.next=null;
		return newhead;
	}
	public static void main(String args[])
	{
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		insert(60);
		insert(80);
		insert(90);
		//traverse();
		insertend(100);
		//traverse();
		insertpos(70,3);
		traverse();
		head=Reverse(head);
		traverse();
		head=recursiveReverse(head);
		traverse();
	}
	static void traverse()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(" "+temp.data);
			temp=temp.next;
		}
		System.out.println();
	}
}