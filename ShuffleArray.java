import java.util.Scanner;

class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];       // x part
            result[2 * i + 1] = nums[i + n]; // y part
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input
        System.out.println("Enter the size (should be even, i.e., 2n):");
        int size = sc.nextInt();

        if (size % 2 != 0) {
            System.out.println("Size must be even (2n). Exiting...");
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int n = size / 2;  // Calculate n

        ShuffleArray sf = new ShuffleArray();
        int[] result = sf.shuffle(arr, n); // Call the shuffle method

        // Step 4: Print result
        System.out.print("Shuffled Output: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
