import java.util.Stack;
public class MinStack 
{
    private  Stack<Integer> mainStack =new Stack<>();
    private  Stack<Integer> minStack =new Stack<>();

    public void push(int val)
    {
        mainStack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek())
        {
            minStack.push(val);
        }
    }

    public int pop()
    {
        if(mainStack.isEmpty())
        {
            return -1;
        }
        int remove=mainStack.pop();
        if(remove==minStack.peek())
        {
            minStack.pop();
        }
        return remove;
    }

    public int getMin()
    {
        return minStack.peek();
    }

    public int top()
    {
        return mainStack.peek();
    }

    public static void main(String[] args) 
    {
        MinStack min=new MinStack();   
        min.push(-2); 
        min.push(0);    
        min.push(-3); 
        System.out.println("Min :- "+min.getMin());
        min.pop();
        System.out.println("Top :- "+min.top());
        System.out.println("Min :- "+min.getMin());
    }
}
