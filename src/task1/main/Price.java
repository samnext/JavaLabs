package task1.main;

public class Price {
    private int rubles;
    private int pennies;

    public Price(int rubles, int pennies) {
        if (rubles < 0 || pennies < 0 || pennies > 99)
            throw new IllegalArgumentException("Rubles must be above 0 and pennies [0-99]");
        this.rubles = rubles;
        this.pennies = pennies;
    }

    public int getRoubles() {
        return rubles;
    }

    public int getPennies() {
        return pennies;
    }

    public void changePrice(int rubles, int pennies) {
        this.rubles = rubles;
        this.pennies = pennies;
    }

}
