package competition;

public class BasketballMatch implements Event{
    private int mostPointsScored;
    protected Competitor[] lineup;

    public Competitor[] getLineup() {
        return lineup;
    }
}
