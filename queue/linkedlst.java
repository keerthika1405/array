import java.util.*;
public class linkedlst{
    public static void main(String[]args){
        //better to use addlast and removefirst
        LinkedList<Integer> queue=new LinkedList<>();
        //add
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println(queue);

        queue.offer(200);
        System.out.println(queue);
        //addlast
        queue.addLast(100);
        System.out.println(queue);
        //remove
        queue.remove();
        System.out.println(queue);
        //removefirst
        System.out.println(queue.removeFirst()); 
        System.out.println(queue.removeFirst());
        System.out.println(queue);
        // here below adding at first will want to shift the remaining element to get space new element 
        //removing at last in queue take iteration ,so it traverse to last element to remove an element
       
        queue.addFirst(1000);
        System.out.println(queue);

        System.out.println(queue.removeLast());
        System.out.println(queue);
    
        // System.out.println(Stack);
    }
}