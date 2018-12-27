package part2.compositioChallenge;

public class Heaters {

    private String type;
    private int size;
    private boolean areON;

    public Heaters(String type, int size, boolean areON) {
        this.type = type;
        this.size = size;
        this.areON = areON;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public boolean isAreON() {
        return areON;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setAreON(boolean areON) {
        this.areON = areON;
        System.out.println("heateres are turned on");
    }
}
