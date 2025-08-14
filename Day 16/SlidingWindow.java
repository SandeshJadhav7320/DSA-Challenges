import java.util.Scanner;
public class SlidingWindow 
{
    public int Demo(int arr[],int w,int size)
    {
        int current=0;
        for(int i=0;i<w;i++)
        {
            current+=arr[i];

        }
        int max=current;
        for(int i=1;i<=size-w;i++)
        {
            current=current-arr[i-1]+arr[i+w-1];
            if(current>max)
            {
                max=current;
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size if the array :- ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the elements :- ");
        for(int i=0;i<arr.length;i++)
        {
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        System.out.println("Enter the size of sub array :- ");
        int w=sc.nextInt();
        SlidingWindow sl=new SlidingWindow();
        int max=sl.Demo(arr,w,size);
        System.out.println("Maximmum sum is :-"+max);
    }
}
