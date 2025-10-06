public class SingleCircularLinkedList 
{
    Node head,tail;
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
    public void insertAtFront(int data)
    {
        Node newNode=new Node(data);
        if(head ==null)
        {
            head=tail=newNode;
            tail.next=head;
            return;
        }

        newNode.next = head;  
        head = newNode;       
        tail.next = head;
        
    }
    public void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            tail.next=head;
            return;
        }
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;

        
    }

    public void insertAtSpecific(int data , int position)
    {
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null)
        {
            head=tail=newNode;
            tail.next=head;
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
                System.out.println("Invalid position ");
            }
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;

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
            System.out.print(temp.data+" --> ");
            temp=temp.next;
            if(temp==head)
            {
                break;
            }
        }
        System.out.println(" head");
        
    }
    public static void main(String[] args) 
    {
        SingleCircularLinkedList sl=new SingleCircularLinkedList();
        sl.insertAtFront(1);
        sl.insertAtFront(2);
        sl.insertAtFront(3);
        sl.display();

        sl.insertAtEnd(5);
        sl.display();

        sl.insertAtSpecific(7,4);
        sl.display();
    }
}
