import java.util.Scanner;
public class FactorialUsingRecursion 
{
    public int fact(int num)
    {
        if(num==0)
        {
            return 1;
        }
        return num*fact(num-1);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thr number you want to find factorial :- ");
        int num=sc.nextInt();
        FactorialUsingRecursion fr=new FactorialUsingRecursion();
        System.out.println(fr.fact(num));
    }
}
