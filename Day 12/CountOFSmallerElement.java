import java.util.Scanner;
public class CountOFSmallerElement 
{
    public int count(int arr[],int num)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=num)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("enter the elements in the array :- ");
        for(int i=0;i<arr.length;i++)
        {
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        System.out.println("Enteer the number you want less than :- ");
        int num =sc.nextInt();
        CountOFSmallerElement ce=new CountOFSmallerElement();
        int res=ce.count(arr,num);
        System.out.println("Number less than and equal to "+num+ " is occured "+res+" times");
    }
}
