package com.palle;

import java.util.Scanner;

class StackOperation
{
	int[] stack;
	int top;
	int capacity;
	public StackOperation(int capacity)
	{
		this.stack=new int[capacity];
		this.top=-1;
		this.capacity=capacity;
	}
	public void push(int element)
	{
		if(top==capacity-1)
		{
			System.out.println("Stack overflow");
			return;
		}
		stack[++top]=element;
		System.out.println("Successfully inserted "+element);
	}
	public int pop()
	{
		if(isEmpty()==true)
		{
			System.out.println("Stack underflow");
			return -1;
		}
		int element=stack[top--];
		return element;
	}
	public int peek()
	{
		if(isEmpty()==true)
		{
			System.out.println("Stack underflow");
			return -1;
		}
		return stack[top];
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public int size()
	{
		return top+1;
	}
	public void display()
	{
		if(isEmpty()==true)
		{
			System.out.println("Stack underflow");
			
		}
		else
		{
			for(int i=0;i<=top;i++)
			{
				System.out.print(stack[i]+" ");
			}
			System.out.println();
		}
	}
}

public class Stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter Stack size: ");
	 	int n = sc.nextInt();
	 	StackOperation s = new StackOperation(n); 

        int choice;
        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Peek");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int ele = sc.nextInt();
                    s.push(ele);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    int peeked = s.peek();
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
