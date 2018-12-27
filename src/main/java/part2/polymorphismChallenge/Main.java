package part2.polymorphismChallenge;

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }


    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }



    public String startEngine(){
        if(engine){
           return  "Its already started";
        } else {
            return "Engine starts";
        }
    }

    public String accelerate(){
        return "this car goes form 0 to 100 in 3 sec";
    }

    public String brake(){
        return "This car goesd from 100 to 0 in 2 sec";
    }
}

class Ferrari extends Car {
    public Ferrari() {
        super("Ferrari", 8);
    }

    @Override
    public String accelerate() {
        return "This car is as fast as lightning ";
    }
}

class Maluch extends Car {
    public Maluch() {
        super("Fiat 125p", 1);
    }

    @Override
    public String accelerate() {
        return "this car goes from 0 to 100 in one minute";
    }
}

class Reanult extends Car {

    public Reanult() {
        super("Kangoo", 2);
    }

    @Override
    public String accelerate() {
        return "this car goes from 0 to 100 in 15 sec";
    }
}

class someCar extends Car {
    public someCar() {
        super("some kind of car", 2);
    }
}

public class Main {

    public static void main(String[] args) {

        Car maluch  = new Maluch();
        Car car = new Car("ford", 2);
        Car ferrari = new Ferrari();
        Car renault = new Reanult();
        Car someCar = new someCar();


        System.out.println(someCar.getName());
        System.out.println(someCar.startEngine());
        System.out.println(someCar.accelerate());
        System.out.println(maluch.getName());
        System.out.println(maluch.accelerate());


    }




}
