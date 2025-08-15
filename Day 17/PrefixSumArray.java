import java.util.Scanner;
public class PrefixSumArray 
{
     private int[] prefix;

    public int[] Demo(int arr[])
    {
         prefix=new int[arr.length+1];
        prefix[0]=0;
        for(int i=1;i<=arr.length;i++)
        {
             prefix[i]=prefix[i-1]+arr[i-1];
        }
        return prefix;
    }

    public int numArray( int left ,int right)
    {
        int sum=prefix[right+1]-prefix[left];
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array :- ");
        int size=sc.nextInt();
        
        int arr[]=new int[size];
        System.out.println("Enter the element in the array :- ");
        for(int i=0;i<arr.length;i++)
        {
            int ele=sc.nextInt();
            arr[i]=ele;
        }

        PrefixSumArray ps=new PrefixSumArray();
        int res[]=ps.Demo(arr);
        System.out.println("Prefix array is  :- ");
        for (int i=0;i<res.length;i++)
        {
            System.out.print(res[i] +" ");
        }

        System.out.println("Enter the left i.e starting element :- ");
        int left=sc.nextInt();
        System.out.println("Enter the right i.e end element :- ");
        int right=sc.nextInt();

        int res2=ps.numArray( left, right);
        System.out.println(res2);

    }
}
