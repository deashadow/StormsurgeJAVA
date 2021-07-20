package overridingmethods;

public class Override {

    public static void main(String[] args) {
       // Poppable obj = new Balloon();//creating new object as a Balloon
        Poppable obj = new Bubble();
        obj.pop();
    }
}

class Poppable {
    public void pop(){
        System.out.println("Pop");
    }
  }

  class Balloon extends Poppable {
      public void pop() {
          System.out.println("POP!!!");//this Balloon obj will override
      }
     // public void pop(int x){}  this would be overloading!!
  }
  class Bubble extends Poppable {
      public void pop() {
         System.out.println("quite pop...");
      }
  }
