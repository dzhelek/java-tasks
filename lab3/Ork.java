package lab3;

public class Ork extends Character {
    Ork(String name, String profession, int health, int power) {
        super(name, profession, health, power);
    }
    public void attack(Attackable target) {
        // high level damage, high level defense
        target.takeDamage(power);
    }

    public void defend(int damage) {
        takeDamage(damage);
    }

    Character createCharacter(String name, String profession) {
        return new Ork(name, profession, 150, 70);
    }
}
