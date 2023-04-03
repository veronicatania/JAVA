public class A1073326_0407_3 {
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

public class IceQueen extends Human {

    boolean hasIceSkill;
    int iceSkillFrequency;

    public IceQueen(String name, int age, boolean gender) {
        super(name, age, gender);
        hasIceSkill = false;
        iceSkillFrequency = 0;
    }

    public void prepareItems(boolean hasIceJumping) {
        if (hasIceJumping) {
            hasIceSkill = true;
        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Has ice skill: " + (hasIceSkill ? "Yes" : "No"));
        System.out.println("Ice skill frequency: " + iceSkillFrequency);
    }

    public double distance(int x, double acceleration, boolean isSilver) {
        double distance = x * acceleration;
        if (isSilver) {
            distance *= 2;
        }
        return distance;
    }
}
