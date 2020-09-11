package gg;
import java.util.*;
/*
 * Double ended queue is a more generalized form of queue data structure which allows insertion and removal of elements from both the ends, i.e , front and back.
 insertFront(): Adds an item at the front of Dequeue.
insertLast(): Adds an item at the rear of Dequeue.
deleteFront(): Deletes an item from front of Dequeue.
deleteLast(): Deletes an item from rear of Dequeue.

getFront(): Gets the front item from queue.
getRear(): Gets the last item from queue.
isEmpty(): Checks whether Dequeue is empty or not.
isFull(): Checks whether Dequeue is full or not.


 */
public class Double_ended_queue {

    static int  arr[]; 
    static int  front; 
    static int  rear; 
    static int  size=0; 
    static Scanner sc=new Scanner(System.in);
    public Double_ended_queue (int size) 
    { 
        arr = new int[size]; 
        front = -1; 
        rear = 0; 
        
    } 
    public boolean isFull() 
    { 
        return ((front == 0 && rear == size-1)|| 
            front == rear+1); 
    } 
    public boolean isEmpty () 
    { 
        if (front == -1)
        	
        	return true;
        else 
        	return false;
    } 
    public void insertfront(int key) 
    { 
        // check whether Dequeue is full or not 
        if (isFull()) 
        { 
            System.out.println("Overflow");  
            return; 
        } // To check queue is initially empty or not
        else if (front == -1) 
        { 
            front = 0; 
            rear = 0; 
           
        } 
    
         else if (front == 0) 
         {	front = size - 1 ; 
       
         }
        else // decrement front end by '1' 
         front = front-1; 
       
        // insert current element into Dequeue 
        arr[front] = key ; 
        
    }
       public void insertrear(int key) 
        { 
            if (isFull()) 
            { 
                System.out.println(" Overflow "); 
                return; 
            } 
       
            // If queue is initially empty 
            if (front == -1) 
            { 
                front = 0; 
                rear = 0; 
            } 
       
            // rear is at last position of queue 
            else if (rear == size-1) 
                rear = 0; 
       
            // increment rear end by '1' 
            else
                rear = rear+1; 
              
            // insert current element into Dequeue
            arr[rear] = key ; 
        } 

       public int deletefront() 
        { 
            // check whether Dequeue is empty or not 
            if (isEmpty()) 
            { 
                System.out.println("Queue Underflow"); 
                return 0; 
            
            }
            int a=arr[front];
            // Dequeue contains only one element 
             if(front == rear) 
            { 
                front = -1; 
                rear = -1; 
            } 
            else if (front == size -1) 
            front = 0; 
                // To check back to initial position 
                
       
                else 
                    // front value from Dequeue 
                    front = front+1; 
         return a;
        } 
       public int deleterear() 
        { 
            if (isEmpty()) 
            { 
                System.out.println(" Underflow"); 
                return 0; 
            } 
            int a=arr[rear];
            // Dequeue has only one element 
            if (front == rear) 
            { 
                front = -1; 
                rear = -1; 
            } 
            else if (rear == 0) 
                rear = size-1; 
            else
                rear = rear-1; 
            
            return a;
        } 
    
        public int getFront() 
        { 
    // check whether Dequeue is empty or not 
        	if (isEmpty()) 
        	{ 
        		System.out.println(" Underflow"); 
        		return -1 ; 
        	} 
        		return arr[front]; 
        }	 
    
       public int getRear() 
        { 
            // check whether Dequeue is empty or not 
            if(isEmpty() || rear < 0) 
            { 
                System.out.println(" Underflow\n"); 
                return -1 ; 
            } 
            return arr[rear]; 
        } 
        public void display( ) 
        { 
        		//Displaying the entire queue
        		if ( front == -1 ) 
        		{  
        		 	System.out.println("\n QUEUE IS EMPTY");  
        			 return; 
        		} 
        		System.out.println("\n The elements of the queue are : ");
        		if (front <= rear ) 
        		{  
        			while (front <= rear)  
        			{   
        				System.out.println(arr[front]);   
        				front++;  
        			} 
        		} 
        		else
        		{  
        			while (front <= size - 1)  
        			{   
        				System.out.println( arr[front]);   
        				front++;  
        			}  
        			front = 0;  
        			while (front <= rear)  
        			{   
        				System.out.println(arr[front]);   
        				front++;  
        			} 
        		} 
        		
        	}

        
    
        public static void main(String[] args) 		//Main function to call the above defined functions
        { 
              System.out.println("Enter size of double ended queue");
               size=sc.nextInt();
             Double_ended_queue ob = new Double_ended_queue(size); 
             do
             {
             System.out.println("The following operations you can perform on Dequeue");
             System.out.println("1. Insert at front end");
             System.out.println("2. Insert at rear end");
             System.out.println("3. Delete at front end");
             System.out.println("4. Delete at rear end");
             System.out.println("5. Get the value at front end");
             System.out.println("6. Get the value at rear end");
             System.out.println("7. Printing all elements of Dequeue");
             int choice=sc.nextInt();
             switch(choice)
             {
             case 1:
            	 System.out.println("Enter the value you want to insert at front end");
            	 int value=sc.nextInt();
            	 ob.insertfront(value);
            	 break;
             case 2:
            	 System.out.println("Enter the value you want to insert at rear end");
            	 int value1=sc.nextInt();
            	 ob.insertrear(value1);
            	 break;
             case 3:
            	 int val=ob.deletefront();
            	 System.out.println("The deleted value from the dequeue is"+val);
            	 break;
             case 4:
            	 int val1=ob.deleterear();
            	 System.out.println("The deleted value from the dequeue is"+val1);
            	 break;
             case 5:
            	 int v=ob.getFront();
            	 System.out.println("The front element is"+v);
            	 break;
             case 6:
            	 int v1=ob.getRear();
            	 System.out.println("The rear element is"+v1);
            	 break;
             case 7:
            	 if(front<=rear)
            	 { for(int i=front;i<=rear;i++)
            			 System.out.println(arr[i]);
            	 }
            	 else 
            	 { for(int i=0;i<=rear;i++)
            			 System.out.println(arr[i]);
            	 	for( int i=front;i<=size-1;i++)
            	 		 System.out.println(arr[i]);
            	 }
            	 break;
            default:
            	System.out.println("Invalid choice");
            	 
            
            	 
          }
        }
             while(true);

   }
    
    
    
    
}
    
    
    
    
    
    
    


