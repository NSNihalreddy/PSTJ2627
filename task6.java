import java.util.Scanner;
import java.util.stream.IntStream;

public class task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("All possible pairs:");

        IntStream.range(0, arr.length)
                 .forEach(i ->
                     IntStream.range(i + 1, arr.length)
                              .forEach(j ->
                                  System.out.println(arr[i] + " " + arr[j])
                              )
                 );

        sc.close();
    }
}