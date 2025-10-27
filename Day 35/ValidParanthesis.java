import java.util.*;
public class ValidParanthesis 
{
    public static boolean isValid(String str)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{'  || ch== '[')
            {
                st.push(str.charAt(i));
            }
            else
            {
                if(st.size()==0)
                {
                    return false;
                }
                char top=st.peek();
                if((top=='(' && ch==')') || (top=='{' && ch=='}') ||(top=='[' && ch==']'))
                {
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character :- ");
        String str=sc.nextLine();
        isValid(str);
        if(isValid(str))
        {
            System.out.println("String is valid ");
        }
        else
        {
            System.out.println("String is not valid ");
        }
    }
}
