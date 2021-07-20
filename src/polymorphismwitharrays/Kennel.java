package polymorphismwitharrays;

public class Kennel {
    public static void main(String[] args) {
        Animal [] pets = new Animal[3];
        pets [0] = new Dog();
        pets [1] = new Cat();
        pets [2] = new Dog();

        for(Animal a : pets){//enhance for loop
            a.speak();//calls speak for each animal in array
        }
    }
}
abstract class Animal{
    abstract void speak();//METHOD
}
class Dog extends Animal {
    //@Override
    void speak() {
        System.out.println("Bark");
    }
}
class Cat extends Animal {
   // @Override
    void speak() {
        System.out.println("Meow");
    }
}