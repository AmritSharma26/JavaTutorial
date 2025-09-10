
public class Car {

    static int noOfCarSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    static {
        noOfCarSold = 0;
        System.out.println("I am in static block");
    }

    {
        noOfCarSold++;
        System.out.println("I am in init block");
    }

    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    Car() {
        this("Black");
        currentFuelInLiters = 5;
    }

    public Car start() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel, can not start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refuel.");
        } else {
            System.out.println("Car is started.. bruhhhh....");
        }
        return this;
    }

    public void drive() {
        currentFuelInLiters--;
        System.out.println("Car is driving.");
    }

    public void addFuel(float fuel) {
        currentFuelInLiters += fuel;
    }

    public float getCurentFuelLevel() {
        return currentFuelInLiters;
    }
}
