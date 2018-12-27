package part2.compositioChallenge;

public class Windows {

    private int numberOfWindows;
    private String material;
    private WindowDimensions dimensions;
    private int numberOfLayers;

    public Windows(int numberOfWindows, String material, WindowDimensions dimensions, int numberOfLayers) {
        this.numberOfWindows = numberOfWindows;
        this.material = material;
        this.dimensions = dimensions;
        this.numberOfLayers = numberOfLayers;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public String getMaterial() {
        return material;
    }

    public WindowDimensions getDimensions() {
        return dimensions;
    }

    public int getNumberOfLayers() {
        return numberOfLayers;
    }

    public void openAllWindows(){
        System.out.println("All " + numberOfWindows + " has been opened");
    }

    public void openWindow(int numberOfWindow){
        if(numberOfWindows >= numberOfWindow){
            System.out.println("Window nuber " + numberOfWindow + " has been opened");
        } else {
            System.out.println("There is no so many windows in this room");
        }
    }

    public void closeAllWindows(){
        System.out.println("All windows has been closed");
    }

}
