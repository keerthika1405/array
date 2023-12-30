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
public class linkedlistbubble {
        public Node head = null;
        public Node tail = null;

        public void addNode(int data)
        {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        public void sortList()
        {
            Node temp = head, index = null;
            int var;
            if (head == null) {
                return;
            }
            else {
                while (temp != null) {
                    index = temp.next;
                    while (index != null) {
                        if (temp.data > index.data) {
                            var = temp.data;
                            temp.data = index.data;
                            index.data = var;
                        }
                        index = index.next;
                    }
                    temp = temp.next;
                }
            }
        }
        public void display()
        {
            Node temp = head;
            if (temp == null) {
                System.out.println("List is empty");
                return;
            }
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
     
        public static void main(String[] args)
        {
            linkedlistbubble sList = new linkedlistbubble();
            sList.addNode(8);
            sList.addNode(3);
            sList.addNode(7);
            sList.addNode(4);
            System.out.println("Original list: ");
            sList.display();
            sList.sortList();
            System.out.println("Sorted list: ");
            sList.display();
        }
    }

