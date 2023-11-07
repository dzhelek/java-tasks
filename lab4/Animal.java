package lab4;
import java.util.Date;

public abstract class Animal {
    private String name;
    private Date birthDate;
    private Sex sex;
    private AnimalType type;
    private double weight;

    public Animal(String name, Date bd, Sex s, AnimalType type) {
        this.name = name;
        this.birthDate = bd;
        this.sex = s;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public Sex getSex() {
        return this.sex;
    }

    public AnimalType getType() {
        return this.type;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void move();
    public abstract void eat();
    public abstract void sleep();
    public abstract void reproduce();
}