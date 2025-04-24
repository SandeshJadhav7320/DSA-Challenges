import java.util.Scanner;
class Two_D_Array
{
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the rows : ");
        int rows=sc.nextInt();

        System.out.println("Enter the number of the colms : ");
        int colms=sc.nextInt();

         int[][] arr = new int[rows][colms];

        System.out.println("Enter the number of the elements : ");

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<colms;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<colms;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nEnter the number you want : \n");
        int search=sc.nextInt();
    
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<colms;j++)
            {
                if(arr[i][j]==search)
                {
                    System.out.println(search+"number is found at index : "+i+"row and "+j+"column");
                }
                
            }
            
            
        }
        

    }
}