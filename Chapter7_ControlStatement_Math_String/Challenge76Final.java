
class Vehicles {

    final int noOfWheels;

    public Vehicles(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    final void showType() {
        System.out.println("This vehicle has " + this.noOfWheels + " wheels.");
    }

    public static void main(String[] args) {
        Vehicles car = new Vehicles(4);
        Vehicles bike = new Vehicles(2);

        car.showType();
        // bike.noOfWheels=4;
        bike.showType();
    }
}
