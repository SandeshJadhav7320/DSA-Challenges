import java.util.Scanner;
public class Calculate_Average 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subject ");
        int sub=sc.nextInt();
        int marks[]=new int[sub];
        System.out.println("Enter the marks one by one");
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=sc.nextInt();
        }
        System.out.println("Your array elements are : ");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        int sum=0;
        for(int i=0;i<marks.length;i++)
        {
            sum=sum+marks[i];
        }
        float avg=sum/sub;
        System.out.println("Total of marks : "+sum);
        System.out.println("Total of marks : "+avg);
        
    }
}
