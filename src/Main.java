import interfaces.Room;
import model.Inventory;
import model.Item;
import model.Player;
import model.rooms.EmptyRoom;
import model.rooms.EnemyRoom;
import model.rooms.TreasureRoom;
import model.typeItems.Sword;
import model.typeItems.Torch;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Player player = new Player();

        Item antorcha = new Torch();
        Item espada = new Sword();
        Scanner sc = new Scanner(System.in);
        String answer = "";

        // Pruebas de ingreso de datos y clase player
        System.out.println("Bienvenido valiente humano.");
        System.out.print("Dime tu nombre: ");
        answer = sc.nextLine();
        player.setName(answer);
        System.out.println("Valiente humano asi que te llamas, " + player.getName());
        System.out.println("Desde ahora seras " + player.getName() + " el mata monstruos");
        System.out.println("Te asignare " + player.getHealth() + " de vida, para que recorras las habitaciones!");

        // Pruebas de la clase Item e inventario.
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



        // Prueba de salas aleatorias.
        int salaId = 1;
        Random random = new Random();
        int numeroRandom = random.nextInt(3);
        Room sala = null;

        while(true) {
            System.out.println("\nIntroduce un movimiento:");
            System.out.println("Derecha | Izquierda | Salir");
            String move = sc.nextLine().toLowerCase();

            if(move.equals("salir")) {
                System.out.println("Haz salido del juego.");
                break;
            }

           switch (numeroRandom) {
               case 0:
                   sala = new EmptyRoom(salaId);
                   break;
               case 1:
                   sala = new TreasureRoom(salaId);
                   break;
               case 2:
                   sala = new EnemyRoom(salaId);
                   break;
           }
            System.out.println("Avanzaste a la " + move + " y entraste a una sala nueva: ");
            sala.enter();
            salaId++;
        }


    // fin
    }
}