package queue;
import java.util.*;
import java.io.*;
/*Queue: It is a linear structure which follows FIFO(First In First Out) principle to perform various tasks.

It is used when data is transferred asynchronously

*/

	// Java program for array 
	// implementation of queue 
	  
	// A class to represent a queue 
	public class Queue { 
	   static int front, rear, size; 
	  
	    static int arr[]; 
	  
	    static Scanner sc=new Scanner(System.in);
	    public Queue()
	    {
	    System.out.println("Enter size of queue ");
	    size =sc.nextInt();
	    int front = -1;
	    rear=-1;
	    arr=new int[size];
	    }
	    
	    // Method to add an item to the queue. 
	    // It changes rear and size 
	    static void enqueue(int item) 
	    { 
	        if (rear==size-1) 
	           System.out.println("No more element can be added to queue ");
	        	else
	        	{
	        		rear=rear+1;
	        	arr[rear]=item;
	        	
	        	System.out.println(item+" has been added successfully ");
	    } 
	    }
	  
	    // Method to remove an item from queue. 
	    // It changes front and size 
	    public static int dequeue() 
	    { 
	    	int item = 0;
	       
	        	
	        
	         if(front==rear)
	        	{
	        	front=-1;
	        	return arr[rear];
	        	
	        	}
	        
	        else
	        { 		 item = arr[front];
	        			front = front+1;
	        } 
	     
	        return item;
	        }
	  
	  

	  
	//Main method

	    public static void main(String[] args) 
	    { 
	        Queue queue = new Queue(); //Creating object of class
	        do
	        {
	       System.out.println("Enter a choice");

	       System.out.println("1. Adding an element into queue");

	       System.out.println("2. Removing an element from queue");
	       
	       System.out.println("3. Displaying the queue");
	    
	       int choice=sc.nextInt();
	       switch(choice)  	//Switch case to display choices
	       {
	       case 1:		//Adding element to queue
	    	   System.out.println("Enter item to insert into queue");
	    	   int item=sc.nextInt();
	    	   enqueue(item);
	    	   break;
	    	   
	       case 2:		// Deleting element from queue
	    	   if (front==-1) 
	  	         System.out.println("Cannot delete any more element");
	    	   else
	    	   { int a=dequeue();
			System.out.println("The deleted item of the queue is "+a);
	    	   }
			break;
	       case 3:		//Displaying the queue
	    	 
	    	   for(int i=front;i<=rear;i++)
	    	   {
	    		   System.out.println(arr[i]);
	    	   }
	    	   break;
	       default:
	    	   System.out.println("Wrong selection");
	    	  
	       
	       
	       }
	       
	        }
	        while(true);
	    } 
	} 
	  
	
