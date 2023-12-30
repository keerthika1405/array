package linkedlist;
import Node;

class Node {
        int data;
        Node next;
        Node prev;
    };
public class doublecircularlinkedlist {
    // Start with the empty list
    static Node start = null;
 
    // Function to insert Node at
    // the beginning of the List
    static void insertBegin(int value)
    {
        // If the list is empty
        if (start == null) {
            Node new_node = new Node();
            new_node.data = value;
            new_node.next = new_node.prev = new_node;
            start = new_node;
            return;
        }
 
        // Pointer points to last Node
        Node last = (start).prev;
 
        Node new_node = new Node();
 
        // Inserting the data
        new_node.data = value;
 
        // Update the previous and
        // next of new node
        new_node.next = start;
        new_node.prev = last;
 
        // Update next and previous
        // pointers of start & last
        last.next = (start).prev = new_node;
 
        // Update start pointer
        start = new_node;
    }
 
    // Function to traverse the circular
    // doubly linked list
    static void display()
    {
        Node temp = start;
 
        System.out.printf("\nTraversal in" + " forward direction \n");
        while (temp.next != start) 
        {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("%d ", temp.data);
 
        System.out.printf("\nTraversal in "+ "reverse direction \n");
        Node last = start.prev;
        temp = last;
 
        while (temp.prev != last) {
            System.out.printf("%d ", temp.data);
            temp = temp.prev;
        }
        System.out.printf("%d ", temp.data);
    }

    public static void main(String[] args)
    {
 
        insertBegin(5);
        insertBegin(4);
        insertBegin(7);
 
        System.out.printf("Created circular doubly"+ " linked list is: ");
        display();
    }
}
    

