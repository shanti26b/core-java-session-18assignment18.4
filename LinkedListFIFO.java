package Assignment18;  // here i am creating package name as Assignment18  

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListFIFO {    // creating class name as LinkedListFIFO
	
	public static void main (String []args){   // Main method 
		
		
		  Queue<String> myQueuelist = new LinkedList<String>();   //here created LinkedList  of string type implementing queue
		  
		        myQueuelist.add("Superman");    //inserting elements in the my queue list objects 
		        myQueuelist.add("Batman");
		        myQueuelist.add("Ironman");
		        myQueuelist.offer("Antman");
		         
		        for(String element : myQueuelist){   //  here it  inserts the specified element into the queue by using the
				                                     //for each loop and prints the elements in the my queue list            
	
		            System.out.println("Elements are : " + element);
		        }
		        
		        System.out.println("Queue : " + myQueuelist); // element() this method retrieves the head of the queue.
		        
		        
		        
		        System.out.println(myQueuelist.peek());                     
		      
		        System.out.println("After peek : " + myQueuelist);
		        
		        System.out.println(myQueuelist.poll());
		        
		        System.out.println("After poll : " + myQueuelist);          
		      
		        
		        System.out.println(myQueuelist.remove()); // here this remove() method retrieves and removes the head of this queue.               
		       
		        
		        System.out.println("After remove : " + myQueuelist); 
		        
		            
		    }                                                        
		 //after that  it pull the second element to the first so on by poll method and later it removes the element by remove method
		
	}
	

