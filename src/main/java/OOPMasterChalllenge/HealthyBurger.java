package OOPMasterChalllenge;

public class HealthyBurger extends Hamburger {

    private Addition addition5;
    private Addition addition6;

    public HealthyBurger() {
        super("dark rice beread", 12);
        System.out.println("addition 5");
        this.addition5 = Addition.choseAddition();
        System.out.println("addition 6");
        this.addition6 = Addition.choseAddition();
    }


    @Override
    public double setPrice() {
        double sum = super.setPrice() + addition5.getPrice() + addition6.getPrice();
        return sum;
    }

    @Override
    public void getPrice() {
        super.getPrice();
        System.out.println( "5. " + addition5.getName() + " which price is " + addition5.getPrice() + "\n"
        +  "6. " + addition6.getName() + " which price is " + addition6.getPrice() + "\n");
    }

    @Override
    public void getTotalPrice() {
        System.out.println( "your total price is " + setPrice());
    }
}
