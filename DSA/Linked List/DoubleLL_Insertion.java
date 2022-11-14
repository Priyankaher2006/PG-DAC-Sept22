import java.util.*;
class DoubleLL_Insertion
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
			int ch,p;
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
				System.out.println("Enter: \n1.Insert item at begining  \n2.Insert item at end  \n3.Insert item at paticular location");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						new_node.next=head;//address in head is now new_node.next
						//first nodes prev feild will be known as head.prev
						head.prev=new_node;//first node will save new_node address in its prev.
						head=new_node;
						break;
						
					case 2:
						//last nodes next feild will be known as tail.head
						tail.next=new_node;//last node points to new node
						new_node.prev=tail;////new_nodes prev have last nodes address
						tail=new_node;//new_nodes address assigned to tail
						break;
						
					case 3:
						Node temp=head;
						Node ptr=temp.next;
						System.out.println("Enter the position: ");
						p=sc.nextInt();			
						
						for(int i=1;i<(p-1);i++)	
						{
							temp=ptr;
							ptr=ptr.next;
						}
						new_node.prev=temp;
						new_node.next=ptr;
						temp.next=new_node;
						ptr.prev=new_node;
						break;
				}
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