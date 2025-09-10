
public class Driver {

    String name;
    int age;
    String DateOfLicense;

    static int minAgeForDriving = 18;

    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving; // non static context can access both static and non static
    }

    public static void main(String[] args) {
        // Car myCar = new Car();
        // myCar.addFuel(6);
        // myCar.drive();
        // myCar.drive();
        // myCar.drive();
        // System.out.println(myCar.currentFuelInLiters);

        Car swift = new Car();
        swift.addFuel(6);
        swift.start().drive();
        System.out.println(swift.color);

        Driver myDriver = new Driver();
        // DateOfLicense = "1/Jan/2024"; // non static var cannot be referece from static context directly
        myDriver.DateOfLicense = "1/Jan/2024";
        System.out.println(minAgeForDriving);

        Car newCar = new Car("Red");
        newCar.start().drive();
        System.out.println(newCar.color);
    }

}
