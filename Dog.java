public class Dog {
    String name;
    String breed;
    int age;
    boolean rabies;

    public Dog(String name, String type, int age) {
        this.name = name;
        breed = type;
        this.age = age;
        rabies = false;
    }
    
    public boolean hasRabies() {
        return rabies;
    }
    
    public void bark() {
        System.out.println("bork");
    }
    
    public static void main(String[] args) {
        Dog foo = new Dog("foo", "golden retriever", 5);
        foo.bark();
    }
}
