package lab3;

public class Elf extends Character implements Healable{
    Elf(String name, String profession, int health, int power) {
        super(name, profession, health, power);
    }
    public void attack(Attackable target) {
        // mid-high level damage, low level heal
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
        return new Elf(name, profession, 120, 60);
    }
}
