package com.anudip.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Test01_PriorityQueue {

	public static void main(String[] args) {
		
		//not follo the indexing
		//following insertion order
		//following the FIFO prinic
		//duplicate elements are allowed but null is not allowed
		
		
		
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(); 
		  arrayDeque.offer(15); 
		  arrayDeque.offer(25); 
		  arrayDeque.offer(35); 
		  arrayDeque.add(100);
		  arrayDeque.offerFirst(10);
		  arrayDeque.offerLast(10);
		  System.out.println(arrayDeque);
		  
		  arrayDeque.poll();   //FIFO princi
		  System.out.println(arrayDeque);
		  
		  
		  arrayDeque.pollFirst();
		  
		  System.out.println(arrayDeque);
		  arrayDeque.pollLast();
		  System.out.println("++++++++++++++");
		  System.out.println(arrayDeque);
		  
		  Integer peek = arrayDeque.peek();
		  System.out.println(peek);
		  
		  Integer peekLast = arrayDeque.peekLast();
		  System.out.println(peekLast);
		  
		 // boolean b = arrayDeque.add(null);
		  arrayDeque.offer(35); 
		  arrayDeque.offer(35); 
		  System.out.println(arrayDeque);
		  
		  System.out.println("++++++++++++++++++++++++++++++++++");
		  
		  
		  
		  //first give the priority to lowest elem
		  //next follow the FIFO
		  //to remove the elme it follo the FIFO
		  //no support of addFirst or last  or peekFirst linke methods
		  
		  PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); 
		  priorityQueue.offer(25); 
		  priorityQueue.offer(10); 
		  priorityQueue.offer(8); 
		  priorityQueue.offer(35); 
		  System.out.println(priorityQueue); //[8, 25, 10, 35]
		  priorityQueue.offer(4); 
		  System.out.println(priorityQueue); //[4,8, 25, 10, 35]
		  
		  priorityQueue.poll();
		  System.out.println(priorityQueue); //[8, 25, 10, 35]
		  
		  
		 
		  
		  
		  
	}
}
