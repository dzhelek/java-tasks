package lab2;

public class Student extends Person {
    private float grade;

    Student(String name, int age, float grade) {
        super(name, age);
        this.grade = grade;
    }

    public float getGrade() {
        return grade;
    }

    void introduce() {
        System.out.printf("%s, %d, %.2f\n", getName(), getAge(), getGrade());
    }

    public void printDetails() {
        System.out.printf(
            "This is object from class Student. name: %s; age: %d, grade: %.2f\n",
            getName(), getAge(), getGrade()
        );
    }
}
