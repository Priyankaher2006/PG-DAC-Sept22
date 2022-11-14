class SingleLL_DeletionUsingPosition
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
	static void deletenode(int position)
	{
		Node temp=head;
		if(head==null)
		{
			System.out.print("LL id empty");
		}
		if(position==0)
		{
			temp=head.next;
			head=temp;
		}
		for(int i=1;i<(position-1);i++)
        {
            temp=temp.next;
        }
		if(temp==null||temp.next==null)
		{
			return;
		}
        temp.next=temp.next.next;
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
		deletenode(5);
		traverse();
		deletenode(0);
		traverse();
		deletenode(6);
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