import java.util.LinkedList;
public class PredefinedLL 
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(10);
        list.addFirst(20);
        System.out.println(list);

        list.addLast(50);
        System.out.println(list);

        
    }
}
