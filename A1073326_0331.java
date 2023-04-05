import java.util.Scanner;

interface Gender {
    public static final String MALE = "男";
    public static final String FEMALE = "女";
}

public class A1073326_0331 {

    static Animal[] animalsArr = new Animal[6];

    static void show() {
        for (Animal animal : animalsArr) {
            animal.show();
        }
    }

    public static void main(String[] args) throws Exception {

        animalsArr[0] = new Animal("雪實", 1.1, 52, 100);
        animalsArr[1] = new Animal("鍊子", 1.5, 99, 200);
        animalsArr[2] = new Human("阿快", 1.9, 80, 150, Gender.MALE);
        animalsArr[3] = new Human("ASU", 1.8, 78, 130, Gender.MALE);
        animalsArr[4] = new Human("ANJING", 1.7, 48, 120, Gender.FEMALE);
        animalsArr[5] = new SnowQueen("PANTEK", 1.7, 50, 120, Gender.FEMALE, true);

        show();

        Scanner scanner = new Scanner(System.in);

        for (Animal animal : animalsArr) {

            if (animal.name.isEmpty()
                    || animal.name.equals("exit")) {
                break;
            }

            double time = 0;
            double acceleration = 0.0;

            System.out.print("Enter time (or leave empty to skip) for " + animal.getName() + ": ");
            String input = scanner.nextLine();
            if (input.isEmpty())
                break;
            try {
                time = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for acceleration: " + time);
                continue;
            }

            System.out.print("Enter acceleration (or leave empty to skip) for " + animal.getName() + ": ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                try {
                    acceleration = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input for acceleration: " + input);
                    continue;
                }
            }

            double distance;
            if (acceleration == 0.0) {
                distance = animal.distance(time);
            } else {
                distance = animal.distance(time, acceleration);
            }

            System.out.println(animal.getName() + " ran " + distance + " meters.\n");
        }

        System.out.println("\nThank You For Using Frozen system");
        scanner.close();
    }
}

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
        System.out.println("\nName: " + name);
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

    public static void showInfo() {
        System.out.println("Welcome to the Frozen system");
    }
}

class Human extends Animal {

    private String gender;

    public Human(String name, double height, double weight, double speed, String gender) {
        super(name, height, weight, speed);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Gender: " + gender);
    }
}

class SnowQueen extends Human {
    public boolean hasFreezingSkill;

    SnowQueen(String name, double height, double weight, double speed, String gender,
            boolean hasFreezingSkill) {
        super(name, height, weight, speed, gender);
        this.hasFreezingSkill = hasFreezingSkill;
    }

    public void show() {
        super.show();
        System.out.println("Has freezing skill: " + (hasFreezingSkill ? "YES" : "NO"));
    }

    public double distance(double x, double y) {
        return 2 * super.distance(x, y);
    }

    public double distance(double x) {
        return 2 * super.distance(x);
    }
}