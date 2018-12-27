package OOPMasterChalllenge;

import java.util.Scanner;

public class Addition {

    private String name;
    private double price;

    public Addition(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static Addition choseAddition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose your addition: \n" +
                "1. chillli \n" +
                "2. extra cheese \n" +
                "3. letuce \n" +
                "4. extra burger \n" +
                "5. onion \n" +
                "6. pepperoni \n" +
                "0. non \n");

        int number = sc.nextInt();

        switch (number) {
            case 1:
                return new Addition("chilli", 2.3);
            case 2:
                return new Addition("extra cheese", 2);
            case 3:
                return new Addition("letuce", 1.4);
            case 4:
                return new Addition("extra burger" , 5);
            case 5:
                return new Addition("onion", 1);
            case 6:
                return new Addition("pepperoni", 4);
            default:
                return new Addition("none", 0);
        }


    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

