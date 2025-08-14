import java.util.Scanner;

public class SlidingWindow {
    public double findMaxAverage(int[] nums, int k) {
        double currentSum = 0;

        // First window sum
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        double maxSum = currentSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum / k;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :- ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements :- ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the size of subarray :- ");
        int k = sc.nextInt();

        SlidingWindow obj = new SlidingWindow();
        double maxAvg = obj.findMaxAverage(arr, k);

        System.out.printf("Maximum average is: %.5f\n", maxAvg);
    }
}
