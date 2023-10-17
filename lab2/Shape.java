package lab2;

public abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    int r;

    Circle(int radius) {
        r = radius;
    }

    double area() {
        return Math.PI * r * r;
    }

    double perimeter() {
        return 2 * Math.PI * r;
    }
}

class Rectangle extends Shape {
    int x, y;

    Rectangle(int side1, int side2) {
        x = side1;
        y = side2;
    }
    
    double area() {
        return x*y;
    }

    double perimeter() {
        return 2 * (x + y);
    }
}
