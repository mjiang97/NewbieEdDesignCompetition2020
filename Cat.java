public class Cat implements Animal {
    String owner;
    String name;
    int age;

    public Cat() {
        owner = "Jon";
        name = "Garfield";
        age = 40;
    }
    @Override
    public void makeNoise() {
        System.out.println("I'm Sorry Jon");
    }

    @Override
    public void run() {
        System.out.println("stomp stomp");
    }

    public void eat() {
        System.out.println("eat lasagna");
    }

}