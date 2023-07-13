import java.util.*;

public class Task {
public static void main(String[] args) {
        int a[] = new int[] { 2, 3, 9, 5, 1 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum of an array:" + sum);
        System.out.println("\n");

        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(8);
        l.add(3);
        l.add(7);
        l.add(9);
        System.out.println("List of datas:" + l);

        Stack<Integer> stack = new Stack<>();
        for(int i=4;i>=0;i--)
    {
        stack.push(l.get(i));
    }
       System.out.println("Reverse order:"+ stack);
       System.out.println("\n");
       
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        Queue<Integer> evenindex = new LinkedList<>();
        int index = 0;

        for (Integer value : queue) {
            if (index % 2 == 0) {
                System.out.println("Elements at even index " + index + ": " + value);
                evenindex.add(value);
            }
            index++;
        }

        System.out.println("\n");

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < 5; i += 2) {
            map.put(i, l.get(i));
        }
        System.out.println("Odd index elements: " + map);
        System.out.println("Linked List : " + l);
        System.out.println("Stack : " + stack);
        System.out.println("Queue : " + evenindex);
        System.out.println();
    }

}
