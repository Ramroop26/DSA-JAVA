// Interface
interface Rider {
    void driver();
}

// Car class
class Car implements Rider {
    public void driver() {
        System.out.println("Car is being driven");
    }
}

// Scooter class
class Scooter implements Rider {
    public void driver() {
        System.out.println("Scooter is being driven");
    }
}

// Main class
public class Loose {
    public static void main(String[] args) {
        Rider rider;  // reference to abstraction

        rider = new Car();      // we can switch easily
        rider.driver();

        rider = new Scooter();  // without changing main logic
        rider.driver();
    }
}
