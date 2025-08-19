import java.util.Scanner;
public class BubbleSort 
{
    public int[] Sort(int arr[])
    {
        int n=arr.length;
       
        for(int i=0;i<n-1;i++)
        {
             boolean swapped=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }

        }
        return arr;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size=sc.nextInt();
        System.out.println("Enter the element in the array :- ");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            int ele=sc.nextInt();
            arr[i]=ele;
        }

        BubbleSort bs=new BubbleSort();
        int res[]=bs.Sort(arr);
        System.out.println("Sorted array is :- ");
        for(int i=0;i<res.length;i++)
        {
             System.out.print(res[i]+" ");
        }
       

    }
}
