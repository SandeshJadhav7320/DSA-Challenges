import java.util.Scanner;
class MergeSortedArray
{
    public int[] MergedArray(int arr1[],int arr2[])
    {
        int k=0;
        int i=0;
        int j=0;
        int merged[]=new int[arr1.length+arr2.length];

        for( k=0;k<merged.length;k++)
        {
            if(i<arr1.length&&(j>arr2.length || arr1[i]<=arr2[j]))
            {
                merged[k]=arr1[i];
                i++;
            }
            else
            {
                merged[k]=arr2[j];
                j++;
            }
        }
        return merged;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enther the size of the first array :- ");
        int size1=sc.nextInt();

        System.out.println("Enter the size of the second array :- ");
        int size2=sc.nextInt();

        int arr1[]=new int[size1];
        int arr2[]=new int[size2];
        System.out.println("Enter the element for first arrayy :- ");
        for(int i=0;i<arr1.length;i++)
        {
            int ele1=sc.nextInt();
            arr1[i]=ele1;
        }
        System.out.println("Enter the element for second arrayy :- ");
        for(int i=0;i<arr2.length;i++)
        {
            int ele2=sc.nextInt();
            arr2[i]=ele2;
        }
        MergeSortedArray ma=new MergeSortedArray();
        int res[]=ma.MergedArray(arr1,arr2);
        System.out.println("Merged array :- ");
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i] +" ");
        }

        
    }
}