package part2.composition;

public class Motherboard {

    private String model;
    private String manufactrurer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufactrurer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufactrurer = manufactrurer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading ...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufactrurer() {
        return manufactrurer;
    }

    public void setManufactrurer(String manufactrurer) {
        this.manufactrurer = manufactrurer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
