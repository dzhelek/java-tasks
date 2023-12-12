package lab4;

import java.util.Date;

public class Penguin extends Bird{

    public Penguin(String name, Date bd, Sex s, AnimalType type) {
        super(name, bd, s, type);
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }

    @Override
    public void sleep() {
        throw new UnsupportedOperationException("Unimplemented method 'sleep'");
    }

    @Override
    public void reproduce() {
        throw new UnsupportedOperationException("Unimplemented method 'reproduce'");
    }
    
}
