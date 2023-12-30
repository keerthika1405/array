package linkedlist;
class node
{
    int data;
    node next;
    node prev;
       
      node(int value){
      data=value;
      next=null;
      prev=null;
    }
}
// Java program to convert insert
// an element at a specific position
// in a circular doubly linked listing,
// end and middle
class doublecircularforll
{
static node head=null;
// Function to display the list
static int displayList()
{
    node temp = head;
    if (temp == null)
        return 0;
    else
    {
        System.out.println( "The list is: ");
 
        while (temp.next != head)
        {
            System.out.print( temp.data + " ");
            temp = temp.next;
        }
 
        System.out.println( temp.data );
 
        return 1;
    }
}
 
// Function to count number of
// elements in the list
static int countList()
{
    // Declare temp pointer to
    // traverse the list
    node temp = head;
 
    // Variable to store the count
    int count = 0;
 
    // Iterate the list and
    // increment the count
    while (temp.next != head)
    {
        temp = temp.next;
        count++;
    }
 
    // As the list is circular, increment 
    // the counter at last
    count++;
 
    return count;
}
 
// Function to insert a node at
// a given position in the
// circular doubly linked list
static void insertAtLocation(int data, int loc)
{
    // Declare two pointers
    node temp=head;
    int i, count;
 
    // count of total elements in the list
    count = countList();
 
    // If list is empty or the position is
    // not valid, return false
    if (temp == null || count < loc)
        return;
 
    else
    {
        // Create a new node in memory
        node newNode = new node(data);
       
        // Iterate till the loc
        for (i = 1; i < loc - 1; i++)
        {
            temp = temp.next;
        }
 
        // See in Image, circle 1
        newNode.next = temp.next;
 
        // See in Image, Circle 2
        temp.next.prev = newNode;
 
        // See in Image, Circle 3
        temp.next = newNode;
 
        // See in Image, Circle 4
        newNode.prev = temp;
    }
 
}
 
// Function to create circular doubly 
// linked list from array elements
static void createList(int arr[], int n)
{
    // Declare newNode and temporary pointer
    node temp=head;
    int i;
 
    // Iterate the loop until array length
    for (i = 0; i < n; i++)
    {
        // Create new node
       node newNode =new node(arr[i]);
 
        // If it is first element
        if (i == 0)
        {
            head = newNode;
              temp=newNode;
        }
 
        else
        {
 
            // Add the last node to make them
            // in circular fashion
            temp.next = newNode;
            newNode.next = head;
            newNode.prev = temp;
            temp = newNode;
        }
    }
}
 //Add new element at the end of the list
//  void push_back(int newElement) {
//     Node newNode = new Node();
//     newNode.data = newElement;
//     newNode.next = null; 
//     newNode.next = null;
//     if(head == null) {
//       head = newNode;
//       newNode.next = head;
//       newNode.prev = head;
//     } else {
//       Node temp = new Node();
//       temp = head;
//       while(temp.next != head)
//         temp = temp.next;
//       temp.next = newNode;
//       newNode.next = head;
//       newNode.prev = temp;
//       head.prev = newNode;
//     }    
//   }
 

//Delete an element at the given position
// void pop_at(int position) { 
//     Node nodeToDelete = head;
//     Node temp = head;
//     int NoOfElements = 0;

//     if(temp != null) {
//       NoOfElements++;
//       temp = temp.next;
//     }
//     while(temp != head) {
//       NoOfElements++;
//       temp = temp.next;
//     }

//     if(position < 1 || position > NoOfElements) {
//       System.out.print("\nInvalid position.");
//     } else if (position == 1) {
//       if(head.next == head) {
//         head = null;
//       } else {
//         while(temp.next != head)
//           temp = temp.next;
//         head = head.next;
//         temp.next = head; 
//         head.prev = temp;
//         nodeToDelete = null; 
//       }
//     } else {
//       temp = head;
//       for(int i = 1; i < position-1; i++)
//         temp = temp.next;
//       nodeToDelete = temp.next;
//       temp.next = temp.next.next;
//       temp.next.prev = temp;
//       nodeToDelete = null;   
//     }
//   }
// Driver Code
public static void main(String args[])
{
    // Array elements to create
    // circular doubly linked list
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    int n = arr.length;
 
    // Create the List
    createList(arr, n);
 
    // Display the list before insertion
    displayList();
 
    // Inserting 8 at 3rd position
    insertAtLocation(8, 3);
    displayList();

    // MyList.pop_at(2);
    // MyList.PrintList();

    // arr.push_back(10);
    // MyList.push_back(20);
    // MyList.push_back(30);
    // MyList.PrintList(); 


}
}
 