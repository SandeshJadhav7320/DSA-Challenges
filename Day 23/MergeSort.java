import java.util.Scanner;

public class MergeSort {
    public void mergesort(int arr[], int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergesort(arr, lb, mid);
            mergesort(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
        }
    }

    public void merge(int arr[], int lb, int mid, int ub) {
        int n = ub - lb + 1;   // size of subarray
        int[] arr2 = new int[n];

        int i = lb;      // left subarray pointer
        int j = mid + 1; // right subarray pointer
        int k = 0;       // temp array pointer

        // Merge both halves into arr2
        while (i <= mid && j <= ub) {
            if (arr[i] <= arr[j]) {
                arr2[k++] = arr[i++];
            } else {
                arr2[k++] = arr[j++];
            }
        }

        // Copy remaining left half
        while (i <= mid) {
            arr2[k++] = arr[i++];
        }

        // Copy remaining right half
        while (j <= ub) {
            arr2[k++] = arr[j++];
        }

        // Copy sorted subarray back to original array
        for (int x = 0; x < n; x++) {
            arr[lb + x] = arr2[x];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {   // fixed condition
            arr[i] = sc.nextInt();
        }

        MergeSort ms = new MergeSort();
        ms.mergesort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
