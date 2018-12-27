package part1.inheritanceChallengePart1;

public class Car extends Vechicle {

    private String type;
    private int doors;

    public Car(int maxSpeed, int gears, String model, String producent, int engineCapacity, String type, int doors) {
        super(maxSpeed, gears, model, producent, engineCapacity);
        this.type = type;
        this.doors = doors;
    }


}
