import java.util.Scanner;
public class InsertionSort 
{
    public int[] demo(int arr[])
    {
        
        return arr;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size =sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element in the array :");
        for (int i=0;i<arr.length;i++)
        {
            int ele =sc.nextInt();
            arr[i]=ele;
        }
        
        InsertionSort is=new InsertionSort();
        is.demo(arr);

    }
}
