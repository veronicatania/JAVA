import java.util.Scanner;

class Animal {
    public String name;
    public double height;
    public double weight;
    public double speed;

    Animal() {
    }

    Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height + " meters");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Speed: " + speed + " m/min");
    }

    public double distance(double x, double y) {
        return x * y * speed;
    }

    public double distance(double x) {
        return x * speed;
    }

    public String getName() {
        return name;
    }
}

public class A1073326_0324_1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter animal name (leave empty to exit): ");
            animal.name = scanner.nextLine().trim();
            if (animal.name.isEmpty() || animal.name.equals("exit")) {
                break;
            }

            System.out.print("Enter height in meters: ");
            animal.height = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            System.out.print("Enter weight in kg: ");
            animal.weight = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            System.out.print("Enter speed in m/min: ");
            animal.speed = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            System.out.println("\nAnimal details:");
            animal.show();
            System.out.println();

            System.out.print("Enter time (in minutes) for " + animal.getName() + ": ");
            double time = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            System.out.print("Enter acceleration (or leave empty to skip) for " + animal.getName() + ": ");
            String input = scanner.nextLine().trim();
            double acceleration = 0.0;
            if (!input.isEmpty()) {
                acceleration = Double.parseDouble(input);
            }

            double distance;
            if (acceleration == 0.0) {
                distance = animal.distance(time);
            } else {
                distance = animal.distance(time, acceleration);
            }

            System.out.println(animal.getName() + " ran " + distance + " meters.\n");
        }
    }
}
