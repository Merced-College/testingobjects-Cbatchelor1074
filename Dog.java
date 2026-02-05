// Chase Batchelor
// February 4, 2026
// CPSC-39
// This is my Dog class for my Dog objects.

public class Dog {
    /* Data variables (Commented due to the change to private.)
        public String name;
        public int age;
        public String breed;
    */

    //Data variables
    private String name;
    private int age;
    private String breed;
    
    // Default constructor
    public Dog() {
        name = "Unknown";
        age = 0;
        breed = "Mixed";
    }

    // Parameterized constructor
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Prints information briefly.
    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}