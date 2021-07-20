package basics;

public class Methods {
    public static void main(String[] args) {
        Methods example = new Methods();
        int returned = example.go();//store in a variable
        int value = Methods.go(5);

        System.out.println(value);
        System.out.println(returned);
    }
    public int go(){
        return 11;
    }
    public static int go(int x){//to overload a method you must
        // state some type of parameters
        return x;
    }
}
