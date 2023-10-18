package javac3;

public class Task2 {
    public static void main(String[] args) {
        var cars = new Car[3];
        cars[0] = new Car("BMW", "", "", "", 0, 0);
        cars[1] = new Car("Mitsubishi", "", "", "", 0, 0);
        cars[2] = new Car("Mazeratti", "", "", "", 0, 0);
        cars = Car.getCarsWith('M', cars);
        for (Car car : cars) {
            System.out.println(car.getBrand());
        }

    }
}

class Car {
    private String brand, model, color, transmission;
    private double power, engine;

    Car(){}
    Car(
        String brand, String model, String color, String transmission,
        double power, double engine
    ) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.transmission = transmission;
        this.power = power;
        this.engine = engine;
    }

    String getBrand() {
        return brand;
    }

    String getModel() {
        return model;
    }

    String getColor() {
        return color;
    }

    String getTransmission() {
        return transmission;
    }

    double getPower() {
        return power;
    }

    double getEngine() {
        return engine;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    void setPower(double power) {
        this.power = power;
    }

    void setEngine(double engine) {
        this.engine = engine;
    }

    static Car[] getCarsWith(char symbol, Car... cars) {
        var newCars = new Car[cars.length];
        int i = 0, j = 0;
        for (Car c : cars) {
            if (c.getBrand().startsWith("" + symbol)) {
                newCars[i++] = c;
            }
        }

        var result = new Car[i];
        while (i --> 0) {
            result[j++] = newCars[i];
        }
        return result;
    }

    static Car[] getCarsSorted(boolean ascending, Car... cars) {
        var newCars = new Car[cars.length];
        for (Car car : cars) {
            
        }

        return newCars;
    }
}
