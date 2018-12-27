package part2.compositioChallenge;

public class Room {

    private Windows windows;
    private Furnitures furnitures;
    private Heaters heaters;
    private Animals animals;

    public Room(Windows windows, Furnitures furnitures, Heaters heaters, Animals animals) {
        this.windows = windows;
        this.furnitures = furnitures;
        this.heaters = heaters;
        this.animals = animals;
    }

    public Windows getWindows() {
        return windows;
    }

    private Furnitures getFurnitures() {
        return furnitures;
    }

    public Heaters getHeaters() {
        return heaters;
    }

    public Animals getAnimals() {
        return animals;
    }

    public void turnOFFHeaters(){
        heaters.setAreON(false);
    }

    public void setOnFireInFurnance(){
        furnitures.getFurnance().fireFurnance();
    }

}
