 import java.util.HashMap;

 public class hashonesandtwossubsequent {
    // Returns largest subarray with
    // equal number of 0s and 1s
 
    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
 
        int sum = 0;
        int max_len = 0;
        int ending_index = -1;
        // int start_index = 0;
 
        for (int i = 0; i < n; i++) {
            arr[i] = (arr[i] == 0) ? -1 : 1;
            System.out.println(" loop1"+arr[i]+" "+i);
        }


        for (int i = 0; i < n; i++) {
           System.out.println("for");
           sum += arr[i]; // Add current element to sum
 
            if (sum == 0) {
            System.out.println("sum  "+sum);
                max_len = i + 1;
                ending_index = i;
            }
            if (hashmap.containsKey(sum))
             {
                   System.out.println("i1 "+i);
                if (max_len < i - hashmap.get(sum)) 
                {
                    System.out.println("i "+i);
                    max_len = i - hashmap.get(sum);
                    ending_index = i;
                }
            }
            else 
                hashmap.put(sum, i);
        }
 


        for (int i = 0; i < n; i++)
         {
            arr[i] = (arr[i] == -1) ? 0 : 1;
            System.out.println(" loop2"+arr[i]);

        }
 
        int start = ending_index - max_len + 1;
        System.out.println(start + " to " + ending_index);
        return max_len;
    }
 

    public static void main(String[] args)
    {
        hashonesandtwossubsequent sub = new hashonesandtwossubsequent();
        int arr[] = {  0, 0, 0, 0, 1, 0, 1 };
        int n = arr.length;
 
        sub.maxLen(arr, n);
    }
}

