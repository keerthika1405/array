package linkedlist;



 class Node {
        public int data;
        public Node next;
 
        public Node(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
   
public class ReverseLinkedListRecursive {
  public Node head;
     
       

        public void insertNode(int data)
        {
            Node new_node = new Node(data);
            if(head==null)
            {
                head = new_node;
                return;
            }
            Node temp = head;
            while(temp.next!=null)
                temp = temp.next;
            temp.next = new_node;
        }
    
 
    /* Function to print linked list */
    public static void print(Node node) {
        while (node != null) {
            System.out.print(String.valueOf(node.data)+" ");
            node = node.next;
        }
    }
 
    // Complete the reverse function below.
    static Node reverse(Node head) {
        if(head == null) {
            return head;
        }
        // last node or only one node
        if(head.next == null) {
            return head;
        }
        Node newHeadNode = reverse(head.next);
        // change references for middle chain
        head.next.next = head;
        head.next = null;
        // send back new head node in every recursion
        return newHeadNode;
    }
 
  
    public static void main(String[] args){
            ReverseLinkedListRecursive llist = new ReverseLinkedListRecursive();
         
            llist.insertNode(20);
            llist.insertNode(4);
            llist.insertNode(15);
            llist.insertNode(85);
             
            System.out.println("Given linked list:");
            print(llist.head);
             
            System.out.println();
            System.out.println("Reversed Linked list:");
            Node llist1 = reverse(llist.head);
            print(llist1);
 
    }
}

