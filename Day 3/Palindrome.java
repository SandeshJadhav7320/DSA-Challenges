import java.util.Scanner;
public class Palindrome 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num=sc.nextInt();

        int arr[]=new int[num];
        System.out.println("Enter the element : ");
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int start=0;
        int end=arr.length-1;
        boolean palindrome=true;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[start]!=arr[end])
            {
                palindrome=false;
                break;
                
            }
            start++;
            end--;
        }

        if(palindrome==true)
        {
            System.out.println("It  palindrome ");
        }
        else
        {
            System.out.println("Is not  palindrome");
        }
    }
}
