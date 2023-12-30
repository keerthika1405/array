package matrix;
public class sparsematrix {
    public static void main(String[] args)
    {
        int mySparseMatrix[][] = {{0, 0, 7, 0, 3},
                                  {0, 9, 0, 7, 0},
                                  {6, 0, 0, 0, 0},
                                  {0, 4, 0, 0, 0}};
         int mySparseMatrix1[][] = {{0, 0, 0, 0, 10},
                                   {0, 10, 0, 10, 0},
                                   {10, 0, 0, 0, 0},
                                   {0, 10, 0, 0, 0}};
int size = 0;
for (int i = 0; i < 4; i++)
    {
    for (int j = 0; j < 5; j++)
        {
        if (mySparseMatrix[i][j] != 0)
        {
        size++;
        }
        }
    }
    System.out.println("size of nonzero "+size);

int resMatrix[][] = new int[size][3];
// Making of new matrix
int k = 0;
for (int i = 0; i < 4; i++)
    {
    for (int j = 0; j < 5; j++)
        {
        if (mySparseMatrix[i][j] != 0)
            {
            resMatrix[k][0] = i;
            resMatrix[k][1] = j;
            resMatrix[k][2] = mySparseMatrix[i][j];
            k++;
            }
        }
}
for (int i = 0; i < size; i++)
    {
    for (int j = 0; j < 3; j++)
        {
        System.out.print(resMatrix[i][j]+"  ");
        }System.out.println();
    }


int size1=0;
    for (int i = 0; i < 4; i++)
    {
    for (int j = 0; j < 5; j++)
        {
        if (mySparseMatrix1[i][j] != 0)
        {
        size1++;
        }
        }
    }
        System.out.println("size1 of nonzero "+size1);
int resMatrix1[][] = new int[size1][3];
// Making of new matrix
int t = 0;
for (int i = 0; i < 4; i++)
    {
    for (int j = 0; j < 5; j++)
        {
        if (mySparseMatrix1[i][j] != 0)
            {
            resMatrix1[t][0] = i;
            resMatrix1[t][1] = j;
            resMatrix1[t][2] = mySparseMatrix1[i][j];
            t++;
            }
        }
}
for (int i = 0; i < size1; i++)
    {
    for (int j = 0; j < 3; j++)
        {
        System.out.print(resMatrix1[i][j]+"  ");
        }System.out.println();
    }
 System.out.println("Addition of size and size1 matrix of resultant matrixes ");
int result[][] = new int[size1][3];
// Making of new matrix
int ans = 0;
for (int i = 0; i < 4; i++)
    {
    for (int j = 0; j < 5; j++)
        {
        if ((mySparseMatrix[i][j]!=0) && (mySparseMatrix1[i][j] != 0))
            {
            result[ans][0] = i;
            result[ans][1] = j;
            result[ans][2] =  mySparseMatrix[i][j]+mySparseMatrix1[i][j];
            ans++;
            }
        }
}
for (int i = 0; i < size1; i++)
    {
    for (int j = 0; j < 3; j++)
        {
        System.out.print(result[i][j]+"  ");
        }System.out.println();
    }

}  
}
