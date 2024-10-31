package Lab6;

public class Olympiad {
    private String name;
    private Level level;
    private PrizePlace place;

    public Olympiad(String name, Level level, PrizePlace place) {
        this.name = name;
        this.level = level;
        this.place = place;
    }

    public PrizePlace getPlace() {
        return place;
    }

    public void setPlace(PrizePlace place) {
        this.place = place;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
