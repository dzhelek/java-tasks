package javac3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        var cars = new Car[4];
        cars[0] = new Car("BMW", "", "", "", 0, 0);
        cars[1] = new Car("Mitsubishi", "", "", "", 0, 0);
        cars[2] = new Car("BMW", "", "", "", 0, 0);
        cars[3] = new Car("Mazeratti", "", "", "", 0, 0);
        var carsSpecial = Car.getCarsWith('M', cars);
        for (Car car : carsSpecial) {
            System.out.println(car.getBrand());
        }
        System.out.println();

        List<Car> carsList = new ArrayList<Car>();
        for (Car car : cars) carsList.add(car);
        var sortedCars = Car.getCarsSorted(false, carsList);
        for (Car car : sortedCars) {
            System.out.println(car.getBrand());
        }
        System.out.println();

        var unique = Car.getCarsUnique(carsList);
        for (Car car : unique) {
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

    static List<Car> getCarsSorted(boolean ascending, List<Car> cars) {
        Collections.sort(cars, new CarComparatorByBrand());
        if (!ascending)
            Collections.reverse(cars);
        return cars;
    }

    static List<Car> getCarsUnique(List<Car> cars) {
        List<Car> carsUnique = new ArrayList<Car>();
        carsUnique.add(cars.get(0));
        for (Car car : cars) {
            if(!(carsUnique.contains(car)))
                carsUnique.add(car);
        }
        return carsUnique;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Car)) return false;
        var other = (Car)obj;
        return (
            this.getBrand().equals(other.getBrand()) &&
            this.getColor().equals(other.getColor()) &&
            this.getModel().equals(other.getModel()) &&
            this.getTransmission().equals(other.getTransmission()) &&
            this.getPower() == other.getPower() &&
            this.getEngine() == other.getEngine()
        );
    }
}

class CarComparatorByBrand implements Comparator<Car> {
    public int compare(Car a, Car b) {
        return a.getBrand().compareTo(b.getBrand());
    }
}