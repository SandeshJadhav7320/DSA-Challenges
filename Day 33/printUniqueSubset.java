import java.util.Scanner;
import java.util.ArrayList;
public class printUniqueSubset 
{
    public static void printSubset(int arr[],ArrayList<Integer> ans,int i,ArrayList<ArrayList<Integer>> allset)
    {
        if(i==arr.length)
        {
            allset.add(new ArrayList<>(ans));
            return;
        }

        //Include
        ans.add(arr[i]);
        printSubset(arr,ans,i+1,allset);

        //Exclude 
        ans.remove(ans.size()-1);
        printSubset(arr,ans,i+1,allset);

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
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<ArrayList<Integer>> allset=new ArrayList<>();
        printSubset(arr,ans,0,allset);

        System.out.println("All subsets:");
        for (ArrayList<Integer> subset : allset) {
            System.out.println(subset);
        }
    }
}
