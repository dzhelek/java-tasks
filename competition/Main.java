package competition;

public class Main {
    public static void placeBet(Event ob, int competitorId, double bet) {
        for (Competitor c : ob.getLineup()) {
            if (c.id == competitorId) {
                double oldBetForWin = c.betForWin;
                c.betForWin += bet;
                c.oddsToWin -= c.betForWin / oldBetForWin;
                if (c.oddsToWin < 1.05) {
                    c.oddsToWin = 1.05;
                }
            }
        }
    }
    public static void main(String[] args) {
        Event basket = null, tennis = null, swimming = null, sing = null;
        
        try{
            basket = EventCreator.getEvent("BASKETBALL");
            tennis = EventCreator.getEvent("TABLETENNIS");
            swimming = EventCreator.getEvent("SWIMMING");
            sing = EventCreator.getEvent("SINGING");
        }
        catch (EventException e) {
            System.out.println(e.getMessage());
        }

        Competitor[] basketCompetitors = new Competitor[]{
            new Competitor(), new Competitor(), new Competitor()
        };
        Competitor[] tennisCompetitors = new Competitor[]{
            new Competitor(), new Competitor(), new Competitor()
        };
        Competitor[] swimmingCompetitors = new Competitor[]{
            new Competitor(), new Competitor(), new Competitor()
        };
        try {
            EventCreator.fillLineup(basket, basketCompetitors);
            EventCreator.fillLineup(tennis, tennisCompetitors);
            EventCreator.fillLineup(swimming, swimmingCompetitors);
            EventCreator.fillLineup(sing, swimmingCompetitors);
        }
        catch (EmptyLineupException e) {
            System.out.println(e.getMessage());
        }

    }
    
}
