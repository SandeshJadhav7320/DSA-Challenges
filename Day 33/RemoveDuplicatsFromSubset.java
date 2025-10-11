import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class RemoveDuplicatsFromSubset 
{
    public static void removeDuplicats(int arr[] , ArrayList<Integer> ans, int i , ArrayList<ArrayList<Integer>> allset)
    {
        if(i==arr.length)
        {
            allset.add(new ArrayList<>(ans));
            return;
        }

        //Include 
        ans.add(arr[i]);
        removeDuplicats(arr, ans, i+1, allset);
        ans.remove(ans.size()-1);
        int index=i+1;
        while(index<arr.length && arr[index]==arr[index-1])
        {
            index++;
            
        }
        removeDuplicats(arr, ans, index, allset);
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
        Arrays.sort(arr);
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<ArrayList<Integer>> allset=new ArrayList<>();
        removeDuplicats(arr,ans,0,allset);

        for(ArrayList<Integer>val:allset)
        {
            System.out.println(val);
        }

   }   
}
