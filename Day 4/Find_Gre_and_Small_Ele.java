import java.util.Scanner;
public class Find_Gre_and_Small_Ele 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of element : ");

        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the elements : ");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Your array elements are : ");

        for(int i=0;i<num;i++)
        {
            System.out.println(arr[i]);
        }

        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }

        System.out.println("Greater Element is : "+max);
        System.out.println("Smaller Element is : "+min);
    }
}
