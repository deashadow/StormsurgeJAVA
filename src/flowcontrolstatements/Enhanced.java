package flowcontrolstatements;

public class Enhanced {
    public static void main(String[] args) {
        loop(new int[] {1,2, 3, 4, 5, 6});//array initializer
        loopA(new String[] {"hi", "my", "name", "is", "Ron"});
    }
    static void loop(int[] array){
        for(int i : array){//enhanced for statement
            System.out.print(i);
        }
    }
    static void loopA(String[] array){
        for(String i : array){
            System.out.print("\n" +i);
        }
    }
}
