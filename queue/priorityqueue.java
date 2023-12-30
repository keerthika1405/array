import java.util.*;

public class priorityqueue {
    
   
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
       
        
        for(Iterator iterator = pq.iterator();
        iterator.hasNext();){
        System.out.print(iterator.next() + " ");
    }
    System.out.println();
        for(int i=0;i<3;i++){
            pq.add(i);
        }
        System.out.println("pq"+pq);

        PriorityQueue<Integer> pq1= new PriorityQueue<>();
            pq1.add(0);
            pq1.add(1);
            pq1.add(2);
            // pq1.add(7);
            System.out.println("pq1"+pq1);

        //    System.out.println("comparator "+comparator(pq,pq1));
            // if(pq1==pq){
            //     System.out.println("same");
            // }
        System.out.println("After Remove - " );
        pq.remove();
        System.out.println("After Remove - " + pq);
        System.out.println("Poll Method - " + pq.poll());//, the poll() method is also used to remove the head and return it.
        System.out.println("Final PriorityQueue - " + pq);
        System.out.println("Accessed Element: " + pq.peek());
        System.out.println("Does the queue contain 3? " + pq.contains(3));
        System.out.println("Size of queue: " + pq.size());
        pq.clear();
        System.out.println("Is the queue empty? " + pq.isEmpty());
        
    }

   

   
}
    

