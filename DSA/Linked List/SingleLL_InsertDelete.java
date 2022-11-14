import java.util.*;
class SingleLL_InsertDelete
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
	static void ibegining()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Data: ");
		int data=sc.nextInt();
		Node new_node = new Node(data);
		new_node.next=head;
		head=new_node;
	}
	
	static void iend()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Data: ");
		int data=sc.nextInt();
		Node new_node = new Node(data);
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=new_node;
	}
	
	static void iposition()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Data: ");
		int data=sc.nextInt();
		Node new_node = new Node(data);
		System.out.println("Enter the position: ");
		int p=sc.nextInt();			
		Node temp1=head;
		for(int i=1;i<(p-1);i++)	
		{
			temp1=temp1.next;	
		}
		new_node.next=temp1.next;
		temp1.next=new_node;
	}
	
	static void dbegining()
	{
		Node temp=head;
		temp=temp.next;
		head=temp;
	}
	
	static void dend()
	{
		Node temp1=head;
		Node ptr=temp1.next;
		while(ptr.next != null)
		{
			temp1=ptr;
			ptr=ptr.next;
		}
		temp1.next=null;
	}
	
	static void dposition()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position: ");
		int p=sc.nextInt();			
		Node temp2=head;
		Node ptr1=temp2.next;
		for(int i=1;i<(p-1);i++)
		{
			temp2=ptr1;
			ptr1=ptr1.next;
		}
		temp2.next=ptr1.next;
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
		System.out.println();
	}
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		int n,m;
		creation();
		traverser();
		do
		{
			System.out.println("*****************************************************************************************");
			System.out.println("Insertion");
			System.out.println("Enter inserted location:\n1.Insert at Begining \n2.Insert at End  \n3.Insert at Particular Position");
			System.out.println("*****************************************************************************************");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter Data to be Inserted at begining: ");
					ibegining();
					traverser();
					System.out.println();
					break;
				
				case 2:
					System.out.print("Enter Data to be Inserted at end: ");
					iend();
					traverser();
					System.out.println();
					break;
					
				case 3:
					System.out.print("Enter Data to be Inserted at particular position: ");
					iposition();
					traverser();
					System.out.println();
					break;
					
			}
			System.out.println("Do you want to continue.if yes, press:1");
			n=s.nextInt();
		}while(n==1);	
		do
		{
			System.out.println("*****************************************************************************************");
			System.out.println("Deletion");
			System.out.println("Enter delete location:\n1.Delete from Begining \n2.Delete from End  \n3.Delete from Particular Position");
			System.out.println("*****************************************************************************************");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Deleted from begining: ");
					dbegining();
					traverser();
					System.out.println();
					break;
				
				case 2:
					System.out.println("Deleted from end: ");
					dend();
					traverser();
					System.out.println();
					break;
					
				case 3:
					System.out.println("Deleted from particular position: ");
					dposition();
					traverser();
					System.out.println();
					break;
					
			}
			System.out.println("Do you want to continue.if yes, press:1");
			m=s.nextInt();
		}while(m==1);	
	}
} 