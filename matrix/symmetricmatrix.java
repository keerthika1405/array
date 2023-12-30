package matrix;
public class symmetricmatrix {

public static void main(String[] args) {     
        int matrix[][] = {{1, 2, 3},    
                          {2, 6, 4},    
                          {3, 4, 6}    
                    }; //expert diagonal remaining corresponding should be same is called as symmetrix
    int rows = matrix.length;    
    int cols = matrix[0].length; 
    if(rows != cols)
    {
        System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
    }
    else
    {
        boolean symmetric = true; 
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if(matrix[i][j] != matrix[j][i])
                {
                    symmetric = false;
                    break;
                }
            }
        }
         
        if(symmetric)
        {
            System.out.println("The given matrix is symmetric...");
        }
        else
        {
            System.out.println("The given matrix is not symmetric...");
        }
    }
    
}
}
