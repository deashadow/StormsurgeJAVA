package basics;
       //Vehicle is the object
class Vehicle { // this is called the class body
    //VARIABLES---or FIELDS--created in the actual Class
           //Primitive Data Types
    int speed = 2000000000; //this is declaring a variable
    byte wheels = 4;
    short weight = 2500;
    char fuelType = 'U'; //single quotes for char
    boolean carRunning = false;
    long serialNumber = 23456754556778887L; //must end with capital L
    float fuelRemaining = 2.3455566666f; //must end with small f
    double fuelMileage = 18.88;
     //Non Primitive Data Types
    String vehicleType = "Jeep";

    Vehicle toy;//this can be declared here as well

    //METHOD
    void accelerate() {//method body and write parameters in the ()
        int count = 0; //can declare variables inside of a METHOD
    }
    Vehicle(){ //this is a CONSTRUCTOR--it will initialize the object
        speed = 0;

    }
}