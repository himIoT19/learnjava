package section7.opps2.encapsulation;

public class Main {

    public static void main(String[] args) {
        // No encapsulation use
        Player player = new Player();
        player.name = "Himu";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());

        // Encapsulation use
        EnhancedPlayer enPlayer = new EnhancedPlayer("Himu", 200, "Sword");
        System.out.println("Initial health is " + enPlayer.getHealth());
    }
}
