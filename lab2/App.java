package lab2;

public class App {
    public static void main(String[] args) {
        // task1
        var p = new Person("Yoan Dzhelekarski", 20);
        p.introduce();

        // task2
        var s = new Student("Stefi", 20, 5.90f);
        s.introduce();

        // task3
        p.printDetails();
        s.printDetails();

        // task4
        var rect = new Rectangle(10, 20);
        var circ = new Circle(5);
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
        System.out.println(circ.area());
        System.out.println(circ.perimeter());

        // task5
        var car = new Car("BMW", 10);
        car.refuel(50);
        car.accelerate(10);
        car.drive(30);
        car.accelerate(-10);

        // task6
        var eCar = new ElectricCar("BMW", 3);
        eCar.charge(200);
        eCar.driveElectric(20);

        // task7
        var cars = new Car[3];
        cars[0] = car;
        cars[1] = eCar;
        cars[2] = new Car("Porshe", 15);

        for (Car c : cars) {
            if (c instanceof ElectricCar) {
                ((ElectricCar)c).driveElectric(50);
            }
            else {
                c.drive(50);
            }
            System.out.println(c.brand + ": " + c.mileage);
        }
    }
}
