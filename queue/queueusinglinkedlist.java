

class Node {
    int data;
    Node next;
 
    // constructor to create a new linked list node
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
 
// A class to represent a queue
// The queue, front stores the front node of LL and rear
// stores the last node of LL
class Queue {
    Node front, rear;

    public Queue() 
    { this.front = this.rear = null; }
 
    // Method to add an data to the queue.
    void enqueue(int data)
    {
        Node temp = new Node(data);   // Create a new LL node
        if (this.rear == null) {    // If queue is empty, then new node is front and rear both
            this.front = temp;
             this.rear = temp;
            return;
        }
        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }
 
    void dequeue()
    {
        if (this.front == null)    // If queue is empty, return NULL.
            return;
        
        // Store previous front and move front one node ahead
        Node temp = this.front;
        this.front = this.front.next;
 
        // If front becomes NULL, then change rear also as  NULL
        if (this.front == null)
            this.rear = null;
    }
}
 
// Driver code
public class queueusinglinkedlist{
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + ((q.front != null) ? (q.front).data : -1));
        System.out.println("Queue Rear : " + ((q.rear != null) ? (q.rear).data : -1));
    }
}