import java.util.Scanner;
public class QuickSort 
{
    public void QuickSort1(int arr[],int lb,int ub)
    {
        if(lb<ub)
        {
            int loc=Partition(arr,lb,ub);
            QuickSort1(arr,lb,loc-1);
            QuickSort1(arr,loc+1,ub);
        }
    }
    public int Partition(int arr[],int lb,int ub)
    {
        int pivot=arr[lb];
        int start=lb;
        int end=ub;
        while(start<end)
        {
            while(start<=ub && arr[start]<=pivot)
            {
                start++;
            }
            while(end>=lb && arr[end]>pivot)
            {
                end--;
            }
            if(start<end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }

        int temp=arr[end];
        arr[end]=arr[lb];
        arr[lb]=temp;
        return end ;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the elements in the array :- ");
        for(int i=0;i<arr.length;i++)
        {
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        int lb=0;
        int ub=arr.length-1;
        QuickSort qs=new QuickSort();
        qs.QuickSort1(arr,lb,ub);

        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
