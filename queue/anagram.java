
    import java.util.HashMap;
import java.util.Map;
 
public class anagram {
    
    public static boolean isAnagram(String X, String Y)
    {
        // base case
        if (X == null || Y == null) {
            return false;
        }
        if (X.length() != Y.length()) {
            return false;
        }
 
        Map<Character, Integer> freq = new HashMap<>();
 
        
        for (char c: X.toCharArray()) {
            // System.out.println(freq.getOrDefault(c, 0));
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
 
       
        for (char c: Y.toCharArray())
        {
            // if `y` is not found in the map, i.e., either `y` is not present
            // in string `X` or has more occurrences in string `Y`
            if (!freq.containsKey(c)) {
                return false;
            }
            System.out.println(c);
            System.out.println("freqb "+freq.get(c));  // decrease the frequency of `y` on the map
            freq.put(c, freq.get(c) - 1);
 
            // if its frequency becomes 0, erase it from the map
            if (freq.get(c) == 0) {
                System.out.println("erase");
                freq.remove(c);
            }
        }
 
        // return true if the map becomes empty
        return freq.isEmpty();//true or false
    }
 
    public static void main(String[] args)
    {
        String X = "tommarvoloriddle";        // Tom Marvolo Riddle
        String Y = "iamlordvoldemort";        // I am Lord Voldemort
 
        if (isAnagram(X, Y)) {
            System.out.print("Anagram");
        }
        else {
            System.out.print("Not an Anagram");
        }
    }
}

