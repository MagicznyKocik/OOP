package part1.inheritanceChallengePart1;

public class Ferrari extends Car {

    private String prestige;

    public Ferrari(int maxSpeed, int gears, String model, int engineCapacity, String type, int doors, String prestige) {
        super(maxSpeed, gears, model, "Ferrari", engineCapacity, type, doors);
        this.prestige = prestige;
    }

    public String getPrestige() {
        return prestige;
    }

    public void setPrestige(String prestige) {
        this.prestige = prestige;
    }

    @Override
    public void changeGear(int gearChange) {
        setSpeed(getSpeed()+gearChange*20);
    }
}
