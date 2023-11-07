package lab4;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal();
        Date d = new Date();
        Mammal m = new Mammal("Ivan", d, Sex.MALE, AnimalType.LION);
        m.move();

        Penguin f = new Penguin("Krisi", d, Sex.FEMALE, AnimalType.PENGUIN);
        if (f instanceof Flyable)
            ((Flyable)f).fly();
        else
            f.move();
    }
}
