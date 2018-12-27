package OOPMasterChalllenge;


public class Main {

    public static void main(String[] args) {
        Hamburger burger = new Hamburger();
        burger.getPrice();
        burger.getTotalPrice();
        System.out.println("-------------------------------------");

        Hamburger healthyburger = new HealthyBurger();
        healthyburger.getPrice();
        healthyburger.getTotalPrice();

    }

}
