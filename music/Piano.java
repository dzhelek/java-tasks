package music;

public class Piano extends MusicalInstrument implements Playable {
    public Piano(String name, String brand, double price) {
        super(name, brand, price);
    }

    @Override 
    public void play() {
        System.out.println("Playing the piano!");
    }
}