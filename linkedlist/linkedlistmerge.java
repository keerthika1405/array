package linkedlist;
class node {
            int data;
            node next;
     
            public node(int data) 
            { this.data = data; }
        }
     
public class linkedlistmerge{
  
        node head = null;   
        node sortedMerge(node a, node b)//left and right
        {
            node result = null;
            // Base cases
            if (a == null)
                return b;
            if (b == null)
                return a;
            System.out.println("a"+a.data);
            System.out.println("b"+b.data);
            // Pick either a or b, and recur
            if (a.data < b.data) {
                result = a;
                System.out.println("resulta"+result.data);
                result.next = sortedMerge(a.next, b);
                 System.out.println("aifnext"+result.next.data);
            }
            else {
                result = b;
                System.out.println("resultb"+b.data);
                result.next = sortedMerge(a, b.next);
                System.out.println("resultnext"+result.next.data);
       
            }
     
            return result;
        }
     
        node mergeSort(node h)//head
        {
            if (h == null || h.next == null) {
                return h;
            }
     
            node middle = getMiddle(h); // get the middle of the list
            System.out.println("middle"+middle.data);
            node nextofmiddle = middle.next;
            middle.next = null;
            node left = mergeSort(h); // Apply mergeSort on left list
            System.out.println("left"+left.data);
            node right = mergeSort(nextofmiddle);  // Apply mergeSort on right list
            System.out.println("right"+right.data);

            node sortedlist = sortedMerge(left, right);// Merge the left and right lists
            System.out.println("sortedlist"+sortedlist.data);
            return sortedlist;
        }
     
        public static node getMiddle(node head)
        {
            if (head == null)
                return head;
     
            node slow = head, fast = head;
            System.out.println("slow"+slow.data);
              System.out.println("fast"+fast.data);
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                System.out.println("slownext"+slow.next.data);
                fast = fast.next.next;
                System.out.println("fastnextnext"+fast.data);
                // System.out.println("fast"+fast.next.next.data);
            } 
            System.out.println("return slow"+slow.data);
            return slow;
        }
     
        void addNode(int new_data)
        {
            node new_node = new node(new_data);
            new_node.next = head;
            head = new_node;
        }
    
        void printList(node headref)
        {
            while (headref != null) {
                System.out.print(headref.data + " ");
                headref = headref.next;
            }
        }
     
    public static void main(String[] args)
        {
            linkedlistmerge li = new linkedlistmerge();
            li.addNode(4);
            li.addNode(7);
            li.addNode(3);
            li.addNode(8);
     
            System.out.print("\nOriginal List: \n");
            li.printList(li.head);
            li.head = li.mergeSort(li.head);
     
            System.out.print("\nSorted List: \n");
            li.printList(li.head);
        }
    }