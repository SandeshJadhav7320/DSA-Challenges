public class QueueUsingArray 
{
    public static class Queue
    {
         static int  arr[];
        static int  size;
        static int  rear=-1;

        public Queue(int n)
        {
            arr=new int[n];
            this.size=n;
        }
        
        public static boolean isEmpty()
        {
            return rear ==-1;
        }
        public static void add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("Queue is full ");
            }
            rear++;
            arr[rear]=data;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("List is empty");
                return -1;
            }
            return arr[0];
        }

        public static int pop()
        {
            if(isEmpty())
            {
                System.out.println("List is empty ");
            }

            int front =arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
    }
    public static void main(String[] args) 
    {
        Queue q=new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.pop();
        }
    }
}
