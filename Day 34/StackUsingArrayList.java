import java.util.ArrayList;
public class StackUsingArrayList 
{
    static ArrayList<Integer> list =new ArrayList<>();
    public static boolean isEmpty()
    {
        return list.size()==0;
    }
    public static void push(int data)
    {
        list.add(data);
    }

    public static int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    public static int peek()
    {
        if(isEmpty())
        {
            return -1;
        }

        return list.get(list.size()-1);
    }
    public static void main(String[] args) 
    {
        StackUsingArrayList sa = new StackUsingArrayList();
        sa.push(10);
        sa.push(20);
        sa.push(30);
        sa.push(40);

        while(!isEmpty())
        {
            System.out.println(sa.peek());
            sa.pop();
        }
    }
}
