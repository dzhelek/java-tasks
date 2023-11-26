package competition;

public class EventCreator {
    // private String eventType;

    public static Event getEvent(String competitionType) throws EventException{
        return switch (competitionType) {
            case "BASKETBALL" -> new BasketballMatch();
            case "SWIMMING" -> new SwimmingEvent();
            case "TABLETENNIS" -> new TableTennisTournament();
            default -> throw new EventException("no such event");
        };
    }

    public static void fillLineup(Event ob, Competitor[] lineup) throws EmptyLineupException {
        if (lineup == null || lineup.length == 0) {
            throw new EmptyLineupException("empty lineup");
        }

        if (ob instanceof SwimmingEvent se) {
            se.lineup = lineup;
            return;
        }

        if (ob instanceof BasketballMatch) {
            ((BasketballMatch)ob).lineup = lineup;
            return;
        }

        if (ob instanceof TableTennisTournament) {
            ((TableTennisTournament)ob).lineup = lineup;
            return;
        }
    }
}
