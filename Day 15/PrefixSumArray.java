import java.util.Scanner;
public class PrefixSumArray 
{
    public int[] Demo(int arr[])
    {
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        
        return prefix;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size =sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the elements :- ");
        for(int i=0;i<arr.length;i++)
        {
            int ele=sc.nextInt();
            arr[i]=ele;
        }

        PrefixSumArray dm = new PrefixSumArray();
        int prefix[]=dm.Demo(arr);
        System.out.print("[");
        for(int i=0;i<prefix.length;i++)
        {
            System.out.print(prefix[i]+" ");
        }
        System.out.println("]");


    }
}
