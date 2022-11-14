class SingleLL_Deletion1
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
	static void deletenode(int data)
	{
		Node temp=head;
		if(head==null)
		{
			System.out.print("LL id empty");
		}
		if(temp!=null && temp.data==data)
		{
			temp=head.next;
			head=temp;
		}
		Node ptr=null;
		while(temp!=null && temp.data!=data)
		{
			ptr=temp;
			temp=temp.next;
		}
		if(temp==null)
		{
			return;
		}
		ptr.next=temp.next;
	}
	public static void main(String args[])
	{
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		insert(60);
		insert(70);
		insert(80);
		insert(90);
		insert(100);
		traverse();
		deletenode(10);
		traverse();
		deletenode(100);
		traverse();
		deletenode(50);
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