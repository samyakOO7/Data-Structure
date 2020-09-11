package queue;

import java.util.Scanner;

/*
 * Circular Queue: It is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle and the last position is connected back to the first position to make a circle.
 * 
 */
public class Circular_queue {
	 static int front;
	static int rear;
	static int size;
	 static int arr[];
	 static Scanner sc=new Scanner(System.in);
	 Circular_queue(int s) 
	    { 
		
	       front = rear = -1;     //Initializing front and rear as -1
	       size = s; 
	      arr = new int[s]; 
	    } 
	 public void enQueue(int value)  //Adding element into queue
	 { 
	     if ((front == 0 && rear == size-1) || 			
	             (front==rear+1)) 			//Condition for checking queue is full or not
	     { 	
	         System.out.println("\nQueue is Full"); 
	         return; 
	     } 
	   
	     else if (front == -1) /* Condition for Inserting First Element */
	     { 
	         front = rear = 0; 
	         arr[rear] = value; 
	     } 
	   
	     else if (rear == size-1 && front != 0) 	//Condition for checking is first element empty for adding 
	     { 
	         rear = 0; 
	         arr[rear] = value; 
	     } 
	   
	     else								// Condition for traversing and adding
	     { 
	         rear++; 
	         arr[rear] = value; 
	     } 
	 } 
	     public int deQueue() 				//Deleting elements from queue
	    { 
	     if (front == -1) 					//Condition for checking queue is empty or not
	     { 
	         System.out.println("\nQueue is Empty"); 
	         return 0;
	     } 
	   
	     int data = arr[front]; 
	     arr[front] = -1; 
	     if (front == rear) 				// Condition for checking last element of queue to delete
	     { 
	         front = -1; 
	         rear = -1; 
	     } 
	     else if (front == size-1) 			// Condition for checking last position of element to delete
	         front = 0; 
	     else
	         front++; 						//Traversing and deleting elements
	   
	     return data; 
	 } 
	     public void displayQueue() 		//Displaying elements of queue
	     { 
	         if (front == -1) 
	         { 
	             System.out.println("\nQueue is Empty"); 
	             return; 
	         } 
	         System.out.println("\nElements in Circular Queue are: "); 
	         if (rear >= front) 
	         { 
	             for (int i = front; i <= rear; i++) 
	                 System.out.println(arr[i]); 
	         } 
	         else
	         { 
	             for (int i = front; i < size; i++) 
	                 System.out.println(arr[i]); 
	       
	             for (int i = 0; i <= rear; i++) 
	                 System.out.println(arr[i]); 
	         } 
	     } 
	       
	public static void main(String[] args) {			//Main Function
		// TODO Auto-generated method stub
		System.out.println("Enter size of queue");
		int s=sc.nextInt();
		Circular_queue a=new Circular_queue(s);
		do
		{	//Opertion performed by switch case
		System.out.println("Enter the operation you want to perform in circular queue");
		System.out.println("1. Adding element into queue");
		System.out.println("2. Deleting element from queue");
		System.out.println("3. Displaying element of queue");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the element you want to add");
			int value = sc.nextInt();
			a.enQueue(value);
			break;
		case 2:
			int data=a.deQueue();
			System.out.println("The deleted element is"+data);
			break;
		case 3:
			a.displayQueue();
			break;
		default:
			System.out.println("Wrong input for choice");
		}}
		while(true);
		
	

}
}