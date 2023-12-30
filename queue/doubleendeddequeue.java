import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class doubleendeddequeue {
    
  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    deque.addFirst(1);
    deque.addLast(2);
    int first = deque.removeFirst();
    int last = deque.removeLast();
    System.out.println("First: " + first + ", Last: " + last);

        deque.add(100);
        deque.addFirst(9);
        deque.addLast(10);
         deque.addFirst(0);
        deque.addLast(170);
        deque.push(8);
         deque.push(6);
        deque.offer(0);
        deque.offerFirst(70);
        System.out.println(deque + "\n");
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing "+ "first and last: "+ deque);
        System.out.println(deque.pop());
        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        // deque.clear();
        //  System.out.println(deque);

        Deque<String> dq= new ArrayDeque<String>();
 
        // add() method to insert
        dq.add("I");
        dq.addFirst("can");
        dq.addLast("do");
        dq.add("It");
         System.out.println("is element in queue : "+dq.contains("do"));
 
        for (Iterator itr = dq.iterator();
            itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
 
        System.out.println();
 
        for (Iterator itr = dq.descendingIterator();
            itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
         System.out.println("element  "+deque.element());//retrive head from queue
          System.out.println("peek: "+deque.peek());
           System.out.println("peekfirst: "+deque.peekFirst());
           System.out.println("peeklast: "+deque.peekLast());
          System.out.println("current queue : "+deque);
           System.out.println("size: "+deque.size());

  }
}
    

