public class QueueUsingLinkedList 
{
    public static class Node
    {
        int data;
        Node next;
        
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }

    public static class Queue
    {
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty()
        {
            return head==null && tail==null;
        }

        public static void add(int data)
        {
            Node newNode=new Node(data);
            if(tail==null)
            {
                head=tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }

        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("List is empty ");
            }

            if(tail==head)
            {
                tail=null;
            }
            int front =head.data;
            head=head.next;
            return front ;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("List is empty ");
            }

            return head.data;
        }


    }
    public static void main(String[] args) 
    {
        Queue q=new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
