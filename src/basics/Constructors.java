package basics;

public class Constructors {

    public static void main(String args[]) {
        // 1 "pizza"
        Pizza pizza = new Pizza();//Constructor
        pizza.slices = 8;//can call to field below
        // 2 "pie" different object--reference variable called "pie"
        Pizza pie = new Pizza(6);//Constructor
        pizza.eat(); //calls this method for this new pizza constructor
        System.out.println(pizza.slices);//This will print results for
        // first pizza constructor 8-1=7!!
        System.out.println(pie.slices);
    }
}
class Pizza { //Class
    int slices; //fields
    String topping;  //fields
    public Pizza() { }//This is a no argument Constructor
    // must be declared to compile
    Pizza(int pieces){
        slices = pieces;
    }
    public void eat(){ //Method
        slices = slices - 1;
    }//METHOD with params
}
