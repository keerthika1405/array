import java.util.ArrayList;

public class circularqueue {

 
// Declaring the class variables.
private int size, front, rear;
 
// Declaring array list of integer type.
private ArrayList<Integer> queue = new ArrayList<Integer>();
 
// Constructor
circularqueue(int size)
{
    this.size = size;
    this.front = this.rear = -1;
}
 
// Method to insert a new element in the queue.
public void enQueue(int data)
{
    if((front == 0 && rear == size - 1) ||(rear == (front - 1) % (size - 1)))// Condition if queue is full.
    {
        System.out.print("Queue is Full");
    }
 
    else if(front == -1)
    {
        front = 0;
        rear = 0;
        queue.add(rear, data);
    }
 
    else if(rear == size - 1 && front != 0)
    {
        rear = 0;
        queue.set(rear, data);
    }
 
    else
    {
        rear = (rear + 1);
        if(front <= rear)  // Adding a new element if
        {
            queue.add(rear, data);
        }
        else
        {
            queue.set(rear, data);    // Else updating old value
        }
    }
}
 

public int deQueue()
{
    int temp;
 
    // Condition for empty queue.
    if(front == -1)
    {
        System.out.print("Queue is Empty");
        return -1;    // Return -1 in case of empty queue
    }
 
    temp = queue.get(front);
 
    // Condition for only one element
    if(front == rear)
    {
        front = -1;
        rear = -1;
    }
    else if(front == size - 1)
    {
        front = 0;
    }
    else
    {
        front = front + 1;
    }
    return temp;
}
 

public void displayQueue()
{
    if(front == -1) // Condition for empty queue.
    {
        System.out.print("Queue is Empty");
        return;
    }
 
    // If rear has not crossed the max size ,queue rear is still greater then front.
    System.out.print("Elements in the " +  "circular queue are: ");
 
    if(rear >= front)
    {
        for(int i = front; i <= rear; i++)
        {
            System.out.print(queue.get(i));
            System.out.print(" ");
        }
        System.out.println();
    }
 
    // If rear crossed the max index and  indexing has started in loop
    else
    {
        // Loop for printing elements from front to max size or last index
        for(int i = front; i < size; i++)
        {
            System.out.print(queue.get(i));
            System.out.print(" ");
        }
        // Loop for printing elements from 0th index till rear position
        for(int i = 0; i <= rear; i++)
        {
            System.out.print(queue.get(i));
            System.out.print(" ");
        }
        System.out.println();
    }
}
 
// Driver code
public static void main(String[] args)
{
     
    circularqueue q= new circularqueue(5);
    q.enQueue(14);
    q.enQueue(22);
    q.enQueue(13);
    q.enQueue(-6);
     
    q.displayQueue();
 
    int x = q.deQueue();
 
    // Checking for empty queue.
    if(x != -1)
    {
        System.out.print("Deleted value = ");
        System.out.println(x);
    }
 
    x = q.deQueue();
 
    // Checking for empty queue.
    if(x != -1)
    {
        System.out.print("Deleted value = ");
        System.out.println(x);
    }
 
    q.displayQueue();
     
    q.enQueue(9);
    q.enQueue(20);
    q.enQueue(5);
     
    q.displayQueue();
     
    q.enQueue(20);
}
}
    

