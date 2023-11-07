package lab3;

public class Butcher extends Monster {
    Butcher (String name, String type, int health, int power) {
        super(name, type, health, power);
    }
    void attack(Defendable target) {
        target.defend(power);
    }
}
