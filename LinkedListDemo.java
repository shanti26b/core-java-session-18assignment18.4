package Assignment18;    // here i am showing package name as Assignment18

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;



public class LinkedListDemo {      // creating class name as LinkedListDemo
	
	public static void main (String []args){   // main method
		
		 LinkedList<String> studentname = new LinkedList<>();//created an interface for student name list of type string for linkedList
	        
		  studentname.add("Sachin"); //initializing elements and creating the student name list objects for the list
		  studentname.add("Ganguly");
		  studentname.addLast("Dravid");
		  studentname.addFirst("Laxman");
		  studentname.add("Anil Kumble");
		  
		  System.out.println("The elements of linked list are : " ); 
		  
              Iterator<String> iterator=studentname.iterator(); //traversing the elements of the object list  by using iterator method
		  
                                               //while loop is used to iterate a part of the program several times
              while(iterator.hasNext()){       //implementing the for each loop to traverse the elements
			  
		   System.out.println(iterator.next());  
		
		  }
		 
		         List<String> list = new ArrayList<>();  // adding the arrayList objects at the end of the linked list 
		
		  list.add("Dhoni"); 
		  
		  list.add("Virat");
		  
		  studentname.addAll(list); //here list.addAll() this method add  the two objects list elements and prints the values
		
		  System.out.println("The elements after joining the arraylist are : " +list); 
		  
		    ListIterator<String> listIterator=studentname.listIterator(); //here it shows all the elements which are also added 
		    
	        while(listIterator.hasNext()){ 
	        	
	        	
	        
		   System.out.println(listIterator.next());  

		  }
		 
		    System.out.println("Traversing elements in backward direction..."); //here iterating the by reverse direction
		     
		  while( listIterator.hasPrevious()){                        //this method will displays the elements in the backward direction 
			  
			   System.out.println( listIterator.previous());   //and prints the values

		  }
		  }  

	}


