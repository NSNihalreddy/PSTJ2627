import java.util.stream.IntStream;

public class task3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int key = 40;

        IntStream.range(0, arr.length)
                 .filter(i -> arr[i] == key)
                 .findFirst()
                 .ifPresentOrElse(
                     i -> System.out.println("Element found at index: " + i),
                     () -> System.out.println("Element not found")
                 );
    }
}