package practical;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class AddOffer {

	public static void main(String[] args) {
		
		Queue q = new ArrayBlockingQueue(3);
		
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		
		System.out.println(q);
		
		Queue q1 = new ArrayBlockingQueue(2);
		
		q1.add(1);
		q1.add(2);
		q1.add(3);
		
		System.out.println(q1);
	}
}
