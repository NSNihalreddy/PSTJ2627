import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Duration;

public class TimeZones {
    public static void main(String[] args) {

        ZonedDateTime india = ZonedDateTime.now(
                ZoneId.of("Asia/Kolkata"));

        ZonedDateTime usa = ZonedDateTime.now(
                ZoneId.of("America/New_York"));

        ZonedDateTime japan = ZonedDateTime.now(
                ZoneId.of("Asia/Tokyo"));

        System.out.println("India: " + india);
        System.out.println("USA: " + usa);
        System.out.println("Japan: " + japan);

        long indiaToUsa = Duration.between(usa.toInstant(), india.toInstant()).toHours();
        long indiaToJapan = Duration.between(india.toInstant(), japan.toInstant()).toHours();

        System.out.println();
        System.out.println("India is " + indiaToUsa + " hours ahead of USA");
        System.out.println("Japan is " + indiaToJapan + " hours ahead of India");
    }
}