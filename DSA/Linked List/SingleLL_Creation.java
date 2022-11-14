import java.util.*;
class SingleLL_Creation
{
	static class Node
	{
		//two section in creation of LL i.e data & Adress
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	static Node head=null;//intially head will be null
	static void creation()
	{
		int n;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter  Data: ");
			int data=sc.nextInt();
			Node new_node = new Node(data);//creating obj to pass data to class Node constructor
			//two condition possible while creating LL
			if(head==null)//LL not Exist
			{
				head=new_node;//address of new_node in head i.e starting
			}
			else//LL exist & insertion in begning
			{
				//head=new_node; if we do this already consisting node address in head gets lost
				new_node.next=head;//address in head gets store in new_node address feild
				head=new_node;//new_nodes addressgets stored in head
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
			while(temp!=null)//as-lona as temp is not null print data
			{
				System.out.print(temp.data+" ");//printing data temp is pointing at
				temp=temp.next;//moving temps pointer to next node
			}
		}
	}
	public static void main(String args[])
	{
		creation();
		traverser();
	}
} 