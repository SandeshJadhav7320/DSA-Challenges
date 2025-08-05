import java.util.Scanner;
public class VowelConsonantCounter {
    
    public static void main(String[] args)
    {
        int[] arr=new int[1000];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        System.out.println(str);
         
        int len=str.length();
        for(int i=0;i<len;i++)
        {
                arr[i]=sc.nextInt();
        }
    }
}
