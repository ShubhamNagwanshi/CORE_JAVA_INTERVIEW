package practical;

import java.util.*;

public class EqualHashCodeTestAllCollections {
    public static void main(String[] args) {

        // Creating test objects
        EqualHashCode e1 = new EqualHashCode(1, "Shubham", 2000);
        EqualHashCode e2 = new EqualHashCode(1, "Shubham", 2000);
        EqualHashCode e3 = new EqualHashCode(10, "Naman", 5000);
        EqualHashCode e4 = new EqualHashCode(12, "Naman", 5000);

        // 1. Using Set
        Set<EqualHashCode> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        System.out.println("Set contents:");
        System.out.println(set);

        // 2. Using List
        List<EqualHashCode> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        System.out.println("\nList contents:");
        System.out.println(list);

        // Removing one object from the list
        list.remove(e2); // Removes the first match (e1, since e1.equals(e2))
        System.out.println("List after removing e2:");
        System.out.println(list);

        // 3. Using Queue
        Queue<EqualHashCode> queue = new LinkedList<>();
        queue.offer(e1);
        queue.offer(e2);
        queue.offer(e3);
        queue.offer(e4);
        System.out.println("\nQueue contents:");
        System.out.println(queue);

        // Polling from the queue
        System.out.println("Polled from queue: " + queue.poll());
        System.out.println("Queue after polling:");
        System.out.println(queue);

        // 4. Using Map
        Map<EqualHashCode, String> map = new HashMap<>();
        map.put(e1, "Employee 1");
        map.put(e2, "Employee 2"); // Overwrites e1 because e1.equals(e2)
        map.put(e3, "Employee 3");
        map.put(e4, "Employee 4");
        System.out.println("\nMap contents:");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Removing an entry from the map
        map.remove(e2);
        System.out.println("Map after removing e2:");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
