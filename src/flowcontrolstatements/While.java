package flowcontrolstatements;

public class While {
    public static void main(String[] args) {
        loop();//calling METHOD
    }
    static void loop(){//METHOD
        boolean running = check();//true;
        while(running){//this will keep running infinitely
            // --currently no stop
            System.out.println("Running");
            running = check();
        }
    }
    static boolean check(){
        if(Math.random() < 0.5){//Always have an exit condition!!
            return false;
        }else{
            return true;
        }
    }
}
