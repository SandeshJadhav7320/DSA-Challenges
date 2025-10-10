import java.util.*;
public class PrintSubsetUsingRecursionAndBacktracking 
{
    public static void printSubset(int arr[],ArrayList<Integer> current,int i)
    {
        if(i==arr.length)
        {
            System.out.print("[ ");
            for(int val:current)
            {
                System.out.print(val + " ");
            }
            System.out.println(" ]");

            return;
        }

        current.add(arr[i]);            //Include 
        printSubset(arr, current, i+1);

        current.remove(current.size()-1);  // Backtracking Or Exclude 
        printSubset(arr, current, i+1);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element :- ");
        for(int i=0;i<arr.length;i++)
        {
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        ArrayList<Integer> current =new ArrayList<>();
        System.out.println("Subset are :- ");
        printSubset(arr,current,0);

        
    }
    

}
