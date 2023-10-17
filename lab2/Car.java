package lab2;

public class Car {
    String brand;
    int speed, fuel, mileage, consumption;

    Car(String brand, int consumption) {
        this.brand = brand;
        this.consumption = consumption;
        speed = 0;
        fuel = 0;
        mileage = 0;
    }

    void accelerate(int amount) {
        speed += amount;
    }

    void refuel(int amount) {
        fuel += amount;
    }

    void drive(int distance) {
        mileage += distance;
        fuel -= distance*consumption;
    }
}
