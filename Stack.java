
package stack;
import java.util.Scanner;
import java.io.*;
/*
 Stack:A stack is a linear data structure that follows the Last in, First out principle (LIFO) i.e. element inserted last will be removed out first.
 
 Push(element): It adds element on top of the stack. It takes O(1) time as each element is inserted starting from the table of the array; there is no need to shift existing elements to make room for the new element.
 
 
 Pop(): It removes the element on top of the stack. It also takes O(1) time as the top contains the index of the most recently added element
 Peek() or Top(): Returns top element of stack.
isEmpty(): Returns true if stack is empty, else false.
 */
public class Stack {
	static int top,n;
	static int a[];
	static Scanner sc=new Scanner(System.in);
	Stack()
	{
		   top=-1;
		 
		 System.out.println("Enter size of the stack: ");
		   n=sc.nextInt();
		   a= new int[n];
	}
	public static void  main(String args[])
	{
	Stack ob=new Stack();
	do
	{
	System.out.println("Enter the operation you want to do in stack: ");
	System.out.println("1. Checking array is empty or not");
	System.out.println("2. Pushing/Adding an element into stack");
	System.out.println("3. Poping/Removing an element out of stack");
	System.out.println("4. Printing top most element in stack");
	System.out.println("5. Displaying the entire stack array");
	int choice=sc.nextInt();
	
	switch(choice)
	{
	case 1:
		boolean b=ob.isEmpty();
		if(b==true)
			System.out.println("array is empty");
		else 
			System.out.println("array is not empty");	
			
		break;
	
	case 2:
		{
		System.out.println("Enter the element you want to push into stack: ");
		int push=sc.nextInt();
		push(push);
		break;
		}
	case 3:
		int pop=ob.pop();
		System.out.println(pop);
		break;
		
	case 4:
	
		int peek=ob.peek();
		System.out.println(peek);
		break;
	case 5:
		display();
		break;
	default:
		System.out.println("Invalid input");
	}
	}
	while(true);

}
	
	    public boolean isEmpty() 
	    { 
	    
			boolean b = (top < 0); 
			return b;
	    } 
	   
	  
	    public static void push(int x) 
	    { 
	        if (top >= (n - 1)) { 
	            System.out.println(" Stack Overflow "); 
	             
	        } 
	        else { 
	            a[++top] = x; 
	            System.out.println(x + "pushed into stack"); 
	          
	        } 
	    } 
	  
	    public int pop() 
	    { if (top < 0) 
	    	{ 
            System.out.println("Stack Underflow"); 
            return 0; 
	    	} 
        else { 
            int x = a[top]; 
            a[top]=0;
            top--;
            return x; 
        	} 
	    } 
  
	    public int peek() 
	    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else 
        { 
            int x = a[top]; 
            return x; 
        } 
        
        } 
	    public static void display()
	    {
	    	for(int i=a.length-1;i>=0;i--)
	    	{
	    		System.out.println(a[i]);
	    	}
	    }
 
}
