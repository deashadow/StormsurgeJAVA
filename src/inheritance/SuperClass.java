package inheritance;

//import static jdk.internal.logger.DefaultLoggerFinder.SharedLoggers.system;

public class SuperClass {

    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}
 class SubClass extends SuperClass {

    // SUPER overrides printMethod in Superclass
    public void printMethod() {
        super.printMethod();//this overrides SuperClass print method
        System.out.println("Printed in Subclass");
    }
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();

        Account obj = new Account();
        int setData = 0;
        System.out.println(setData);
    }
    private static class Account{
        int a; //INSTANCE variables
        int b;
        public void setData(int a, int b) {
            this.a = a; //this defines LOCAL variables "int a"
            this.b = b;
        }
    }
}