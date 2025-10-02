//import java.util.Scanner;
public class LinkedList 
{
    Node head;
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(int data)
    {
        Node newNode =new Node(data);       // Create node 
        if(head==null)                      //If list is empty then add element 
        {
            head=newNode;
            return;
        }

        newNode.next=head;                   // Insert at begining 
        head=newNode;
    }
    public void printList()                  // Print linked list
    {
        Node temp = head;
        while (temp != null) 
        {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertAtEnd(int data)
    {
        Node currentNode=head;
        Node newNode =new Node(data);       // Create node 
        if(head==null)                      //If list is empty then add element 
        {
            head=newNode;
            return;
        }
        
        if(currentNode.next!=null)
        {
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
        
    }
    public static void main(String[] args) 
    {
        //Scanner sc=new Scanner(System.in);

        //System.out.println("Enter the element in the linked list :- ");
        //int data=sc.nextInt();
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.insertAtEnd(30);
        ll.printList();
    }
}
