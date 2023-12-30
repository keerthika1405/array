package  matrix;
class toeplitzmatrix{

    public static void main(String[] args)
    {
        int mat[][] = { { 6, 7, 8, 9 },
                        { 4, 6, 7, 8 },
                        { 1, 4, 6, 7 },
                        { 0, 1, 4, 6 },
                        { 2, 0, 1, 4 } };
      
        if (isToeplitz(mat))
            System.out.println("Matrix is a Toeplitz ");
        else
            System.out.println("Matrix is not a Toeplitz ");
    }      
    public static  int N =5;
    public static  int M = 4 ;
    static boolean isToeplitz(int mat[][])
        {
            for (int i = 0; i < M; i++)    //first loop
            {
                // System.out.println("for1 [i]"+i);
                 // start position (0, i) in the matrix
                if (!checkDiagonal(mat, 0, i))
                    return false;
            }
            for (int i = 1; i < N; i++) //second loop
            {
            //    System.out.println("for2 [i]"+i);
                // start position (i, 0) in the matrix
                if (!checkDiagonal(mat, i, 0))
                    return false;
            }
            return true;
        }
        static boolean checkDiagonal(int mat[][], int i, int j)
        {
            int res = mat[i][j];
             System.out.println("before mat[i][j]"+i+j+" "+(mat[i][j]));
            while (++i < N && ++j < M)
            {
                 System.out.println("after mat[i][j]"+i+j+" "+(mat[i][j]));
                // mismatch found
                if (mat[i][j] != res)
                    return false;
            }
            return true;
        }
}
