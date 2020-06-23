package ZhaoYuLin;

public class Dog {
    String name;
    String breed;
    int age;
    boolean rabies;

    public Dog(String name,String type,int age) {
        this.name = name;
        breed = type;
        this.age = age;
        rabies = false;
    }

    public void bark() {
        System.out.println("bork");
    }

    public static void main(String[] args) {
        Dog foo = new Dog("foo", "golden retriever", 5);
        foo.bark();
        Dog Fred = new Dog();
        Fred.bark();
        System.out.println("Fred's age: " + Fred.getAge());
        Fred.setRabies(true);
          Dog bar = new Dog("bar", "dachshund",1);
        System.out.println("Bar's age in dog years: " + bar.getAgeinDogyears());
        bar.setRabies(true);
        System.out.println("Does bar have rabies: " + bar.hasRabies());


    }
    public Dog(){
        name = "Fred";
        breed = "Husky";
        age = 3;
        rabies = true;
        
    
    }
    public int getAge(){
        return age;
    }
    public int getAgeinDogyears(){
        return (age + 7);
    }
    public boolean hasRabies(){
        return rabies;
    }
    public void setRabies(boolean gotRabies){
        rabies = gotRabies;
    }

}
