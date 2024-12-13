package practical;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		
		Queue queue = new PriorityQueue();
		
		queue.offer(100);
		queue.offer(200);
		queue.offer(300);
		queue.offer(400);
		
		
		System.out.println(queue.element());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.remove(300));
		System.out.println(queue);
		System.out.println(queue.offer(500));
		System.out.println(queue);
		
		System.out.println(queue.size());
		
	}
}
