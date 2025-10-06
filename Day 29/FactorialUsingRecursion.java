import java.util.Scanner;
public class FactorialUsingRecursion 
{
    public static int fact(int num)
    {
        if(num==0)
        {
            return 1;
        }
        return num*fact(num-1);
    }
    public static int sum(int num)
    {
        if(num==1)
        {
            return 1;
        }
        return num+sum(num-1);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thr number you want to find factorial :- ");
        int num=sc.nextInt();
        System.out.println("Factorial is :-  "+fact(num));
        System.out.println("Sum is :- "+sum(num));
    }
}
