package part2.compositioChallenge;

public class Furnance {

    private String type;
    private int size;

    public Furnance(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public void fireFurnance(){
        System.out.println("furnance is fired");
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }
}
