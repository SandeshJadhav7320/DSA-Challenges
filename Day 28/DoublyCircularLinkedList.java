public class DoublyCircularLinkedList 
{
    Node head,tail;
    class Node
    {
        int data;
        Node next;
        Node pre;

        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.pre=null;
        }
    }
    public void insertAtFront(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            head.pre=head.next=head;
            return;
        }
        newNode.next=head;
        head.pre=newNode;
        newNode.pre=tail;
        tail.next=newNode;
        head=newNode;
        
    }

    public void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null)
        {
            head=tail=newNode;
            head.pre=head.next=head;
            return;
        }
        tail.next=newNode;
        newNode.pre=tail;
        newNode.next=head;
        head.pre=newNode;
        tail=newNode;
    }

    public void insertAtSpecific(int data , int position)
    {
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null)
        {
            head=tail=newNode;
            head.pre=head.next=head;
            return;
        }
        if(position==1)
        {
            insertAtFront(data);
            return;
        }
        for(int i=1;i<position-1;i++)
        {
            if(temp==null)
            {
                System.out.println("Invalid Position ");
            }
            temp=temp.next;
        }
        temp.next.pre=newNode;
        newNode.next=temp.next;
        temp.next=newNode;
        newNode.pre=temp;
        
    }
    public void display()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("List is empty ");
        }
        while(true)
        {
            System.out.print(temp.data + " --> ");
            temp=temp.next;
            if(temp==head)
            {
                break;
            }
        }
        System.out.println(" head");
        
    }
    public void displayBackword()
    {
        if(tail==null)
        {
            System.out.println("List is empty ");
        }
        Node temp=tail;
        while(true)
        {
            System.out.print(temp.data + " <-- ");
            temp=temp.pre;
            if(temp==tail)
            {
                break;
            }
        }
        System.out.println(" head ");
    }
    public static void main(String[] args)
    {
        DoublyCircularLinkedList dcl=new DoublyCircularLinkedList();
        dcl.insertAtFront(5);
        dcl.insertAtFront(4);
        dcl.insertAtFront(3);
        dcl.display();
        dcl.insertAtEnd(8);
        dcl.insertAtEnd(9);
        dcl.display();
        dcl.insertAtSpecific(6,4);
        dcl.insertAtSpecific(7,5);
        dcl.display();
        dcl.displayBackword();
    }
}
