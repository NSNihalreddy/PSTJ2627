import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeJoiningDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter joining date (yyyy-MM-dd): ");
        LocalDate joiningDate = LocalDate.parse(sc.nextLine());

        LocalDate after90Days = joiningDate.plusDays(90);
        LocalDate before30Days = joiningDate.minusDays(30);

        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Date after 90 days: " + after90Days);
        System.out.println("Date 30 days before: " + before30Days);

        sc.close();
    }
}