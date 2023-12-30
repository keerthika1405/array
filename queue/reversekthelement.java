import java.util.*;
public class reversekthelement{
    public static void main(String[]args){
    Queue<Integer>queue=new ArrayDeque<>();
       queue.offer(10);
       queue.offer(20);
       queue.offer(30);
       queue.offer(40);
       queue.offer(50);
       queue.offer(60);
       queue.offer(70);
       queue.offer(80);
       System.out.println(queue);
       int k=4;
       reverse(queue,k);
    }
    public static void reverse(Queue<Integer>queue,int k){
        Stack<Integer> st=new Stack<>();
        {
            for(int i=0;i<k;i++){
                st.push(queue.remove());
            }
            for(int i=0;i<k;i++){
                queue.offer(st.pop());
            }

            int count=queue.size()-k;
            for(int i=0;i<count;i++){
                queue.offer(queue.remove());
            }
            System.out.println(queue);
           
           
        }
}
}