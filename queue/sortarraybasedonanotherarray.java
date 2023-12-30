
    import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
 
public class sortarraybasedonanotherarray {
    public static void customSort(int[] first, int[] second)
    {
        Map<Integer, Integer> hashmap = new TreeMap<>();
 
        for (int i: first) {
            System.out.println(hashmap.getOrDefault(i, 0));
            hashmap.put(i, hashmap.getOrDefault(i, 0) + 1);
        }
 
        // Note that once we have the hashmap of all elements ofthe first array, we can overwrite elements of the first array
 
        int index = 0;
        for (int i: second)
        {
            // If the current element is present on the map, print it `n` timeswhere `n` is the frequency of that element in the first array
            int n = hashmap.getOrDefault(i, 0);
             System.out.println("n "+n);
            while (n-- > 0) {
                System.out.println("index "+index);
                 System.out.println("i "+i);
                first[index++] = i;
            }
 
             System.out.println("erase ");
            hashmap.remove(i);
        }
 
        // Now we are left with elements only present in the first array, but not in the second array.
 
        // Sort the remaining elements present on the map (Note that the keys arealready sorted since we are using `TreeMap`)
 /*The java.util.HashMap.entrySet() method in Java is used to create a set out of the same elements contained in the hash map. */
        for (var entry: hashmap.entrySet())
        {
             System.out.println("entryset "+hashmap.entrySet());
            int count = entry.getValue();
            System.out.println("count "+count);
            while (count-- > 0) {
                System.out.println("index1  "+index);
                 System.out.println("key  "+entry.getKey());
                first[index++] = entry.getKey();
            }
        }
    }
 
    public static void main(String[] args)
    {
        int[] first = { 5, 8, 9, 3, 5, 7, 1, 3, 4, 9, 3, 5, 1, 8, 4 };
        int[] second = { 3, 5, 7, 2 };
 
        customSort(first, second);
        System.out.println("The array after sorting is " + Arrays.toString(first));
    }
}

