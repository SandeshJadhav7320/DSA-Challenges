import java.util.Scanner;

public class SelectionSort 
{
    public int[] demo(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the element in the array ");
        for(int i=0;i<arr.length;i++)
        {
            int ele=sc.nextInt();
            arr[i]=ele;
        }

        SelectionSort ss=new SelectionSort();
        int res[]=ss.demo(arr);
        System.out.print("Sorted array :-"+" ");
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }



    }
}
