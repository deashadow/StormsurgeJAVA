package basics;

public class Interfaces {
    public static void main(String[] args) {

    }
}
interface Drawable {
    void draw();//do not need to say 'public abstract'
}
interface Colorable extends Drawable {
    void color();
}
class Rectangle implements Drawable, Runnable {
    public void draw(){}//must have method to compile
    public void run(){}//must have method to compile
}
class Circle implements Colorable {
    public void draw(){}//must have method to compile
    public void color() {}//must have method to compile
}