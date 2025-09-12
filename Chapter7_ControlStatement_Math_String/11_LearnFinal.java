
final class Vehicle {

    final int wheels = 4; // final variable (constant)

    final void showType() { // final method cannot be overridden
        System.out.println("This is a vehicle with " + wheels + " wheels.");
    }
}

class LearnFinal {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.showType();
        // v.wheels = 6;
    }
}
