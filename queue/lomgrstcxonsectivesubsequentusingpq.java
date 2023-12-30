
    import java.io.*;
import java.util.PriorityQueue;
public class lomgrstcxonsectivesubsequentusingpq {
   
    static int findLongestConseqSubseq(int arr[], int N)
    {
 
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < N; i++) {
            pq.add(arr[i]); // adding element from array to PriorityQueue
        }

        int prev = pq.poll();
        System.out.println("prev---> "+prev);
        int c = 1;
        int max = 1;
 
        for (int i = 1; i < N; i++)
         {
           System.out.println("i "+i);

            if (pq.peek() - prev > 1) {
            System.out.println("1");
            System.out.println("prev "+prev);
            System.out.println("peek "+pq.peek());
                c = 1;
                prev = pq.poll();
            }

            else if (pq.peek() - prev == 0) {
            System.out.println("2");
            System.out.println("prev "+prev);
            System.out.println("peek "+pq.peek());
                 
                prev = pq.poll();
            }
        
            else {
                System.out.println("3");
                c++;
                prev = pq.poll();
                System.out.println("prevelse "+prev);
            }
            if (max < c) {
               System.out.println("max "+max);
                System.out.println("c "+ c);
                max = c;
            }
        }
 
        return max;
    }
 
    // Driver Code
    public static void main(String args[])
        throws IOException
    {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;
        System.out.println("Length of the Longest consecutive subsequence is "+ findLongestConseqSubseq(arr, n));
    }
}

//complexity O(N log N)