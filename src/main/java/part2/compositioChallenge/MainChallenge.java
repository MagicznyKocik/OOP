package part2.compositioChallenge;

public class MainChallenge {

    public static void main(String[] args) {
        WindowDimensions dimensions =  new WindowDimensions(245,231,20);
        Windows windows =  new Windows(3, "PCV", dimensions, 3);
        Furnance furnance = new Furnance("gas", 3);
        Furnitures furnitures = new Furnitures(furnance,"Big wooden", 54, 7);
        Heaters heaters = new Heaters("steel",4,true);
        Animals animals = new Animals("Spider", "Xena");
        Room room =  new Room(windows,furnitures,heaters,animals);

        room.setOnFireInFurnance();
        room.getHeaters().setAreON(true);
    }

}
