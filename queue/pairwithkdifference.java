
    import java.util.HashSet;
import java.util.Set;
 
public class pairwithkdifference {
   
    public static void findPair(int[] A, int diff)
    {
/*HashSet contains unique elements only. HashSet allows null value. */  
        Set<Integer> set = new HashSet<>();
 
    
        for (int i: A)
        {
          
            if (set.contains(i - diff)) {
                System.out.println("(" + i + ", " + (i - diff) + ")");
            }

            if (set.contains(i + diff)) {
                System.out.println("(" + (i + diff) + ", " + i + ")");//print like this to avoid negative  val
            }
            
            set.add(i);
        }
    }
 
    public static void main(String[] args)
    {
        int[] A = { 1, 5, 2, 2, 2, 5, 5, 4};
        int diff = 3;
 
        findPair(A, diff);
    }
}


