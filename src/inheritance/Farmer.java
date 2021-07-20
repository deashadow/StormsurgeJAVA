package inheritance;

public class Farmer {

    public static void main(String[] args) {
        Pickle pickle = new Pickle();
        pickle.grow();//can use method in cucumber!! INHERITS!!
        //***Can only extend 1 class!!***
    }
}
class cucumber {
    double calories;//class variable

    public void grow() {}//method
 }

class Pickle extends cucumber {
        public Pickle() {
            calories = calories * 0.70;//can access calories because EXTENDS
        }
    }

