public class Животно {
    String вид;
    int възраст;

    public void издаваЗвук() {
        System.out.println("Някакъв звук...");
    }

    public static void main(String[] args) {
        Животно котка = new Животно();
        котка.вид = "Котка";
        котка.възраст = 3;
        котка.издаваЗвук(); // Извежда "Някакъв звук..."

        float num = 2.348f;
        System.out.format("тест %f", num);
        System.out.format("test %f", num);
    }
}
