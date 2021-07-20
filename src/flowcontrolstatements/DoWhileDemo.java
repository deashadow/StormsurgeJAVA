package flowcontrolstatements;

class DoWhileDemo {
    public static void main(String[] args){
        int count = 1;
        do {//this always gets executed
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);//this sets the parameter
    }
}
