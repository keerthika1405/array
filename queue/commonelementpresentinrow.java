
    import java.util.HashMap;
import java.util.Map;
 
public class commonelementpresentinrow {

    private static void findCommon(int[][] mat)
    {
        // base case
        if (mat == null || mat.length == 0) {
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();
 
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[0].length; j++)
            {
                // insert elements of the first row into the map and
                // initialize them with a value of 1
                if (i == 0) {
                    map.put(mat[0][j], 1);
 
                    // if matrix contains the single row, print all its elements
                    if (mat.length == 1) 
                    {
                        System.out.println("inside if");
                        System.out.print(mat[i][j] + " ");
                    }
                }
 
                // from the second row onwards, check if the current element exists in the map and first in the current row
                if (i > 0 && map.containsKey(mat[i][j]) && map.get(mat[i][j]) == i)
                {
                      System.out.println(i);
                       System.out.println(j);
                       System.out.println(mat[i][j]);
                    System.out.println("secondif");
                    map.put(mat[i][j], i + 1);
 
                    // if `i` represent the last row, print the element
                    if (i == mat.length - 1) {
                         System.out.println("seconfiif");
                        System.out.print(mat[i][j] + " ");
                    }
                }
            }
        }
    }
 
    public static void main(String[] args)
    {
        int[][] mat =
        {
            { 2, 4, 3, 8, 7 },
            { 2, 7, 1, 3, 6 },
            { 3, 5, 2, 1, 8 },
            { 4, 5, 0, 2, 5 },
        };
        findCommon(mat);
    }
}

