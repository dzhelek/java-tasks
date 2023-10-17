package lab2;

class Person implements Printable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void introduce() {
        System.out.println(getName() + ", " + getAge());
    }

    public void printDetails() {
        System.out.printf("This is object from class Person. name: %s; age: %d\n", getName(), getAge());
    }
}