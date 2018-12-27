package OOPMasterChalllenge;

import java.math.BigDecimal;

import static java.lang.Math.round;
import static jdk.nashorn.internal.objects.NativeMath.round;

class Hamburger {

    private String bread;
    private String meat;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;
    private double basePrice;
    public double price;

    public Hamburger() {
        this.basePrice = 10;
        this.bread = "roll";
        this.meat = "beef & pork";
        System.out.println("addition 1");
        this.addition1 = Addition.choseAddition();
        System.out.println("addition 2");
        this.addition2 = Addition.choseAddition();
        System.out.println("addition 3");
        this.addition3 = Addition.choseAddition();
        System.out.println("addition 4");
        this.addition4 = Addition.choseAddition();
        setPrice();


    }

    public Hamburger(String bread, double basePrice) {
        this.bread = bread;
        this.basePrice = basePrice;
        this.meat = "beef & pork";
        System.out.println("addition 1");
        this.addition1 = Addition.choseAddition();
        System.out.println("addition 2");
        this.addition2 = Addition.choseAddition();
        System.out.println("addition 3");
        this.addition3 = Addition.choseAddition();
        System.out.println("addition 4");
        this.addition4 = Addition.choseAddition();


    }

    public double setPrice() {
        this.price = basePrice +  addition1.getPrice() + addition2.getPrice() + addition3.getPrice() + addition4.getPrice();
        return price;
    }

    public void getPrice() {
        System.out.println("Your base burger is " + this.basePrice + "\n" +
                "You heave choosen that additions \n" +
                "1. " + addition1.getName() + " which price is " + addition1.getPrice() + "\n"+
                "2. " + addition2.getName() + " which price is " + addition2.getPrice() + "\n"+
                "3. " + addition3.getName() + " which price is " + addition3.getPrice() + "\n"+
                "4. " + addition4.getName() + " which price is " + addition4.getPrice() + "\n");
    }

    public void getTotalPrice(){
        System.out.println("Your total price is " + this.price);
    }

}



