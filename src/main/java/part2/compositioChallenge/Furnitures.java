package part2.compositioChallenge;

public class Furnitures {

    private Furnance furnance;
    private String table;
    private int numberOfBooks;
    private int numberOfShelves;

    public Furnitures(Furnance furnance, String table, int numberOfBooks, int numberOfShelves) {
        this.furnance = furnance;
        this.table = table;
        this.numberOfBooks = numberOfBooks;
        this.numberOfShelves = numberOfShelves;
    }

    public Furnance getFurnance() {
        return furnance;
    }

    public String getTable() {
        return table;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }
}
