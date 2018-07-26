public class Dog extends Animal{
    private String breed;

    public Dog(int age, int weight, String name, String breed) {
        super(age, weight, name);
        this.breed = breed;
    }

    public void printSomehting() {
        System.out.println(this.getName());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
