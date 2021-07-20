package flowcontrolstatements;

public class ForLoop {
    public static void main(String[] args) {
         loop(100);//calling METHOD
    }
    static void loop (int max){//METHOD
        //counter variable; condition; increment
        for(int i=0;        i<max;      i++){
  //constantly goes around loop until it reaches the max '100'
  //so ten integers are printed
            System.out.print(i);
        }
    }
}
