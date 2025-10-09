import java.util.Scanner;
public class CheckArrayIsSorted 
{
    public boolean sorted(int arr[],int size)
    {
        if(size==0 || size==1)
        {
            return true;
        }
        

        return arr[size-1]>=arr[size-2] && sorted(arr, size-1);
        
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element :- ");
        for(int i=0;i<size;i++)
        {
            int ele=sc.nextInt();
            arr[i]=ele;
        }

        CheckArrayIsSorted ca=new CheckArrayIsSorted();
       boolean res= ca.sorted(arr,size);
       if(res==true)
       {
            System.out.println("List is sorted");
       }
       else{
        System.out.println("List is unsorted ");
       }
       
    }   
}
