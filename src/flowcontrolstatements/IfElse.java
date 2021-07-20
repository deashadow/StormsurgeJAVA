package flowcontrolstatements;



public class IfElse {

    public static void main(String[] args) {
        branch(true);//call branch METHOD
        branch(false);//call branch METHOD
    }
    //what prints out is dependent on the true or
    // false condition of the boolean
    static void branch(boolean cond){
        if(cond){
            System.out.println("True");//if METHOD is true will print
        }else {
            System.out.println("False");//
        }
    }
}
