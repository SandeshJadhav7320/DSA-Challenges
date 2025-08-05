import java.util.Scanner;
public class Number 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element ");
        for(int i=0;i<arr.length;i++)
        {
            int ele=sc.nextInt();
            arr[i]=ele;
        }

        int count=0;
        for(int i =0;i<arr.length;i++)
        {
            String strnum=Integer.toString(arr[i]);
            if(strnum.length()%2==0)
            {
                count++;
            }
        }
        System.out.println(count);
        
    }
}
