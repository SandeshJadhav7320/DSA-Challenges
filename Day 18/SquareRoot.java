import java.util.Scanner;

class SquareRoot {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x; // special cases
        
        int low = 1, high = x / 2, ans = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // To avoid overflow, compare using division
            if (mid <= x / mid) {
                ans = mid;    // possible answer
                low = mid + 1; // try for bigger one
            } else {
                high = mid - 1; // try for smaller one
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        SquareRoot sn = new SquareRoot();
        int res = sn.mySqrt(num);
        System.out.println("Square root of " + num + " is: " + res);
    }
}
