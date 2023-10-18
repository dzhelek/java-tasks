package javac3;

public class Task1 {
    public static void main(String[] args) {
        var c = new Company();
        c.setName("Telelink Business Services");
        c.setCreationDate("05.03.2017");
        c.setBulstat("1234567890");
        c.setBulstat("hhahaahahah");
        System.out.println(c.getName());
        System.out.println(c.getCreationDate());
        System.out.println(c.getBulstat());
        System.out.println();

        var y = new CompanySP();
        y.setName("Yoan ET");
        y.setCreationDate("18.10.2023");
        y.setBulstat("0123456789");
        y.setFirstCapital(1000);
        y.setOwner("Yoan Dzhelekarski");
        y.setCapital(10000);
        System.out.println(y.getName());
        System.out.println(y.getCreationDate());
        System.out.println(y.getBulstat());
        System.out.println(y.getOwner());
        System.out.println(y.getFirstCapital());
        System.out.println(y.getCapital());
        System.out.println(y.calculateProfit());
    }
}

class Company {
    private String name;
    private String creationDate;
    private String bulstat;

    String getName() {
        return name;
    }

    String getCreationDate() {
        return creationDate;
    }

    String getBulstat() {
        return bulstat;
    }

    void setName(String name) {
        this.name = name;
    }

    void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    void setBulstat(String bulstat) {
        if (bulstat.length() == 10)
            this.bulstat = bulstat;
    }
}

class CompanySP extends Company {
    private String owner;
    private double firstCapital;
    private double capital;

    String getOwner() {
        return owner;
    }

    double getFirstCapital() {
        return firstCapital;
    }

    double getCapital() {
        return capital;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    void setFirstCapital(double capital) {
        firstCapital = capital;
    }

    void setCapital(double capital) {
        this.capital = capital;
    }

    double calculateProfit() {
        return capital - firstCapital;
    }
}
