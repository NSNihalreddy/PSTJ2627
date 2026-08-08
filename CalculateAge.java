import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date of birth (yyyy-MM-dd): ");
        String input = sc.nextLine();

        LocalDate dob = LocalDate.parse(input);
        LocalDate today = LocalDate.now();

        Period age = Period.between(dob, today);

        System.out.println("Current Age: " + age.getYears() + " years");

        sc.close();
    }
}