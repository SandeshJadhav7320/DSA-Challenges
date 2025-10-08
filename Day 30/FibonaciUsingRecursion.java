import java.util.Scanner;
public class FibonaciUsingRecursion 
{
    public static int fib(int num)
    {
        if(num==0 || num==1)
        {
            return num;
        }
        return fib(num-1) + fib(num-2);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        System.out.println( fib(num));

    }    
}
