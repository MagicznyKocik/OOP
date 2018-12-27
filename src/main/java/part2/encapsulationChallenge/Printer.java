package part2.encapsulationChallenge;

public class Printer {

    private int tonerLevel;
    private int numbOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel > 100){
            this.tonerLevel = 100;
        }else if(tonerLevel < 0) {
            this.tonerLevel = 0;
        }else this.tonerLevel = tonerLevel;
        this.numbOfPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void prinPages(int numberOfPagesToPrint){
        this.numbOfPagesPrinted += numberOfPagesToPrint;
        System.out.println(numberOfPagesToPrint + " pages has been printed.");
        System.out.println("Sum of printed pages is: " + numbOfPagesPrinted );
    }

    public void fillUpTonner(){
        if(tonerLevel < 100){
            tonerLevel = 100;
            System.out.println("Tonner has been filled up");
        } else System.out.println("Tonner is already full");
    }

    public int checkTonnerLevel() {
        return this.tonerLevel;
    }
}
