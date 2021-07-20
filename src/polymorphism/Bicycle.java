package polymorphism;

public class Bicycle {
    // the Bicycle class has
    // three fields--all variables must have a type---(int, float, double, boolean, etc
    public int cadence;//field--make field 'private' for ENCAPSULATION
    public int gear;//field
    public int speed;//field

    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) { //parameter inside the ()
        cadence = newValue; //local variable
    }

    public void setGear(int newValue) {
        gear = newValue; //local variable
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void printDescription(){
        System.out.println("\nBike is " + "in gear " + this.gear
                + " with a cadence of " + this.cadence +
                " and travelling at a speed of " + this.speed + ". ");
    }
}