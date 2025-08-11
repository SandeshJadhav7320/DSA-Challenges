import java.util.Scanner;

class RotatedArray {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1; 
                } else {
                    start = mid + 1; 
                }
            }
            
            else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1; 
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements in the array :- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to search :- ");
        int target = sc.nextInt();

        RotatedArray sn = new RotatedArray();
        int res = sn.search(arr, target);
        System.out.println(res);
    }
}
