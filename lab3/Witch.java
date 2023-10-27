package lab3;

public class Witch extends Character implements Healable{
    Witch(String name, String profession, int health, int power) {
        super(name, profession, health, power);
    }
    public void attack(Attackable target) {
        // mid level damage, mid level healing
        target.takeDamage(power);
    }

    public void defend(int damage) {

        heal(power);
        takeDamage(damage);
    }

    public void heal(int healing) {

        setHealth(getHealth() + healing);
    }

    Character createCharacter(String name, String profession) {
        return new Witch(name, profession, 100, 40);
    }
}