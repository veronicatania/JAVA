import java.util.Scanner;

public class A1073326_0421_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date in the format 'YYYY/MM/DD' or 'MM/DD/YYYY': ");
        String input = scanner.nextLine();

        String[] parts = input.split("/");
        int year, month, day;

        if (parts.length == 3
                && parts[0].length() == 4
                && parts[1].length() == 2
                && parts[2].length() == 2) { 
            year = Integer.parseInt(parts[0]);
            month = Integer.parseInt(parts[1]);
            day = Integer.parseInt(parts[2]);
        } else if (parts.length == 3
                && parts[2].length() == 4
                && parts[1].length() == 2
                && parts[0].length() == 2) { 
            year = Integer.parseInt(parts[2]);
            month = Integer.parseInt(parts[0]);
            day = Integer.parseInt(parts[1]);
        } else {
            System.out.println("Invalid input format.");
            return;
        }

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
