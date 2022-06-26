```java
import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;

public class TypingSpeedTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String testString = "The quick brown fox jumps over the lazy dog";
        System.out.println("Type the following: '" + testString + "'");
        Instant start = Instant.now();
        String userInput = scanner.nextLine();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        if (userInput.equals(testString)) {
            System.out.println("Congratulations! Your speed is " + calculateSpeed(testString, timeElapsed) + " words per minute.");
        } else {
            System.out.println("You made a mistake, try again.");
        }
    }

    private static long calculateSpeed(String testString, long timeElapsed) {
        int words = testString.split(" ").length;
        double timeElapsedInMinutes = (double) timeElapsed / 60000;
        return Math.round(words / timeElapsedInMinutes);
    }
}
```