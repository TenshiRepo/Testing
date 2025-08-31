
import java.util.LinkedList;
import java.util.Queue;
public class q {
    public static void main(String[] args) {
    
       Queue queue = new LinkedList<Integer>();


            
            queue.offer(105);
            queue.offer(107);
            queue.offer(112);
            queue.offer(115);
            queue.poll();
            queue.poll();
            queue.offer(117);
            queue.poll();
            queue.offer(100);
            queue.peek();
            System.out.println("top: " + queue.peek());
            queue.poll();
            queue.offer(201);
            queue.offer(302);
            queue.poll();
            queue.poll();
            queue.peek();
            System.out.println("top: " + queue.peek());
            queue.isEmpty();
            System.out.println("Final Element: " + queue);




    }
}
