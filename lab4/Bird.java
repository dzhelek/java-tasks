package lab4;

import java.util.Date;

public abstract class Bird extends Animal implements Flyable{

    public Bird(String name, Date bd, Sex s, AnimalType type) {
        super(name, bd, s, type);
    }
    
}
