
    import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
 
public class isomorphic {
   
    public static boolean isIsomorphic(String X, String Y)
    {
        // base case
        if (X == null || Y == null) {
            return false;
        }
         if (X.length() != Y.length()) {
            return false;
        }
 
       
        Map<Character, Character> map = new HashMap<>(); // use a map to store a mapping from characters of string 'X' to string 'Y'
       
        Set<Character> set = new HashSet<>(); // use set to store a pool of already mapped characters
 
        for (int i = 0; i < X.length(); i++)
        {
            char x = X.charAt(i), y = Y.charAt(i);
 
            // if 'x' is seen before
            if (map.containsKey(x))
            {
                System.out.println("if");
                // return false if the first occurrence of `x` is mapped to a
                // different character
                    System.out.println(map.get(x));
                if (map.get(x) != y) {
                     System.out.println("if1");
                    return false;
                }
            }
 
            // if 'x' is seen for the first time (i.e., it isn't mapped yet)
            else {  
                System.out.println("else");
                // return false if 'y' is already mapped to some other char in 'X'
                if (set.contains(y)) {
                       System.out.println("else1");
                    return false;
                }
 
                // map 'y' to 'x' and mark it as mapped
                 System.out.println("here");
                map.put(x, y);
                set.add(y);
            }
        }
 
        return true;
    }
 
    public static void main(String[] args)
    {
        String X = "ACAB";
        String Y = "XCXY";
 
        if (isIsomorphic(X, Y)) {
            System.out.println(X + " and " + Y + " are Isomorphic");
        }
        else {
            System.out.println(X + " and " + Y + " are not Isomorphic");
        }
    }
}

