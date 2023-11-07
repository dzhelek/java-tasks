package lab3;

public abstract class Character implements Attackable, Defendable {
    String name, profession;
    int health, power;

    Character(String name, String profession, int health, int power) {
        this.name = name;
        this.profession = profession;
        this.health = health;
        this.power = power;
    }

    public abstract void attack(Attackable target);
    public abstract void defend(int damage);
    abstract Character createCharacter(String name, String profession);

    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    String getName() {
        return name;
    }

    String getProfession() {
        return profession;
    }

    int getHealth() {
        return health;
    }

    int getPower() {
        return power;
    }

    void setName(String name) {
        this.name = name;
    }

    void setProfession(String profession) {
        this.profession = profession;
    }

    void setHealth(int health) {
        this.health = health;
    }

    void setPower(int power) {
        this.power = power;
    }
}
