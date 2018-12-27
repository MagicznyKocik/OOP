package part1.inheritanceChallengePart1;

public class MainChallenge {

    public static void main(String[] args) {
        Ferrari niceCar = new Ferrari(200,0, "najlepiej", 4, "sport", 2, "high");
        niceCar.moveForeward();
        System.out.println("speed: " + niceCar.getSpeed()+ " gear: " + niceCar.getGears());
        niceCar.changeGear(4);
        System.out.println("speed: " + niceCar.getSpeed()+ " gear: " + niceCar.getGears());
        niceCar.changeGear(-2);
        System.out.println("speed: " + niceCar.getSpeed()+ " gear: " + niceCar.getGears());

        Car notNiceCar = new Car(100,0, "sedan","ford", 1, "jakis", 5);
        notNiceCar.moveForeward();
        System.out.println("speed: " + notNiceCar.getSpeed()+ " gear: " + notNiceCar.getGears());
        notNiceCar.changeGear(3);
        System.out.println("speed: " + notNiceCar.getSpeed()+ " gear: " + notNiceCar.getGears());
        notNiceCar.changeGear(-1);
        System.out.println("speed: " + notNiceCar.getSpeed()+ " gear: " + notNiceCar.getGears());
    }




}
