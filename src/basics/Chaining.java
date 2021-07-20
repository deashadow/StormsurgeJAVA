package basics;

public class Chaining {
    /**
     * This is called CONSTRUCTOR chaining
     * @param args
     */
    public static void main(String[] args) {
        JavaDeveloper dev = new JavaDeveloper("Java");//this creates a new Object
    }
}
class Employee{
    String name = " Ron Rendessy";
    public Employee(){ //this is a CONSTRUCTOR
        System.out.println("Employee");//this line of code runs first because
        // called by super();
    }
}
class JavaDeveloper extends Employee {
    String language;
    public JavaDeveloper() { //this is a CONSTRUCTOR
        super(); //implicitly we are making this call
        System.out.println(name + " is a new Java Developer");
    }

    public JavaDeveloper(String language){
        this();
        this.language = language;
        System.out.println(language);
    }
}