package matrix;
//90deg
import java.util.*;
class transpose90array{
    public static void main(String[]args){
        int[][] arr={{1,2,3,4,},
                     {6,7,8,9,},
                     {1,2,3,4},
                     {6,7,8,9}
                     };
        int n=arr.length;
        System.out.println(n);
        System.out.println(Arrays.toString(arr[2])+"\n");
//transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            reverse(arr[i]) ;
            System.out.println(Arrays.toString(arr[i]));
        }

    }
//reverse
    public static void reverse(int[]arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    
        
        }
   

}
