package lab4;

import java.util.Date;

public class Mammal extends Animal {

    public Mammal(String name, Date bd, Sex s, AnimalType type) {
        super(name, bd, s, type);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void move() {
        System.out.println("Mammal moving.");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sleep'");
    }

    @Override
    public void reproduce() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reproduce'");
    }
    
}
