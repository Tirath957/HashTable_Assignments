import usernamechecker.UsernameAvailabilityChecker;

public class Main {

    public static void main(String[] args) {

        UsernameAvailabilityChecker checker =
                new UsernameAvailabilityChecker();

        checker.registerUser("john_doe",1);

        System.out.println(
                checker.checkAvailability("john_doe")
        );

        System.out.println(
                checker.suggestAlternatives("john_doe")
        );

    }
}