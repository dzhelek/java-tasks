package lab3;

public class Dwarf extends Character implements Healable{
    Dwarf(String name, String profession, int health, int power) {
        super(name, profession, health, power);
    }
    public void attack(Attackable target) {
        // low level damage, low level healing
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
        return new Dwarf(name, profession, 90, 30);
    }
}