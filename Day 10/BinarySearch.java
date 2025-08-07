import java.util.Scanner;
class BinarySearch 
{
    public int search(int[] nums, int target) 
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]>target)
            {
                end=mid-1;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return start;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the element :- ");
        for(int i=0;i<arr.length;i++)
        {
            int ele=sc.nextInt();
            arr[i]=ele;
        }

        System.out.println("Enter the element you want to search :- ");
        int target=sc.nextInt();

        BinarySearch sn=new BinarySearch();
        int res=sn.search(arr,target);
        System.out.println(res);
    }
}