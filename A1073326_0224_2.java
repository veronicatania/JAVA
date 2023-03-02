import java.util.Scanner;

public class A1073326_0224_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble(); 

        double fahrenheit = celsius * 9 / 5 + 32; 
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit."); 
    }
}
