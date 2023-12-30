package matrix;

class Node {  
    int row,col,value;  
    Node next;  
    Node(int r, int c, int val)   
    { 
        row = r; col = c; 
        this.value = val;
    }  
}  
public class sparematrix{  
    public static void main(String[] args)  
        {  
        int sparseMatrix[][] = {{0, 0, 1, 2},  
                                {3, 0, 0, 0},  
                                {0, 4, 5, 0},  
                                {0, 6, 0, 0}};  
Node start = null; /*Start with the empty list*/  
Node tail = null;  
//  int k = 0; 
for (int i = 0; i < 4; i++)  
for (int j = 0; j < 4; j++)  
{  
if (sparseMatrix[i][j] != 0) /*Pass only non-zero values*/  
        {  
        Node box = new Node(i, j, sparseMatrix[i][j]);  
                box.next = null; 

                if(start == null)
                {  
                start = box;  
                tail=box;  
                }  
                else{  
                tail.next = box;  
                tail = tail.next;  
                }  
        }  
}
System.out.println("row"+" "+"col"+" "+"value");   
// Node itr = start;  
while(start != null){  
System.out.println(start.row + "   " + start.col + "    " + start.value);  
start = start.next;  
}  
}  
}