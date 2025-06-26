import java.util.Scanner;
class Simple_Array_Example
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of student : ");
        int student =sc.nextInt();

        System.out.println("Enter the marks : ");
        int marks[]=new int[student];
        for(int i=0;i<student;i++)
        {
            marks[i]=sc.nextInt();
        }

        System.out.print("You entered marks is : ");
        for(int i=0;i<student;i++)
        {
            System.out.print(marks[i]+" ");
        }

        
        int sum=0;
        for(int i=0;i<student;i++)
        {
            sum =marks[i]+sum;
        }
        System.out.println("\nTotal : "+sum);

        float avg=sum/student;
        System.out.println("Averaj : "+avg);

        int max=marks[0];
        int min=marks[0];

        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]>max)
            {
                max=marks[i];
            }
        }

        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<min)
            {
                min=marks[i];
            }
        }
        System.out.println("Highest : "+max);
        System.out.println("Lowesr : "+min);

        
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]>=35)
            {
                int count=1;
                count++;
                System.out.println(count);
            }
            
        }
    }
}