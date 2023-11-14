package cosmos;

import java.util.List;

public abstract class Planet extends OrbitableSpaceObject {
    Resource metal, gas, crystal, uranium;
    List<BaseBuilding> buildings;

    void build(BaseBuilding building) {
        buildings.add(building);
    }

    void harvestMetal() {
        metal.harvest();
    }

    void harvestGas() {
        gas.harvest();
    }

    void harvestCrystal() {
        crystal.harvest();
    }

    void harvestUranium() {
        uranium.harvest();
    }

    void printResources() {
        System.out.println(
            "\nmetal: " + metal + "\ngas: " + gas + "\ncrystal: " + crystal + "\nuranium: " + uranium + "\n"
        );
    }

    public double getMetal() {
        return this.metal.getAmount();
    }

    public void useMetal(double amount) {
        metal.setAmount(this.getMetal() - amount);
    }

    public double getGas() {
        return this.gas.getAmount();
    }

    public void useGas(double amount) {
        metal.setAmount(this.getGas() - amount);
    }

    public double getCrystal() {
        return this.crystal.getAmount();
    }

    public void useCrystal(double amount) {
        crystal.setAmount(this.getCrystal() - amount);
    }

    public double getUranium() {
        return this.uranium.getAmount();
    }

    public void useUranium(double amount) {
        uranium.setAmount(this.getUranium() - amount);
    }

}
