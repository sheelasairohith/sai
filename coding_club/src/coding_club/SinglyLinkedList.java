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
		if( getHead()==null )
			return true;
		return false;
	}
	// used to insert a node at the start of linked list
	public void insert(LNode data) {
		LNode temp=getHead();
		if(temp==null)
		{
			setHead(data);
			return;
		}
		while(temp.next!=null)
			temp=temp.next;
		temp.next=data;
	}
	public LNode reverse(LNode head)
	{
		if(head==null)
			return null;
		if(head.next==null)
			return head;
		LNode temp=reverse(head.next);
		head.next.next=head;
		head.next=null;
		return temp;
	}
	// used to delete node from start of linked list
	// Use to delete node after particular node
	public void delete(LNode after) {
		LNode temp=getHead();
		if(getHead()==null)
		{
			System.out.println("list is emty");
			return;
		}
		if(getHead().data==after.data)
			setHead(getHead().next);
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
		LNode temp=getHead();
		if(temp==null)
		{
			setHead(data);
			return;
		}
		while(temp.next!=null)
			temp=temp.next;
		temp.next=data;
	}
	// For printing Linked List
	public void printLinkedList() {
		LNode temp=getHead();
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public LNode getHead() {
		return head;
	}
	public void setHead(LNode head) {
		this.head = head;
	}
	public int middle(LNode head)
	{
		LNode t1=head;
		LNode t2=head;
		while(t1!=null)
		{
			t1=t1.next;
			if(t1!=null)
			{
				t1=t1.next;
				t2=t2.next;
			}
		}
		return t2.data;
	}
	public boolean is_loop_available()
	{
		LNode t1=head;
		LNode t2=head;
		do
		{
			t1=t1.next;
			if(t1!=null)
				t1=t1.next;
			t2=t2.next;
			if(t1==t2)
			{
				return true;
			}
		}while(t1!=null);
		return false;
	}
	
}
