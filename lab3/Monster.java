package lab3;

public abstract class Monster implements Attackable {
    String name, type;
    int health, power;

    public Monster (String name, String type, int health, int power) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.power = power;
    }

    abstract void attack (Defendable target);

    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    String getName() {
        return name;
    }

    String getType() {
        return type;
    }

    int getHealth() {
        return health;
    }

    int getPower() {
        return power;
    }

    void setHealth(int health) {
        this.health = health;
    }

    void setPower(int power) {
        this.power = power;
    }
}
