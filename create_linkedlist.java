package coding_club;

import java.util.Scanner;

public class create_linkedlist {
	public static void main(String[] args)
	{
		int i,ele;
		SinglyLinkedList head=new SinglyLinkedList();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("enter 1.insert\n2.delete\n3.display\n4.exit");
			try
			{
				i=sc.nextInt();
				switch (i) {
				case 1:
					while(true)
					{
						try
						{
							System.out.println("enter a value to insert :");
							ele=sc.nextInt();
							LNode temp=new LNode();
							temp.data=ele;
							temp.next=null;
							head.insert(temp);
							System.out.println(ele+" is inserted");
							break;
						}
						catch(Exception e)
						{
							System.out.println("invalid input please try aga\nenter only a integer to insert");
						}
					}
					break;
				case 2:
					while(true)
					{
						try
						{
							System.out.println("enter a value to delete :");
							ele=sc.nextInt();
							LNode temp=new LNode();
							temp.data=ele;
							temp.next=null;
							head.delete(temp);
							break;
						}
						catch(Exception e)
						{
							System.out.println("invalid input please try again\nenter only a integer to delete");
						}
					}
					
					break;
				case 3:head.printLinkedList();
					break;
				case 4:
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + i);
				}
			}
			catch(Exception e)
			{
				i=0;
				System.out.println("invalid input please try again\nenter only a integer to insert");
				sc=new Scanner(System.in);
			}
		}while(i!=4);
	}
}
