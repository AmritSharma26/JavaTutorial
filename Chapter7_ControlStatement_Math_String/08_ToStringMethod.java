
class ToStringMethod {

    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public ToStringMethod(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Car{"
                + "noOfWheels=" + noOfWheels
                + ", noOfDoors=" + noOfDoors
                + ", maxSpeed=" + maxSpeed
                + ", modelNumber=" + modelNumber
                + ", company=" + company
                + '}';
    }

    public static void main(String[] args) {
        ToStringMethod swift = new ToStringMethod(4, 4, 120,
                "Swift", "SW876", "Maruti");
        System.out.println(swift);
    }

}
