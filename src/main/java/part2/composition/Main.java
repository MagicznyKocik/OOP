package part2.composition;

public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20,5);

        Case theCase = new Case("220B","Dell", "240", dimensions);


        Monitor monitor = new Monitor("GL2250", "BENQ", 20, new Resolution(2540, 1440) );

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);

        thePC.getMonitor().drawPixelAt(20,30,"red");
        thePC.getMotherboard().loadProgram("Windows 10");
        thePC.getTheCase().pressPowerButton();
    }
}
