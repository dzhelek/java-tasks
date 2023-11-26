package cosmos;

public class MetalMine extends BaseBuilding{

    public MetalMine(
        String name, int level, int constructionTime, double metalRequired, double crystalRequired,
        double gasRequired, double uraniumRequired
    ) {
        super(name, level, constructionTime, metalRequired, crystalRequired, gasRequired, uraniumRequired);
    }

    @Override
    void applyEffect() {
        throw new UnsupportedOperationException("Unimplemented method 'applyEffect'");
    }
    
}
