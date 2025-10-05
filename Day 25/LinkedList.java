//import java.util.Scanner;
public class LinkedList 
{
    private int size;

    public LinkedList()
    {
        this.size=0;
    }
    

    Node head;
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(int data)
    {
        Node newNode =new Node(data);       // Create node 
        if(head==null)                      // If list is empty then add element 
        {
            head=newNode;
            return;
        }

        newNode.next=head;                   // Insert at begining 
        head=newNode;
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

    public void insertAtMiddle(int data,int position)
    {
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null)
        {
            head=newNode;
            return;
        }
        if(position==1)
        {
            newNode.next=head;
            head=newNode;
            return;
        }
        for(int i=1;i<position-1;i++)
        {
            if(temp==null)
            {
                System.out.println("Postion invalid");
                
            }
            temp=temp.next;   
        }
            newNode.next=temp.next;
            temp.next=newNode;
    }

    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty ");
        }
        head=head.next;
        size--;
    }

    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("List is empty ");
        }
        size--;
        if(head.next==null)
        {
            head=null;
        }
       
        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next!=null)
        {
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }

    public void printList()                  // Print linked list
    {
        Node temp = head;
        if(temp==null)
        {
            System.out.println("List is empty");
        }
        while (temp != null) 
        {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int  getSize(){
        return size;
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
        ll.deleteFirst();
        System.out.println("\nAfter deleting first element :- \n");
        ll.printList();
        ll.deleteLast();
        System.out.println("\nAfter deleting last element :- \n");
        ll.printList();
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.printList();
        ll.insertAtMiddle(25, 3);
        ll.printList();
        System.out.println("Length is :- "+ll.getSize());

    }
}
