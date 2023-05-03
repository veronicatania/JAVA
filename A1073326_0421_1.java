import java.util.Scanner;

public class A1073326_0421_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = input.nextLine();

        boolean isValidEmail = email.matches("^[a-zA-Z0-9._-]+@[a-z]+\\.[a-z]+$");

        if (isValidEmail)
            System.out.println("Email is valid.");
        else
            System.out.println("Email is Invalid.");

    }
}