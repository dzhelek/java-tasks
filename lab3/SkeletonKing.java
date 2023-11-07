package lab3;

public class SkeletonKing extends Monster{
    SkeletonKing (String name, String type, int health, int power) {
        super(name, type, health, power);
    }
    void attack(Defendable target) {
        target.defend(power);
    }
}
