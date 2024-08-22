package collection_framework;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		// Head
		System.out.println("Head of queue is: "+ q1.element());
		
		try {
			q1.add(40);
			
		} catch (IllegalStateException e) {
			// TODO: handle exception
			System.out.println("You try to add too much item");
		}
		
		for(Integer value:q1) {
			System.out.println("Queue value: "+value);
		}
		System.out.println("Removed from the queue: "+q1.remove());
		System.out.println("Removed from the queue: "+q1.remove());
		System.out.println("Removed from the queue: "+q1.remove());
		
		try {
			System.out.println("Removed from the queue: "+q1.remove());
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("Tried to remove too items from the queue");
		}
		
		////////////////////////////////////
		
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		System.out.println("Queue 2 peek: " +q2.peek());
		
		q2.offer(1);
		q2.offer(2);
		
		System.out.println("Queue 2 peek: " +q2.peek());

		if(q2.offer(3) == false) {
			System.out.println("Offer failed to add third item.");
		}
		
		for(Integer value:q2) {
			System.out.println("q2 value is: "+ value);
		}
		System.out.println("Queue 2 poll: "+q2.poll());
		System.out.println("Queue 2 poll: "+q2.poll());
		System.out.println("Queue 2 poll: "+q2.poll());

		

	}

}
