package competition;

public class SwimmingEvent implements Event{
    private double fastestLap;
    protected Competitor[] lineup;

    public Competitor[] getLineup() {
        return lineup;
    }
}
