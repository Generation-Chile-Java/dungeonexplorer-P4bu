package model.enemys;

import model.Enemy;
import model.Player;

import java.util.Random;

public class Worm extends Enemy {
    public Worm() {
        super("Gusano con alas","Pequeño gusano con alas que vuela por la sala",50,1);
    }
    public void attack(Player player) {
        Random random = new Random();
        boolean successfulAttack = random.nextBoolean();
        if(successfulAttack) {
            int damage = random.nextInt(15) + 5;
            player.setHealth(player.getHealth() - damage);
            System.out.println( getNameEnemy() + " te a atacado y causo un daño " + damage);
            System.out.println("tu vida se a reducido " + player.getHealth());
        } else {
            System.out.println("Gusano Intento atacarte pero fallo");
            player.attackPlayer(this);
        }
    }
}
