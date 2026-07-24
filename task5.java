import java.util.Arrays;
import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        int kthSmallest = Arrays.stream(arr)
                                .sorted()
                                .skip(k - 1)
                                .findFirst()
                                .orElseThrow();

        System.out.println("Kth Smallest Element: " + kthSmallest);

        sc.close();
    }
}