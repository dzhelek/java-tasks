package lab4;

import java.util.Date;

public class Penguin extends Bird{

    public Penguin(String name, Date bd, Sex s, AnimalType type) {
        super(name, bd, s, type);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("flying");
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
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
