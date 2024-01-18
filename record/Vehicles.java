import java.io.*;
import java.util.*;

class Vehicle {
    public void startEngine() {
        System.out.println("Generic engine starting procedure for Vehicle.");
    }

    public void stopEngine() {
        System.out.println("Generic engine stopping procedure for Vehicle.");
    }
}

class Car extends Vehicle {

    public void startEngine() {
        System.out.println("Starting Car engine: Push the start button.");
    }

    public void stopEngine() {
        System.out.println("Stopping Car engine: Turn the ignition key to off position.");
    }
}

class Motorcycle extends Vehicle {
    public void startEngine() {
        System.out.println("Starting Motorcycle engine: Kick-start or use the ignition key.");
    }

    public void stopEngine() {
        System.out.println("Stopping Motorcycle engine: Use the kill switch or turn the key off.");
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        System.out.println("Car:");
        car.startEngine();
        car.stopEngine();
        System.out.println();

        System.out.println("Motorcycle:");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
