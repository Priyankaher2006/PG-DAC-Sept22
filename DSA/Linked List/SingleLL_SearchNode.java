class SingleLL_SearchNode
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
	static boolean search(Node head,int key)
	{
		Node temp=head;
		while(temp!=null)
		{
			if (temp.data==key)
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	/* Function to get the Nth node from the last of a
   linked list */
    static void printNthFromLast(int N)
    {
        int len = 0;
        Node temp = head;
        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        // check if value of N is not more than length of the linked list
        if (len < N)
            return;
        temp = head;
        // 2) get the (len-N+1)th node from the beginning
        for (int i = 1; i < len - N + 1; i++)
            temp = temp.next;
 
        System.out.println(temp.data);
    }
	/*	recursive
		static void printNthFromLast(Node head, int N)
		{
			int i = 0;
		 
			if (head == null)
				return;
			printNthFromLast(head.next, N);
		 
			if (++i == N)
				System.out.print(head.data);
		}
	*/
	static void printNthFrombeg(int N)
    {
        int len = 0;
        Node temp = head;
        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        // check if value of N is not more than length of the linked list
        if (len < N)
            return;
        temp = head;
        // 2) get the (len-N+1)th node from the beginning
        for (int i = 1; i < N ; i++)
            temp = temp.next;
 
        System.out.println(temp.data);
    }
	public static void main(String args[])
	{
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		traverse();
		boolean d=search(head,30);
		if(d==true)
			System.out.println("found");
		else
			System.out.println("not found");
		printNthFromLast(4);
		printNthFrombeg(3);
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