package lab8;

import java.util.Stack;

public class Train {
    Stack<String> wagons = new Stack<>();

    void addWagon(String wagon) {
        wagons.push(wagon);
    }

    void removeWagon() {
        wagons.pop();
    }

    public static void main(String[] args) {
        var myTrain = new Train();
        myTrain.addWagon("Вагон 1");
        myTrain.removeWagon(); // Премахва "Вагон 1"
    }
}
