import java.util.Scanner;
public class Reverse_Element 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element : ");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the element : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Original array is  : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }

        System.out.println("\n"+"Reverse array is  : ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}
