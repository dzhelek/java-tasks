package cosmos;

public class Resource {
    double amount;
    double harvestRate;

    Resource(double amount, double harvestRate) {
        this.amount = amount;
        this.harvestRate = harvestRate;
    }

    void harvest() {
        setAmount(getAmount() + getHarvestRate());
    }
    
    void levelUp() {
        setHarvestRate(getHarvestRate()*2);
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getHarvestRate() {
        return this.harvestRate;
    }

    public void setHarvestRate(double harvestRate) {
        this.harvestRate = harvestRate;
    }

}
