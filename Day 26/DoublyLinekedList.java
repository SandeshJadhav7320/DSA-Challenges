public class DoublyLinekedList 
{
    Node head;
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
            head=newNode;
            return;
        }
        newNode.next=head;
        head.pre=newNode;
        head=newNode;

    }
    public void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        
        if(head==null)
        {   
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.pre=temp;

    }

    
    public void display()
    {
        Node temp=head;
        if(temp==null)
        {
            System.out.println("List is empt");
        }
        while(temp!=null)
        {
            System.out.print(temp.data+" -->");
            temp=temp.next;
        }
        System.out.println(" Null");
    }

    public void displayBackword()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }

        while(temp!=null)
        {
            System.out.print(temp.data + " -->");
            temp=temp.pre;
        }
        System.out.println(" Null");
    }

    public void deleteFront()
    {
        Node temp=head;
        head=head.next;
        if(head!=null)
        {
            head.pre=null;
        }
        temp.next=null;
    }

    public void deleteEnd()
    {
        if(head==null)
        {
            System.out.println("List is empty ");
        }
        if(head.next==null)
        {
            head=null;
            return;
        }

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.pre.next=null;
    }
    
    public static void main(String[] args) 
    {
        DoublyLinekedList dl=new DoublyLinekedList();
        dl.insertAtFront(10);
        dl.insertAtFront(5);
        dl.insertAtFront(3);
        dl.display();
        dl.insertAtEnd(20);
        dl.display();
        dl.displayBackword();
        dl.deleteFront();
        dl.display();
        dl.deleteEnd();
        dl.display();

    }
}
