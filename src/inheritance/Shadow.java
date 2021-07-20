package inheritance;

public class Shadow {
    public static void main(String[] args) {
    Child child = new Child();//create an object
    int returned = child.getx();
    System.out.println(returned);
    }
}
class Parent {
    int x = 10;
}
class Child extends Parent {
    int x = 5;//this is an INSTANCE variable
                  //int x is the parameter
    public void setx(int x){//this is a setter method
        this.x = x;//instance variable--uses what is in parameter
       //"this" keyword taking x and assigning it to the parameter x
    }



    public int getx() {
        //return x;
        return super.x;//this will return the Parent int x of 10
    }
}