
import java.util.HashMap;
import java.util.Map;
 
class Node
{
    int data;
    Node next, random;

    Node(int data) {
        this.data = data;
    }
}
 
public class clonelinkedlistwithrandompointer {
    // Recursive function to print a linked list
    public static void traverse(Node head)
    {
        if (head == null)
        {
            System.out.println("null");
            return;
        }
        if (head.random != null) {
            System.out.print(head.data + "(" + head.random.data + ") > ");
        }
        else {
            System.out.print(head.data + "(" + "X" + ") > ");
        }
        traverse(head.next);
    }

      public static Node cloneLinkedList(Node head)
    {
        HashMap<Node, Node> map = new HashMap<>();   // create a map to store mappings from a node to its clone
 
        // clone data and next pointer for each node of the original// linked list and put references into the map
        cloneLinkedList1(head, map);
        updateRandomPointers(head, map);

        return map.get(head);
    }

     public static Node cloneLinkedList1(Node head, HashMap<Node, Node> map)
    {
        if (head == null) {
            return null;
        }
      
        map.put(head, new Node(head.data));
        map.get(head).next = cloneLinkedList1(head.next, map);
        return map.get(head);
    }
 
    public static void updateRandomPointers(Node head, Map<Node, Node> map){
    
        if (map.get(head) == null) {
            return;
        }
        map.get(head).random = map.get(head.random); // update the random pointer of the cloned node
        updateRandomPointers(head.next, map);   // recur for the next node
    }
  
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
 
        head.random = head.next.next.next;
        head.next.next.random = head.next;
        head.next.next.next.random = head.next.next;
 
        System.out.println("Original Linked List:");
        traverse(head);
 
        Node clone = cloneLinkedList(head);
        System.out.println("\nCloned Linked List:");
        traverse(clone);
    }
}

