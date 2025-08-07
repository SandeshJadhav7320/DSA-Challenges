import java.util.Scanner;
class SearchInsertPosition 
{
    public int searchInsert(int[] nums, int target) 
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
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
       System.out.println("Enter the elements in the array :- ");
        for(int i=0;i<arr.length;i++)
        {
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        System.out.println("Enter the number you want to search :- ");
        int target=sc.nextInt();
        SearchInsertPosition sn=new SearchInsertPosition();
        int res=sn.searchInsert(arr,target);
        System.out.println(res);
        System.out.println("Updated array :- ");
        int newArr[]=new int[arr.length+1];

        for (int i = 0; i < newArr.length; i++) 
        {
            if (i < res) 
            {
                newArr[i] = arr[i];
            } 
            else if (i == res) 
            {
                newArr[i] = target;
            }
            else 
            {
                 newArr[i] = arr[i - 1]; // shift right
            }
        }
            // Print updated array
          for (int i = 0; i < newArr.length; i++) 
            {
                System.out.print(newArr[i] + " ");
            }  
    }
}
