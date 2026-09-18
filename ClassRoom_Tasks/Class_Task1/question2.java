import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class question2 {
    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(45, 78, 32, 90, 65, 88, 40, 95);

        List<Integer> updatedMarks = marks.stream()
                .filter(mark -> mark >= 60)
                .map(mark -> mark + 5)
                .collect(Collectors.toList());

        System.out.println("Marks after adding bonus:");
        updatedMarks.forEach(mark -> System.out.println(mark));

        double average = updatedMarks.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Average of updated marks: " + average);

        System.out.println("Marks in descending order:");
        updatedMarks.stream()
                .sorted((a, b) -> b - a)
                .forEach(mark -> System.out.println(mark));
    }
}
