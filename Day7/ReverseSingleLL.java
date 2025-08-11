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
class SingleLL
{
	Node root;
	public SingleLL()
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
	
	public void printReverse(Node root) {
        if (root == null) {
            return; 
        }
        printReverse(root.next); 
        System.out.print(root.val + "-> ");
    }
}
public class ReverseSingleLL {

	public static void main(String[] args) {
		SingleLL s=new SingleLL();
		s.addNode(10);
		s.addNode(20);
		s.addNode(30);
		s.addNode(40);
		System.out.println("Values inreverse order:");
		s.printReverse(s.root);

	}

}
