
    import java.util.HashSet;
import java.util.Set;
 
public class findduplicaterowinmatrix {
    public static void main(String[] args)
    {
        int mat[][] =
        {
            {0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0}
        };
 
        Set<Integer> set = new HashSet<>();
 
        // do for each row `i`
        for (int i = 0; i < mat.length; i++)
        {
            int decimal = 0;
 
            // convert binary row `i` to its decimal equivalent
            for (int j = 0; j < mat[i].length; j++) {
                decimal += mat[i][j] * Math.pow(2, j);
            }
 
            // if the decimal value is seen before
            if (set.contains(decimal)) {
                System.out.println("Duplicate row found: Row #" + (i + 1));
            }
            else {
                set.add(decimal);
            }
        }
    }
}

