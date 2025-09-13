import java.util.Scanner;
public class InsertionSort {
    public int[] demo(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];    // element to insert
            int j = i - 1;

            // shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // insert key at correct position
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        InsertionSort is = new InsertionSort();
        int res[] = is.demo(arr);

        System.out.println("Sorted elements : ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
