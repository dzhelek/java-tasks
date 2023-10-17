package lab2;

public class ElectricCar extends Car {
    int batteryLevel, efficiency;

    ElectricCar(String brand, int efficiency) {
        super(brand, efficiency);
        batteryLevel = 0;
        this.efficiency = efficiency;
    }

    void charge(int amount) {
        batteryLevel += amount;
    }

    void driveElectric(int distance) {
        mileage += distance;
        batteryLevel -= distance*efficiency;
    }
}
