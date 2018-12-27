package part1.inheritanceChallengePart1;

public class Vechicle {

    private int maxSpeed;
    private int gears;
    private String model;
    private String producent;
    private int engineCapacity;
    private int speed;

    public void moveForeward(){
        setSpeed(20);
        setGears(1);
    }

    public void changeGear(int gearChange){
        setSpeed(getSpeed()+gearChange*20);
        setGears(getGears()+gearChange);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Vechicle(int maxSpeed, int gears, String model, String producent, int engineCapacity) {
        this.maxSpeed = maxSpeed;
        this.gears = gears;
        this.model = model;
        this.producent = producent;
        this.engineCapacity = engineCapacity;
    }
}
