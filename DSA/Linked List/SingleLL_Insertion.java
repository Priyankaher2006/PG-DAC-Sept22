import java.util.*;

class SingleLL_Insertion
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
		int data,n,ch,p;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter  Data: ");
			data=sc.nextInt();
			Node new_node = new Node(data);//creating obj to pass data to class Node constructor
			//two condition possible while creating LL
			if(head==null)//LL not Exist
			{
				head=new_node;//address of new_node in head i.e starting
			}
			else//LL exist & insertion in begning
			{
				System.out.println("Enter: \n1.Insert item at begining  \n2.Insert item at end  \n3.Insert item at paticular location");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						new_node.next=head;
						head=new_node;
						break;
						
					case 2:
						Node temp=head;
						/*
							to insert node at end we have to traverse LL till end i.e temp.next==null
							when pointer reach end we allot temp with new_node address.
						*/
						while(temp.next!=null)
						{
							temp=temp.next;
						}
						temp.next=new_node;
						break;
						
					case 3:
						System.out.println("Enter the position: ");
						p=sc.nextInt();			
						Node temp1=head;
						for(int i=1;i<(p-1);i++)	
						{
							temp1=temp1.next;	
						}
						new_node.next=temp1.next;//address of 40 assigned to new_node.next so it will point to 40
						temp1.next=new_node;//temp1.next assigned with new_node address
						break;
				}
			}
			System.out.println("Do you want to add more data. if Yes, press:1");
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