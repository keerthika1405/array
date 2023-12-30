

package linkedlist;
class Node {
            int data;
            Node next;
            public Node(int data) 
            { 
            this.data = data;
            this.next = null;
            }
        }
public class linkedlistinsertion {   
        Node head;
        Node sorted;
        void addNode(int data)
        {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        void insertionSort(Node headref)
        {
            sorted = null;
            Node temp = headref;
            while (temp != null) {    // Traverse the given linked list and insert every Node to sorted
                Node next = temp.next;
                // System.out.println("next"+temp.next.data);
                sortedInsert(temp); // insert temp in sorted linked list
                temp = next;
                // Update temp
               
            }
            head = sorted;  // Update head to point to sorted linked list 
        }
        // function to insert a new_node in a list. Note that this function expects a pointer to head as this can modify the head of the input linked list
        // (similar to addNode())
        void sortedInsert(Node newNode)
        {
            
            System.out.println("newnod1"+newNode.data);
           
            if (sorted == null || sorted.data >= newNode.data) {
               
                System.out.println("if");
                System.out.println("NEWNODENEXT"+newNode.next.data);
                newNode.next = sorted;
                sorted = newNode;
                 System.out.println("newnode2"+newNode.data);
                System.out.println("sorted2"+sorted.data);
            }
            else {
                System.out.println("else");
                Node temp = sorted;
                System.out.println(temp.data);
                System.out.println(temp.next.data);
                System.out.println(newNode.data);
                while (temp.next != null && temp.next.data < newNode.data) {
                    System.out.println("insidewhile");
                    temp = temp.next;
                }
                newNode.next = temp.next;
                      System.out.println("after"+temp.next.data);
                temp.next = newNode;
                  System.out.println("after"+newNode.data);
            }
        }
      
        void display(Node head)
        {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
    public static void main(String[] args)
        {
            linkedlistinsertion list = new linkedlistinsertion();
            list.addNode(4);
            list.addNode(7);
            list.addNode(3);
            list.addNode(8);
            System.out.println("Linked List before Sorting..");
            list.display(list.head);
            list.insertionSort(list.head);
     
            System.out.println("\nLinkedList After sorting");
            list.display(list.head);
        }
    }
    

