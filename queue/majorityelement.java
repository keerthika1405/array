import java.util.HashMap;
import java.util.Map;
 
class majorityelement{
   
    public static int findMajorityElement(int[] nums)
    {
        
        Map<Integer, Integer> map = new HashMap<>();
 
        // store each element's frequency in a map
        for (int i: nums) {
            System.out.println("i "+i );
            System.out.println( " default "+map.getOrDefault(i, 0));
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
 
       
        for (Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if (entry.getValue() > nums.length/2) {
                 System.out.println( "entryvalue "+entry.getValue());
                 System.out.println( "entrykey "+entry.getKey());
                return entry.getKey();
            }
        }
 
     
        return -1;
    }
 
    public static void main (String[] args)
    {
        // assumption: valid input (majority element is present)
        int[] nums = { 1, 8, 7, 4, 1, 1, 1, 1, 1, 2, 1,1 };
 
        int result = findMajorityElement(nums);
        if (result != -1) {
            System.out.println("The majority element is " + result);
        }
        else {
            System.out.println("The majority element doesn't exist");
        }
    }
}


// public class boyermooremajorityalgo {
  
//     // Function to find the majority element present in a given array
//     public static int findMajorityElement(int[] nums)
//     {
     
//         int m = -1;   // `m` stores the majority element (if present)
//         int count = 0;// initialize counter `i` with 0
 
       
//         for (int j = 0; j < nums.length; j++) // do for each element `nums[j]` in the array
//         {
//              System.out.println("j "+j);
//             if (count == 0)
//             {
//                 System.out.println("if");
//                 // set the current candidate to `nums[j]`
//                 m = nums[j];
 
//                 // reset the counter to 1
//                 count = 1;
//             }
 
//             // otherwise, increment the counter if `nums[j]` is a current candidate
//             else if (m == nums[j]) {
//                  System.out.println("elseif");
//                 count++;
//             }
//             // otherwise, decrement the counter if `nums[j]` is a current candidate
//             else {
//                  System.out.println("else");
//                 count--;
//             }
//         }
//         return m;
//     }
 
//     public static void main (String[] args)
//     {
    
//         int[] nums = { 1, 8, 7, 1, 1, 2, 2, 1, 2, 1, 2 ,1};
 
//         System.out.println("The majority element is " + findMajorityElement(nums));
//     }
// }

