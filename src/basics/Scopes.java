package basics;

public class Scopes {

    public static void main(String[] args) {
        Person one = new Person();  //person object 1
        Person two = new Person(); //person object 2
        one.age = 10; //taking age from Person class
        two.age = 20;
        //should access via Person!!
        Person.planet = "Earth";
        one.planet = "Earth"; //not this way
        System.out.println(two.planet);
    }
}
class Person {
    int age; //INSTANCE variable
    static String planet; //CLASS variable

    public void move(int distance){//this is a local variable
        {
            int x = 10;
            distance = 10;
        }
       // x = 9;//cannot access outside of code block
        distance = 10;
        //distance can be accessed because it is outside code block
    }
}
