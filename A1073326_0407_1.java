public class A1073326_0407_1 {
    
    String name;
    int height;
    int weight;
    double speed;

    public Animal(String name, int height, int weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void shower() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Speed: " + speed + " km/h");
    }

    public double distance(double x, double y) {
        return x * y;
    }

    public double distance(double x) {
        if (x == 0) {
            return 0;
        } else {
            return x * 0.5;
        }
    }

    public static void showinfo0() {
        System.out.println("Welcome to the Frozen system");
    }
}
