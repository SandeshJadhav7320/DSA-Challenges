import java.util.*;
public class LeetcodeProblemNextGreaterElement 
{

    public static int[] nextGreater(int arr1[],int arr2[])
    {
        Stack<Integer> s =new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=arr2.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()<=arr2[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                map.put(arr2[i], -1);
            }
            else
            {
                map.put(arr2[i], s.peek());
            }
            s.push(arr2[i]);
        }
       // Build result for nums1
        int[] res = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = map.get(arr1[i]);
        }

        return res;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array :- ");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        System.out.println("Enter the element of the first array :- ");
        for(int i=0;i<arr1.length;i++)
        {
            int ele1=sc.nextInt();
            arr1[i]=ele1;
        }

        System.out.println("Enter the size of the second array :- ");
        int size2=sc.nextInt();
        int arr2[]=new int[size2];
        System.out.println("Enter the element of the second array :- ");
        for(int i=0;i<arr2.length;i++)
        {
            int ele2=sc.nextInt();
            arr2[i]=ele2;
        }

        int[] ans = nextGreater(arr1, arr2);
        System.out.println("Next greater elements: " + Arrays.toString(ans));
    }    
}
