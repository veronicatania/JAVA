public class A1073326_0407_2 {
   
    String name;
    int age;
    boolean gender;

    public Human(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + (gender ? "Male" : "Female"));
    }
}

public class IronBearingAnimal extends Human {
    double weight;

    public IronBearingAnimal(String name, int age, boolean gender, double weight) {
        super(name, age, gender);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight: " + weight);
    }

    public void bearIron() {
        System.out.println(name + " is bearing iron!");
    }
}
