package section7.opps2.encapsulation.example;

public class Player {

    public String name;
    public int health;
    public String weapon;

    // Reduce number of lives remaining for the player
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
