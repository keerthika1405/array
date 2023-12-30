package  matrix;
/* 
a tridiagonal matrix is a band matrix that has nonzero elements only on the main diagonal,
 the subdiagonal/lower diagonal (the first diagonal below this),
 and the supradiagonal/upper diagonal (the first diagonal above the main diagonal).*/
public class tridigonalmatrix {

public static void main(String[] args) {     
        int matrix[][] = {{1, 2, 0, 0, 0},    
                          {2, 6, 4, 0, 0},    
                          {0, 3, 4, 6, 0},
                          {0, 0, 3, 4, 6},  
                          {0, 0, 0, 4, 6}      
                    };
        int n=matrix.length;
        int rows = matrix.length;    
        int cols = matrix[0].length; 
        System.out.println(n);
        int nonzero=3*n-2;
        System.out.println(nonzero);//nonzero
        if(rows != cols)
        {
            System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
               if (i - j == 1)
                  System.out.print(matrix[i] [j]+" ");
               
               else if (i - j == 0)
                   System.out.print(matrix[i][j]+" ");

               else if (i - j == -1)
                  System.out.print(matrix[i][j]+" ");
               
               else
                   System.out.print("0"+" ");
               

        }System.out.println();
    }
}
}