import java.util.Scanner;
public class BinarySearchUsingRecursion 
{
    public static int BinarySearch(int arr[],int target,int start,int last)
    {
        if(start<last)
        {
                int mid=(start+last)/2;
                if(arr[mid]==target)
                {
                    return mid;
                }
                if(arr[mid]>=target)
                {
                    return BinarySearch(arr,target,start,mid-1);
                }
                else
                {
                    return BinarySearch(arr,target,mid+1,last);
                }
        }
        
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size=sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements :- ");
        for(int i=0;i<size;i++)
        {
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        System.out.println("Enter the element you want to search :- ");
        int target=sc.nextInt();
        int start=0;
        int last=arr.length;
        int  res=BinarySearch(arr,target,start,last);
        if(res==-1)
        {
            System.out.println("Element is not found ");
        }
        System.out.println(res);
    }    
}
