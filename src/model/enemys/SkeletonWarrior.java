package model.enemys;

import model.Enemy;
import model.Player;

import java.util.Random;

public class SkeletonWarrior extends Enemy {
    public SkeletonWarrior() {
        super("Esqueleto Guerrero", "Un esqueleto animado con una espada oxidada.", 80, 2);
    }

    @Override
    public void attack(Player player) {
        Random random = new Random();
        boolean successfulAttack = random.nextBoolean();
        if(successfulAttack){
            int damage = random.nextInt(20) + 10;
            player.setHealth(player.getHealth() - damage);
            System.out.println(getNameEnemy() + " te golpeó con su espada y causó " + damage + " de daño.");
        }
    }
}
