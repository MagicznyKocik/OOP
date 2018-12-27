package part2.encapsulationChallenge;

public class EncapsulationChallengeMain {

    public static void main(String[] args) {
        Printer printer1 = new Printer(50,true);
        Printer printer2 = new Printer(120,false);
        Printer printer3 = new Printer(-120,true);

        System.out.println(printer1.checkTonnerLevel());
        System.out.println(printer2.checkTonnerLevel());
        System.out.println(printer3.checkTonnerLevel());

        printer1.fillUpTonner();
        System.out.println(printer1.checkTonnerLevel());
        printer2.fillUpTonner();
        System.out.println(printer2.checkTonnerLevel());
        printer1.prinPages(5);


    }




}
