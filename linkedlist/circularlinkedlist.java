package linkedlist;
import Node;

class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

public class circularlinkedlist {

    public Node head = null;
    public Node tail = null;
    int size=0;

    public void add_Node(int element){
        Node newNode = new Node(element);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void insertBegin(int data){
        Node new_Node = new Node(data);
        if(head == null) {
            head = new_Node;
            tail = new_Node;
            new_Node.next = head;
        }
        else {
            new_Node.next=head;
            head=new_Node;
            tail.next = head;
        }
        size++;
    }

    public void insertEnd(int element){
        Node newEle = new Node(element);
        if(head == null) {
            head = newEle;
            tail = newEle;
            newEle.next = head;
        }
        else {
            tail.next=newEle;
            newEle.next=head;
            tail=newEle;
        }
        size++;
    }

    void middleinsert(int n)
    {
        Node nextNode=new Node(n);
        Node temp = head;
        if (temp == null)
        {
            nextNode.next = nextNode;
            head = nextNode;
        }
        else if (temp.data >= nextNode.data)
        {
            for(int i=0; temp.next != head; i++)
            temp = temp.next;
            temp.next = nextNode;
            nextNode.next = head;
            head = nextNode;
        }
        else
        {
            while (temp.next != head && temp.next.data < nextNode.data)
                temp = temp.next;
            nextNode.next = temp.next;
            temp.next = nextNode;
        }
    }

    public void display() {  //print function
        Node temp = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Nodes of the circular linked list: ");
            do{
                System.out.print(" "+ temp.data);
                temp = temp.next;
            }
            while(temp != head);
            System.out.println();
        }
    }

    public void deleteFirst() {
        if(head == null) {
            return;
        }
        else {
            if(head != tail ) {
                head = head.next;
                tail.next = head;
            }
            else {
                head = tail = null;
            }
        }
    }
    
    public void deleteLast() {
        if(head == null) {
            return;
        }
        else {
            if(head != tail ) {
                Node current = head;
                while(current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = head;
            }
            else {
                head = tail = null;
            }
        }
    }
    public void deleteNthNode(int n)
    {
        int len = calcLen();

        // Can only insert after 1st position
        // Can't insert if position to insert is greater than size of Linked List
        if(n < 1 || n > len)
        {
            System.out.println("Can't delete\n");

        }
        else
        {
            if(n == 1)
            {
                // head has to be deleted
                System.out.println("Deleted: " + head.data);
                head = head.next;
                return;
            }
            // required to traverse
            Node temp = head;
            Node previous = null;

            // traverse to the nth node
            while(--n > 0) {
                previous = temp;
                temp = temp.next;
            }
            // assigned next node of the previous node to nth node's next
            previous.next = temp.next;
            System.out.println("Deleted: " + temp.data);
        }
    }
    public int calcLen(){
        int len = 0;
        Node temp=head;

        while(temp!=tail){
            temp = temp.next;
            len++;
        }
        return len;
    }
    public static void main(String[] args) {
        circularlinkedlist llist = new circularlinkedlist();
         
        llist.add_Node(10);
        llist.add_Node(20);
        llist.add_Node(30);
        llist.add_Node(40);
        llist.add_Node(50);
        llist.display();

        llist.insertBegin(1);
        llist.insertBegin(2);
        llist.insertBegin(3);
        llist.insertBegin(4);
        llist.insertBegin(5);
        llist.display();

         
        llist.insertEnd(11);
        llist.insertEnd(22);
        llist.insertEnd(33);
        llist.insertEnd(44);
        llist.insertEnd(55);
        llist.display();

      
        llist.middleinsert(0);
        llist.display();

        System.out.println("List After Deleting first node");
        llist.deleteFirst();
        llist.display();

        llist.deleteLast();
        System.out.println("List After Deletion");
        llist.display();

        llist.deleteNthNode(4);
        System.out.println("List After Deletion");
        llist.display();
    }
}

