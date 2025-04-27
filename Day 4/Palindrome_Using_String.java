import java.util.Scanner;
public class Palindrome_Using_String 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();

        System.out.println(str);
        str = str.replaceAll("\\s+", "").toLowerCase();
        int start=0;
        int end=str.length()-1;
        boolean palindrome=true;
        
        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                palindrome=false;
                break;
            }
            start++;
            end--;
        }

        if(palindrome==true)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}
