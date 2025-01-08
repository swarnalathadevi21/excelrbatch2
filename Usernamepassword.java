import java.util.Scanner;

public class Usernamepassword{
    private static final String CORRECT_USERNAME = "admin";
    private static final String CORRECT_PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (checkCredentials(username, password)) {
            System.out.println("Wishing you a happy new year");
        } else {
            System.out.println("Invalid username or password.");
        }
        scanner.close();
    }
    public static boolean checkCredentials(String username, String password) {
        return CORRECT_USERNAME.equals(username) && CORRECT_PASSWORD.equals(password);
    }
}
