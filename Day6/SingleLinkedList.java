package com.palle;

class Node
{
	int val;
	Node next;
	public Node(int val)
	{
		this.val=val;
		this.next=null;
	}
}
class Sll
{
	Node root;
	public Sll()
	{
		this.root=null;
	}
	public void addNode(int val)
	{
		Node n=new Node(val);
		if(this.root==null)
		{
			this.root=n;
			System.out.println("Root node inserted");
			return;
		}
		Node temp=this.root;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n;
		System.out.println("Node inserted");
	}
	public void insertAtN(int val,int pos)
	{
		Node n=new Node(val);
		if(this.root==null)
		{
			this.root=n;
			System.out.println("Root is inserted");
			return;
		}
		int count=1;
		Node temp=root;
		while(temp!=null)
		{
			if(count==pos-1)
			{
				n.next=temp.next;
				temp.next=n;
				System.out.println("Node inserted at "+pos);
				return;
			}
			temp=temp.next;
			count++;
		}
	}
	public void display()
	{
		Node temp=this.root;
		while(temp!=null)
		{
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.println();
	}	
}
public class SingleLinkedList {

	public static void main(String[] args) {
		Sll s=new Sll();
		s.addNode(10);
		s.addNode(20);
		s.addNode(30);
		s.addNode(40);
		s.display();
		s.insertAtN(25, 3);
		s.display();
	}

}
