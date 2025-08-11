package com.palle;

class Node1
{
	int val;
	Node next;
	public Node1(int val)
	{
		this.val=val;
		this.next=null;
	}
}
class SingleList
{
	Node root;
	public SingleList()
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
	public void deleteAtPos(int pos)
	{
		if(this.root==null)
		{
			System.out.println("there is no nodes to delete");
			return;
		}
		int count=1;
		Node temp=root;
		while(temp!=null)
		{
			if(count==pos-1)
			{
				temp.next=temp.next.next;
				System.out.println("Node deleted at "+pos);
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
public class SingleLLDelete {

	public static void main(String[] args) {
		SingleList s=new SingleList();
		s.addNode(10);
		s.addNode(20);
		s.addNode(30);
		s.addNode(40);
		s.display();
		s.deleteAtPos(3);
		s.display();
	}

}
