class Car {
    void driver() {
        System.out.println("Car is being driven");
    }
}

class tight {
    public static void main(String[] args) {
        Car car = new Car();  // tightly coupled with Car
        car.driver();
    }
}
//Tight coupling = Direct dependency on a specific class.


// In this example, the `tight` class is tightly coupled with the `Car` class because it directly creates an instance of `Car` and calls its method. Any changes to the `Car` class may require