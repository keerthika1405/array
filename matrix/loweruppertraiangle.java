package  matrix;
public class loweruppertraiangle {
    
public static void main(String[] args) {     
            int a[][] = {{1, 2, 3},    
                        {8, 6, 4},    
                        {4, 5, 6}    
                        };    
            int rows = a.length;    
            int cols = a[0].length;    
                
              if(rows != cols){    
                  System.out.println("check input -->Matrix should be a square matrix");    
              }  

              else {       
                  for(int i = 0; i < rows; i++){    
                      for(int j = 0; j < cols; j++){    
                        if((j > i)||(i>j))
                            System.out.print(a[i][j] + " ");                           
                        else                           
                            System.out.print("0 ");   
                        }
                    System.out.println();    
                }    
            }    
      }   
}
