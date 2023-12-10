package lab8;

public class Computer {
    CPU cpu;
    RAM ram;
    Storage storage;

    public static class CPU {
        String brand;
        double frequency;

        CPU (String brand, double frequency) {
            this.brand = brand;
            this.frequency = frequency;
        }
    }

    public static class RAM {
        int size;

        RAM(int size) {
            this.size = size;
        }
    }

    public static class Storage {

        int size;

        Storage (int size) {
            this.size = size;
        }
    }

    void setCPU (CPU unit) {
        this.cpu = unit;
    }

    void setRAM (RAM unit) {
        this.ram = unit;
    }

    void setStorage (Storage unit) {
        this.storage = unit;
    }

    public static void main(String[] args) {
        var myComputer = new Computer();
        myComputer.setCPU(new Computer.CPU("Intel", 3.5));
        myComputer.setRAM(new Computer.RAM(16));
        myComputer.setStorage(new Computer.Storage(512));
    }
}
