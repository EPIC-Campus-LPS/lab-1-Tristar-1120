import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = i.nextLine();

        System.out.print("Enter a password: ");
        String password = i.nextLine();

        if (username.equals("admin") && password.equals("1234password")) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login failed. Please try again.");
        }

        i.close();
    }
}