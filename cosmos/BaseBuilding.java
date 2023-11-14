package cosmos;

public abstract class BaseBuilding {
    String name;
    int level, constructionTime;
    double metalRequired, crystalRequired, gasRequired, uraniumRequired;

    void construct(Planet target){
        target.useMetal(metalRequired);
        target.useCrystal(crystalRequired);
        target.useGas(gasRequired);
        target.useUranium(uraniumRequired);
        target.build(this);
    }

    void upgrade() {

    }

    abstract void applyEffect();

    public BaseBuilding(
        String name, int level, int constructionTime,
        double metalRequired, double crystalRequired, double gasRequired, double uraniumRequired
    ) {
        this.name = name;
        this.level = level;
        this.constructionTime = constructionTime;
        this.metalRequired = metalRequired;
        this.crystalRequired = crystalRequired;
        this.gasRequired = gasRequired;
        this.uraniumRequired = uraniumRequired;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getConstructionTime() {
        return this.constructionTime;
    }

    public void setConstructionTime(int constructionTime) {
        this.constructionTime = constructionTime;
    }

    public double getMetalRequired() {
        return this.metalRequired;
    }

    public void setMetalRequired(double metalRequired) {
        this.metalRequired = metalRequired;
    }

    public double getCrystalRequired() {
        return this.crystalRequired;
    }

    public void setCrystalRequired(double crystalRequired) {
        this.crystalRequired = crystalRequired;
    }

    public double getGasRequired() {
        return this.gasRequired;
    }

    public void setGasRequired(double gasRequired) {
        this.gasRequired = gasRequired;
    }

    public double getUraniumRequired() {
        return this.uraniumRequired;
    }

    public void setUraniumRequired(double uraniumRequired) {
        this.uraniumRequired = uraniumRequired;
    }
}
