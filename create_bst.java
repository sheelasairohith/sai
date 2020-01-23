package coding_club;

import java.util.Scanner;

public class create_bst {
	public static void main(String[] args)
	{
		int i,ele;
		BinarySearchTree head=new  BinarySearchTree();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("enter 1.insert\n2.delete\n3.inorder\n4.preorder\n5.postorder\n6.exit");
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
							TNode temp=new TNode();
							temp.data=ele;
							temp.left=temp.right=null;
							head.head=head.insert(head.head, temp);
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
							TNode temp=new TNode();
							temp.data=ele;
							temp.left=temp.right=null;
							head.head=head.deleteNode(head.head, temp);
							break;
						}
						catch(Exception e)
						{
							System.out.println("invalid input please try again\nenter only a integer to delete");
						}
					}
					
					break;
				case 3:head.inorder(head.head);
					break;
				case 4:head.preorder(head.head);
				break;
				case 5:head.postorder(head.head);
				break;
				case 6:
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
		}while(i!=6);
	}

}
