import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
 
class replaceelementwithrank
{
    public static void transform(int[] input)
    {
        Map<Integer, Integer> map = new TreeMap<>();
 
        for (int i = 0; i < input.length; i++) {
            map.put(input[i], i);
        }
 
        // keys are stored in sorted order in `TreeMap`
        /*HashMap implements Map interface while TreeMap implements SortedMap interface */
 
        int rank = 1;
        // iterate through the map and replace each element with its rank
        for (var val: map.values()) {
            System.out.println(map.values());
             System.out.println("val "+val);
            input[val] = rank++;//post increment rank
               System.out.println("input "+input[val]);
              
        }
    }
 
    public static void main(String[] args)
    {
        int[] input = { 10, 8, 15, 12, 6, 20, 1 };
 
        // transform the array
        transform(input);
 
        // print the transformed array
        System.out.println(Arrays.toString(input));
    }
}
