
    import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class sameorderofgivenpattern {
    public static void patternMatch(List<String> words, String pattern)
    {
      
        if (words == null || pattern == null) {
            return;
        }

        int len = pattern.length(); // `len` stores the length of the pattern
      
     System.out.println(len);
        for (String word: words)
        {
          
            Map<Character, Character> map1 = new HashMap<>();  // `map1` stores the mapping from word to the pattern
            Map<Character, Character> map2 = new HashMap<>();       // `map2` stores the mapping from pattern to word
 
            // proceed only when the length of the pattern and word is the same
            if (word.length() == len)
            {
                 System.out.println(word.length());
            
 int i;
                for ( i = 0; i < len; i++)      // process each character in both word and pattern
                {
                   
                    char w = word.charAt(i); // `w` stores the current character of the current word
                    char p = pattern.charAt(i);// `p` stores the current character of the pattern
 
                    /* Check mapping from the current word to the given pattern */
                    // if `w` is seen for the first time, store its mapping to `p`
                    // in `map1`
                    var prev = map1.putIfAbsent(w, p);
                    System.out.println("prev "+prev);
                    // if `w` is seen before, its mapped character should be `p`
                    if (prev != null && map1.get(w) != p) 
                    {
                        break;
                    }
 
                    /* Check mapping from the given pattern to the current word */
                    // if `p` is seen for the first time, store its mapping to `w`
                    // in `map2`
                    prev = map2.putIfAbsent(p, w);
                    System.out.println("p "+p);
                       System.out.println("prev1 "+prev);
                    // if `p` is seen before, its mapped character should be `w`
                    if (prev != null && map2.get(p) != w) {
                        break;
                    }
                }
 
                // if the current word matches the pattern, print it
                if (i == len) {
                    System.out.println("i "+i);
                       System.out.println("len "+len);
                    System.out.println(word);
                }
            }
        }
    }
 
    public static void main(String[] args)
    {
        // list of words
        List<String> words = Arrays.asList("leet", "abcd", "loot", "geek", "cool", "for", "peer", "dear", "seed");
 // "meet", "noon", "otto", "mess", "loss"
       
        String pattern = "moon";
 
        patternMatch(words, pattern);
    }
}

