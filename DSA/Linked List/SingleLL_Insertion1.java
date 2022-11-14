class SingleLL_Insertion1
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
	public static void main(String args[])
	{
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		traverse();
		insertend(05);
		traverse();
		insertpos(25,4);
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