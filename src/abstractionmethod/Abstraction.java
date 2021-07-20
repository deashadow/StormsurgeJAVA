package abstractionmethod;

public class Abstraction {
    private static Object Triangle;

    public static void main(String[] args) {
    System.out.println(Triangle);
    }
}

abstract class Shape{
    abstract double area();
}

class Triangle extends Shape{
    double area() {
        return 0;
    }
}
class Square extends Shape{
    double area() {
        return 10;
    }
}