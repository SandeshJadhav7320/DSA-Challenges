import java.util.Scanner;
public class ValidAnagram 
{
    public Boolean demo (String str,String target)
    {
        char letters1[]=str.toCharArray();
        char letters2[]=target.toCharArray();

        for(int i=0;i<letters1.length-1;i++)
        {
            for(int j=i+1;j<letters1.length;j++)
            {
                if(letters1[i]>letters1[j])
                {
                    char temp=letters1[j];
                    letters1[j]=letters1[i];
                    letters1[i]=temp;
                }
            }
        }

        for(int i=0;i<letters2.length-1;i++)
        {
            for(int j=i+1;j<letters2.length;j++)
            {
                if(letters2[i]>letters2[j])
                {
                    char temp=letters2[j];
                    letters2[j]=letters2[i];
                    letters2[i]=temp;
                }
            }
        }

        if(letters1.length!=letters2.length)
        {
            return false;
        }
       
          for(int i=0;i<letters1.length;i++)
            {
                if(letters1[i]!=letters2[i])
                {
                    return false;
                }
            }
        
        return true;
        
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.nextLine();

        System.out.println("Enter the target string ");
        String target=sc.nextLine();

        ValidAnagram va=new ValidAnagram();     
        boolean res=va.demo(str,target);
        // System.out.println("Splited String :- ");
        // for(int i=0;i<letters.length;i++)
        // {
        //     System.out.println(letters[i]);
        // }
        System.out.println(res);

        
    }    
}
