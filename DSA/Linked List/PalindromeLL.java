class PalindromeLL
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
	static Node reverse(Node head)
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
	static Node middle(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	static  boolean isPalindrome(Node head) 
	{
		if(head==null);
		{
			return true;
		}
		
		Node mid=middle(head);
		Node last=reverse(mid.next);
		Node temp=head;
		while(last!=null)
		{
			if(last.data!=temp.data)
				return false;
			last=last.next;
			temp=temp.next;
		}
		return true;
	}
	
	public static void main(String args[])
	{
		insert(1);
		insert(2);
		insert(2);
		insert(1);
		traverse();
		insertend(100);
		boolean b=isPalindrome(head);
		if(b==true)
			System.out.print("Palindrome ");
		else
			System.out.print("Not Palindrome ");
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

/*
static boolean pal(Node head)
	{
		if(head==null);
		{
			return true;
		}
		Node mid=middle(head);
		Node last=reverse(mid.next);
		Node temp=head;
		while(last!=null)
		{
			if(last.data!=temp.data)
				return false;
			last=last.next;
			temp=temp.next;
		}
		return true;
	}
	static Node middle(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
*/