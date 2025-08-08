import java.util.Scanner; 
public class OccuranceBinarySearch 
{
    public int demo(int arr[] , int num)
    {
        int res=-1;
        int start=0;
        int end=arr.length-1;
        

        while (start<=end) 
        {
            int mid=start+(end-start)/2;
            if(num==arr[mid])
            {
                res=mid;
                start=mid+1;
            }
            else if(num<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the element in the array :- ");
        for(int i=0;i<=arr.length-1;i++)
        {
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        System.out.println("Enter the  number you want to search :- ");
        int num=sc.nextInt();
        OccuranceBinarySearch ob=new OccuranceBinarySearch();
        int res1=ob.demo(arr,num);
        System.out.println(res1);

    }
}
