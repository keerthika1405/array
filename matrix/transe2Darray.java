package matrix;
//transpoe 2Darray


class transe2Darray{
    public static void main(String[]args){
        int [][]arr={{1,2,3,4,},
                     {6,7,8,9,},
                     {1,2,3,4}
                     };
        int n=arr.length, m=arr[0].length;

        int transpose[][]=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[j][i]=arr[i][j];
            }
        }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(transpose[i][j]+" ");
            }System.out.println();
        } 
    }
}
       
        

    

