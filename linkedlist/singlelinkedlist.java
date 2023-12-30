package linkedlist;


import java.util.HashSet;



class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
 
class singlelinkedlist {
    Node head; // head of list

    public Node addbeginning(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
        return head;
    }
    
    public void insertEnd(int data)
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
    public void insertAfter(int n,int data)
    {
        int size = getCount();
        if(n < 1 || n > size)
        {
            System.out.println(n+" is IndexOutOfBoundsException  thrown if the index is negative or greater than the list size ( index < 0 || index >= size() \n so it Can't be inserted\n");
        }
        else
        {
            Node newNode = new Node(data);
            Node temp = head;
            while(--n > 0)
            //  System.out.println(n);
                temp=temp.next;
            newNode.next= temp.next;
            temp.next = newNode;
        }
    }

   
 
    public int getCount()
    {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
     public int getsum()
    {
        Node temp = head;
        int sum = 0;
        while (temp != null) {
            sum+=temp.data;
            temp = temp.next;
        }
        return sum;
    }
    public int getmax() 
    { 
    int max = Integer.MIN_VALUE; 
    Node temp = head;
    while (temp != null)
    { 
        if (max < temp.data) 
            max = temp.data; 
        temp = temp.next; 
    } 
    return max; 
    } 
  
    public int getmin() 
    { 
    int min = Integer.MAX_VALUE;
    Node temp = head;
    while (temp != null) 
    { 
        if (min > temp.data) 
            min = temp.data; 
        temp = temp.next; 
    } 
    return min; 
    } 

    public void searchNode(int data )
    {
    Node temp = head;
    boolean flag = false;  
    while(temp != null)
    {   
         if(temp.data == data){
            flag = true;  
                 break; 
    }
    temp = temp.next;
    }
     if(flag)
        System.out.println("the given data "+data+" is Found\n");
    else
        System.out.println("the given data "+data+" is Not Found\n");
    }

    void deleteNode(int position) {
        if (head == null)
          return;
        Node temp = head;
    
        if (position == 0) {
          head = temp.next;// Delete from beginning
          return;
        }
        for (int i = 0; temp != null && i < position - 1; i++)  // Find the key to be deleted 5-1=4temp
          temp = temp.next;
        //   System.out.println("temp"+temp.data); //10 element

        if (temp == null || temp.next == null)  // If the key is not present
          return;
    
        Node next = temp.next.next;
        // System.out.println("next.next"+temp.next.next.data);  // Remove the node//next.next =3element
        temp.next = next;
        // System.out.println("next"+next.data); //3element
      
      }

      static Node removeLastNode(Node head)
      {
          if (head == null)
              return null;
          if (head.next == null) 
              return null;

          Node second_last = head;
            //  System.out.println("second+_last"+second_last.data);
            //    System.out.println("second+_last"+second_last.next.data);
            //     System.out.println("second+_last"+second_last.next.next.data);//12
          while (second_last.next.next != null)
              second_last = second_last.next;//13
            //    System.out.println("secondlast"+second_last.data);//1
          second_last.next = null;
          return head;
      }

    public void sortList()
    {
        Node temp = head, index = null;
        int var;
            while (temp != null) {
                index = temp.next; // Node index will point to node next to temp
 
                while (index != null) {
                    if (temp.data < index.data) {  // If temp node's data is greater than index's node data, swap the data between them
                        var = temp.data;
                        temp.data = index.data;
                        index.data = var;
                    }
                    index = index.next;
                }
                temp = temp.next;
            }
        }
    public static Node reverseLinkedList(Node head) {
            Node previous = null;
            Node temp = head;
            Node next=null;

            while (temp != null) {
                next = temp.next;//13//12//11//10//3//2//1//1   //    System.out.println("next"+next.data);
                temp.next = previous;
                previous = temp;//100//13//12//11//10//3//2//1
                temp = next;//13//12//11//10//3//2//1//1  //    System.out.println("temp"+temp.data);
            }
            head = previous;  
            return head;
           

        }
    
// lessthan for descending 
//greaterthen for acsending
    static boolean isSorted(Node head) 
{  
    if (head == null) 
        return true; 
    for (Node temp=head; temp.next != null; temp=temp.next)
       if (temp.data < temp.next.data) // the next element is greater than the previous element,2>3 ascending
            return false; 
           return true; 
}

 public void addNode(int data)
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

    public static void concat(Node head1, Node head2)
    {
        Node temp  = head1;
        Node temp2=head2;
        while (temp.next != null)
        {
            // System.out.println("temp"+temp.data);
            temp = temp.next;
            // System.out.println("temp1"+temp.data);  
        }
        temp.next = temp2;
        //  System.out.println("temp21"+temp2.data);
        // System.out.println("temp21"+temp.next.data); //  temp2 = null;
    }
    
    static boolean checkLoop(Node head)
	{
        Node temp=head;
		HashSet<Node> hset = new HashSet<Node>();
		while ( temp != null) {
			if (hset.contains(temp))
				return true;
			hset.add(temp);
			temp = temp.next;
		}
		return false;
	}

    static int compare(Node node1, Node node2) {
  
        if (node1 == null && node2 == null) {
            return 1;
        }
        while (node1 != null && node2 != null && node1.data == node2.data) 
        {
            node1 = node1.next;
            node2 = node2.next;
        }
       
        if (node1 != null && node2 != null) { // if the list are different in size
            return (node1.data > node2.data ? 1 : -1);
        }
  
        if (node1 != null && node2 == null) { // if either of the list has reached end
            return 1;
        }
        if (node1 == null && node2 != null) {
            return -1;
        }
        return 0;
    }
  
   
    static Node removeDuplicates(Node head)
    {
        if (head == null)
            return null;
        if (head.next != null) {
            Node del; /* Pointer to store the pointer of a node to be deleted*/
            if (head.data == head.next.data) {   /* Compare head node with next node */
                del = head.next;
                head.next = head.next.next;
                removeDuplicates(head);
            }
            else {
                removeDuplicates(head.next);
            }
        }
        return head;
    }

    static Node recursivereverse(Node head) {
        if(head == null) {
            return head;
        }
        if(head.next == null) {  // last node or only one node
            return head;
        }
        Node new_Node = recursivereverse(head.next);
        head.next.next = head;
        head.next = null;
        return new_Node;
    } 
    
 

 public void display() {   
        Node temp = head;   //Node temp will point to head      
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of linked list: ");    
        while(temp != null) {    
            System.out.print(temp.data + " "); //Prints each node by incrementing pointer    
            temp = temp.next;    
        }    
        System.out.println(); 
          
    }
    void display1() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }


  
    
public static void main(String[] args)
    {
        singlelinkedlist llist = new singlelinkedlist();// Start with the empty list
        llist.addbeginning(1);
        llist.addbeginning(3);
        llist.addbeginning(1);
        llist.addbeginning(2);
        llist.addbeginning(1);
        llist.display(); 

        llist.insertEnd(9);
        llist.insertEnd(10);
        llist.insertEnd(11);
        llist.insertEnd(12);
        llist.insertEnd(13);
        llist.display();
        System.out.println("Count of nodes is "+ llist.getCount());
        System.out.println("sum of element is "+ llist.getsum());
        System.out.println("max of element is "+ llist.getmax());
        System.out.println("min of element is "+ llist.getmin());
        llist.searchNode(100);  
        llist.insertAfter(3,100);
        llist.insertAfter(-1,100);/* The IndexOutOfBoundsException exception is throw if the index is negative or greater than the list size ( index < 0 || index >= size() ) */

        if(isSorted(llist.head))
            System.out.println("Yes");
        else
         System.out.println("No");

        System.out.println("Count of nodes is "+ llist.getCount());
        llist.sortList();  
        llist.display(); 

    
        if(isSorted(llist.head))
            System.out.println("Yes the list is  sorted");
        else
         System.out.println("No");

        llist.deleteNode(5);//9 value is deleted from 5 node
        llist.display(); 

        System.out.println("removing last element");
        llist.head = removeLastNode(llist.head); 
       
        System.out.println("reverse  element");
        llist.head=reverseLinkedList(llist.head);
        llist.display(); 

        singlelinkedlist llist1 = new singlelinkedlist();
        llist1.addNode(101);
        llist1.addNode(102);
        llist1.addNode(103);
        llist1.addNode(104);
        llist1.addNode(101);
        llist1.display();
        singlelinkedlist llist2 = new singlelinkedlist();
        llist2.addNode(101);
        llist2.addNode(102);
        llist2.addNode(103);
        llist2.addNode(104);
        llist2.addNode(108);
        llist2.display();
   
        int value;    
        value=compare(llist1.head,llist2.head);
        System.out.println();
        if(value==0){
            System.out.println("both are same ");
        }
        else if(value==1){
            System.out.println("both are not same ");
        }
        else{
            System.out.println("either the size is greater");
        }
      
       
        
        System.out.println();
        System.out.println("concatinate  element");
        concat(llist1.head,llist2.head);
        llist1.display();


           /*Create loop for testing */
        llist1.head.next.next = llist1.head.next;//(103position is pointing to 102position) so loop will be created
        if (checkLoop(llist1.head))
			System.out.println("Loop found");
		else
			System.out.println("No Loop found");
      
        
    singlelinkedlist ll = new singlelinkedlist();
    ll.addNode(53);
    ll.addNode(53);
    ll.addNode(49);
    ll.addNode(49);
    ll.addNode(35);
    ll.addNode(28);
    ll.addNode(28);
    ll.addNode(23);

    System.out.println();
    System.out.println("removal of duplicates");
    removeDuplicates(ll.head);
    ll.display();

    
    // System.out.println();
    // recursivereverse(ll.head);
    // ll.display1(); 
   
    

        }
    }


