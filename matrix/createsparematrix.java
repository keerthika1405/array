package matrix;
/*A matrix is said to be sparse matrix if most of the elements of that matrix are 0.
 It implies that it contains very less non-zero elements.*/
public class createsparematrix 
    {    
        public static void main(String[] args) {   

            int count = 0;    
            int a[][] = {{4, 0, 0,8,0},    
                         {0, 5, 0,0,8},    
                         {0, 0, 6,9,0}};     
            int rows = a.length;    
            int cols = a[0].length;    
            int size = rows * cols;
          
       
            for(int i = 0; i < rows; i++){    
                for(int j = 0; j < cols; j++){    
                    if(a[i][j] == 0)    
                        count++;    
                    }    
                }    
           
            if(count > (size/2)){    
                System.out.println("Given matrix is a sparse matrix");}    
            else {   
                System.out.println("Given matrix is not a sparse matrix"); }   
        }
    }    
    


