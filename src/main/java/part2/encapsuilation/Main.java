package part2.encapsuilation;

public class Main {

    public static void main(String[] args) {

        // bad way do do this

        //        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int dmg = 10;
//        player.loseHealth(dmg);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        dmg = 11;
//        player.loseHealth(dmg);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.health = 100;
//        player.loseHealth(dmg);
//        System.out.println("Remaining health = " + player.healthRemaining());
        EnchancedPlayer enchancedPlayer = new EnchancedPlayer("Tim", 50, "Sword");
        System.out.println("Initial health is " + enchancedPlayer.getHealth());

        enchancedPlayer.loseHealth(20);
        System.out.println("Current health " + enchancedPlayer.getHealth());



    }


}
