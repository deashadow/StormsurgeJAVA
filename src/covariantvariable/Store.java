package covariantvariable;

public class Store {
    public static void main(String[] args) {
    //ref type Furniture object type Chair
    Furniture chair = new Chair();//creating an object ref as Chair
    System.out.println(chair);//stored on Heap as type Chair
    Furniture table = new Table();
    sell(chair);//calling the sell Method
    sell(table);

  }
  public static void sell(Furniture furn){//METHOD
        System.out.println(furn);
  }
}

class Furniture{}
class Chair extends Furniture{}
class Table extends Furniture{}
