package flowcontrolstatements;

public class Switch {
    public static void main(String[] args) {
        switchCase("A");
    }

    static void switchCase(String val){
        switch (val){
            case "A": {
                System.out.println("A");
                break;
            }case "B": {
                System.out.println("B");
                break;
            }case "C": {
                System.out.println("C");
                break;
            }default: {
                System.out.println("Default");
            }
        }
    }
}
