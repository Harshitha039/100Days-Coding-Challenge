package com.palle;

import java.util.Scanner;

class QueueOperation
{
	int[] queue;
	int front; 
	int rear;
	int capacity;
	public QueueOperation(int capacity)
	{
		this.capacity=capacity;
		this.queue=new int[capacity];
		this.front=0;
		this.rear=0;
	}
	public void enqueue(int ele)
	{
		if(isFull())
		{
			System.out.println("Queue is overflow");
			return;
		}
		queue[rear++]=ele;
		System.out.println("Element added successfully");
	}
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is underflow");
			return;
		}
		int ele = queue[front++];
		System.out.println("Deleted element is "+ele);
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is underflow");
			return;
		}
		for(int i=front;i<rear;i++)
		{
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}
	public int peek()
	{
		return queue[front];
	}
	public boolean isEmpty()
	{
		return front==rear;
	}
	public boolean isFull()
	{
		return rear==capacity;
	}
}
public class Queue {

	public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	System.out.println("Enter Queue size: ");
		 	int n = sc.nextInt();
	        QueueOperation q = new QueueOperation(n); 

	        int choice;
	        do {
	            System.out.println("\n--- Queue Menu ---");
	            System.out.println("1. Enqueue");
	            System.out.println("2. Dequeue");
	            System.out.println("3. Display");
	            System.out.println("4. Peek");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter element to enqueue: ");
	                    int ele = sc.nextInt();
	                    q.enqueue(ele);
	                    break;
	                case 2:
	                    q.dequeue();
	                    break;
	                case 3:
	                    q.display();
	                    break;
	                case 4:
	                    int peeked = q.peek();
	                    if (peeked != -1) {
	                        System.out.println("Peek element is: " + peeked);
	                    }
	                    break;
	                case 5:
	                    System.out.println("Exiting program...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);

	        sc.close();
	}

}
