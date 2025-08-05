import java.util.Scanner;
public class Sum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size=sc.nextInt();
        
        int arr[]=new int[size];
        System.out.println("Enter the array element :- ");
        for(int i=0;i<arr.length;i++)
        {
            int num=sc.nextInt();
            arr[i]=num;
        }

        System.out.println("Array element :- ");
         for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nSum is ");
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            System.out.print(sum +" ");
        }
        

    }
}
