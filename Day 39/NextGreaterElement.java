import java.util.*;
public class NextGreaterElement 
{
    public static void element(int arr[],int size)
    {
        Stack<Integer> s=new Stack<>();
        int result[]=new int[size];

        for(int i=size-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()<=arr[i])
            {
                    s.pop();
            }
            if(s.isEmpty())
            {
                result[i]=-1;
            }
            else
            {
                result[i]=s.peek();
            }

            s.push(arr[i]);
        }
         System.out.println("Next greateer element is :- ");
        for (int i : result) 
        {
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements in the array :- ");
        for(int i=0;i<arr.length;i++)
        {
            int ele=sc.nextInt();
            arr[i]=ele;
        }    

        element(arr,size);
       
    }
}
