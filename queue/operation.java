import java.util.*;
public class operation{
    public static void main(String[]args){
        //add at last and remove at first
        Queue<Integer> qu=new ArrayDeque<>();
        //add
        qu.offer(10);
        qu.offer(20);
        qu.offer(30);
        qu.offer(40);
        qu.offer(50);
        System.out.println(qu);
        //size
        System.out.println(qu.size());
        //peek
        int pk=qu.peek();
        System.out.println(pk);
        qu.remove();
        qu.offer(60);
        System.out.println(qu);
        


    }
}