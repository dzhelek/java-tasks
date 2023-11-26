package lab4;

import java.util.Date;

public class Mammal extends Animal {

    public Mammal(String name, Date bd, Sex s, AnimalType type) {
        super(name, bd, s, type);
    }

    @Override
    public void move() {
        System.out.println("Mammal moving.");
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
