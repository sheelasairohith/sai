package coding_club;

import java.util.*;

class LNode {
	public int data;
	public LNode next;
	public void displayNodeData() {
		System.out.println(data+" ");
	}
}
public class SinglyLinkedList {
	private LNode head=null;
	public boolean isEmpty() {
		if( head==null )
			return true;
		return false;
	}
	// used to insert a node at the start of linked list
	public void insert(LNode data) {
		LNode temp=head;
		if(temp==null)
		{
			head=data;
			return;
		}
		while(temp.next!=null)
			temp=temp.next;
		temp.next=data;
	}
	// used to delete node from start of linked list
	// Use to delete node after particular node
	public void delete(LNode after) {
		LNode temp=head;
		if(head==null)
		{
			System.out.println("list is emty");
			return;
		}
		if(head.data==after.data)
			head=head.next;
		else
		{
			while(temp.next!=null && temp.next.data!=after.data)
				temp=temp.next;
			if(temp.next!=null)
			{
				temp.next=temp.next.next;
				System.out.println(after.data+" is deleted from the list");
				
			}
			else
			{
				System.out.println(after.data+" is not resent in the list");
			}
		}
	}
	// used to insert a node at the start of linked list
	public void insertLast(LNode data) {
		LNode temp=head;
		if(temp==null)
		{
			head=data;
			return;
		}
		while(temp.next!=null)
			temp=temp.next;
		temp.next=data;
	}
	// For printing Linked List
	public void printLinkedList() {
		LNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
