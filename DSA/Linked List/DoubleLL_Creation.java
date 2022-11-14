import java.util.*;
class DoubleLL_Creation
{
	static class Node
	{
		//three section in double LL
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=prev;
		}
	}
	static Node head=null;
	static Node tail=null;
	
	static void creation()
	{
		int n;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("Enter  Data: ");
			int data=sc.nextInt();
			Node new_node = new Node(data);
			if(head==null)
			{
				head=new_node;
				tail=new_node;
			}
			else
			{
				head.prev=new_node;
				new_node.next=head;
				head=new_node;
			}
			System.out.println("Do you want to add more data. \nif Yes, press:1");
			n=sc.nextInt();
		}while(n==1);
		
	}
	static void traverser()
	{
		Node temp=head;
		if(head == null)
		{
			System.out.println("LL does not Exist");
		}
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}
	public static void main(String args[])
	{
		creation();
		traverser();
	}
} 