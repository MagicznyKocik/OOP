package part2.encapsuilation;

public class EnchancedPlayer {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnchancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int dmg){
        this.hitPoints -= dmg;
        if(this.hitPoints <= 0){
            System.out.println("Player knocked out");
            // reduce number of lives remaining for the player
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return hitPoints;
    }

    public void setHealth(int health) {
        this.hitPoints = health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
