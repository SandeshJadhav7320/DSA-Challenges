import java.util.Scanner;
public class SearchElement 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of element : ");
        int num=sc.nextInt();
        
        int arr[]=new int[num];
        System.out.println("Enter the element : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array elements are : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the number you want to search : ");
        int search=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==search)
            {
                System.out.println("Element is present");
                found=true;
                break;

            }
        
        }
        if(!found)
        {
            System.out.println("Element is not present");
        }
        
        
    }       
}
