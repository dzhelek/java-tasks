package lab3;

public class Human extends Character implements Healable{
    Human(String name, String profession, int health, int power) {
        super(name, profession, health, power);
    }
    public void attack(Attackable target) {
        // mid level damage, high level heal
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
        return new Human(name, profession, 110, 40);
    }
}
