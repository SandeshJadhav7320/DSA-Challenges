import java.util.Scanner;
class Array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num=sc.nextInt();

        int[] arr=new int[num];
      
      System.out.println("Enter the elements");
        for(int i=0;i<num;i++)
        {
           arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number you want to search " );
        int search=sc.nextInt();

        for(int i=0;i<num;i++)
        {
            if(search==arr[i])
            {
                System.out.println(search+" is found at index : "+i);
            }
        }
    }
}