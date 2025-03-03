import model.Inventory;
import model.Item;
import model.Player;
import model.typeItems.Sword;
import model.typeItems.Torch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Player player = new Player();

        Item antorcha = new Torch();
        Item espada = new Sword();
        Scanner sc = new Scanner(System.in);
        String answer = "";

        System.out.println("Bienvenido valiente humano.");
        System.out.print("Dime tu nombre: ");
        answer = sc.nextLine();
        player.setName(answer);
        System.out.println("Valiente humano asi que te llamas, " + player.getName());
        System.out.println("Desde ahora seras " + player.getName() + " el mata monstruos");
        System.out.println("Te asignare " + player.getHealth() + " de vida, para que recorras las habitaciones!");


        System.out.println("Encontraste una Antorcha!");
        System.out.print("Quieres recogerla: (Si) o (No) ");
        answer = sc.nextLine();
        if(answer.equalsIgnoreCase("si")){
            inventory.addObjectInventory(antorcha);
        } else {
            System.out.println("Haz ignorado " + antorcha.getNameObject());
        }

        System.out.println("Encontraste una Espada!");
        System.out.print("Quieres recogerla: (Si) o (No) ");
        answer = sc.nextLine();
        if(answer.equalsIgnoreCase("si")){
            inventory.addObjectInventory(espada);
        } else {
            System.out.println("Haz ignorado " + espada.getNameObject());
        }

        inventory.showDetail();


    }
}