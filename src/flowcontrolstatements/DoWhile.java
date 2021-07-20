package flowcontrolstatements;

public class DoWhile {
    public static void main(String[] args) {
        //loop(true);//runs infinitely
        loop(false);
    }
    static void loop(boolean running){
        do {
            System.out.println("Running");
        }while(running);//this creates an infinite loop
    }
}
