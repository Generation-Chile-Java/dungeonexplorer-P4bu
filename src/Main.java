import interfaces.Room;
import model.Enemy;
import model.Inventory;
import model.Item;
import model.Player;
import model.enemys.Worm;
import model.rooms.EmptyRoom;
import model.rooms.EnemyRoom;
import model.rooms.TreasureRoom;
import model.typeItems.Sword;
import model.typeItems.Torch;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Player player = new Player();
    static Inventory inventory = new Inventory();
    static boolean gameOver = false;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Inicializar objetos
        Item antorcha = new Torch();
        Item espada = new Sword();

        // Configuración inicial del jugador
        System.out.println("Bienvenido valiente humano.");
        System.out.print("Dime tu nombre: ");
        String answer = sc.nextLine();
        player.setName(answer);
        System.out.println("Valiente humano, así que te llamas, " + player.getName());
        System.out.println("Desde ahora serás " + player.getName() + " el mata monstruos");
        System.out.println("Te asignaré " + player.getHealth() + " de vida, para que recorras las habitaciones!");

        // Añadir objetos al inventario
        System.out.println("Encontraste una Antorcha!");
        System.out.print("¿Quieres recogerla? (Si / No): ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("si")) {
            inventory.addObjectInventory(antorcha);
        } else {
            System.out.println("Haz ignorado " + antorcha.getNameObject());
        }

        System.out.println("Encontraste una Espada!");
        System.out.print("¿Quieres recogerla? (Si / No): ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("si")) {
            inventory.addObjectInventory(espada);
        } else {
            System.out.println("Haz ignorado " + espada.getNameObject());
        }

        // Mostrar detalles del inventario
        inventory.showDetail();

        // Comenzar el juego
        System.out.println("El juego ha comenzado...");
        while (!gameOver) {
            moverJugador();
        }

        System.out.println("¡Gracias por jugar!");
    }

    // Método para mover al jugador
    public static void moverJugador() {
        System.out.println("\n¿Qué quieres hacer ahora?");
        System.out.println("1. Moverte a la siguiente habitación");
        System.out.println("2. Ver inventario");
        System.out.println("3. Salir del juego");

        String action = sc.nextLine().toLowerCase();

        switch (action) {
            case "1":
                // Mover a la siguiente habitación
                System.out.println("Avanzaste a la siguiente habitación...");
                // Generar una nueva habitación
                Room nextRoom = generarHabitacion();
                // Dejar que el jugador entre en la nueva habitación
                nextRoom.enter();
                break;
            case "2":
                // Ver inventario
                inventory.showDetail();
                break;
            case "3":
                // Salir del juego
                System.out.println("Has decidido salir del juego.");
                // Cambia el estado del juego
                gameOver = true;
                break;
            default:
                System.out.println("Acción no válida.");
                break;
        }
    }

    // Método para generar habitaciones aleatorias
    public static Room generarHabitacion() {
        Random random = new Random();
        int roomId = random.nextInt(3);
        Room room = null;
        Enemy worm = new Worm();  // Enemigo para la sala de enemigo

        switch (roomId) {
            case 0:
                room = new EmptyRoom(roomId);
                break;
            case 1:
                room = new TreasureRoom(roomId, new Sword());
                break;
            case 2:
                room = new EnemyRoom(roomId, worm);
                System.out.println("¡Un enemigo aparece! Es un " + worm.getNameEnemy());
                startCombat(worm);
                break;
            default:
                break;
        }
        return room;
    }

    // Método para iniciar el combate
    public static void startCombat(Enemy enemy) {
        while (enemy.getHealthEnemy() > 0 && player.getHealth() > 0) {
            System.out.println("\nTu salud: " + player.getHealth() + " | Salud del enemigo: " + enemy.getHealthEnemy());
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Atacar al enemigo");
            System.out.println("2. Usar un objeto");
            System.out.println("3. Huir");

            String choice = sc.nextLine().toLowerCase();

            switch (choice) {
                case "1":
                    // El jugador ataca al enemigo
                    System.out.println("¡Atacas al enemigo!");
                    player.attackPlayer(enemy);  // Usamos attackPlayer de la clase Player
                    if (enemy.getHealthEnemy() <= 0) {
                        System.out.println("¡Has derrotado al enemigo!");
                        break;
                    }
                    // El enemigo ataca
                    enemy.attack(player);
                    break;

                case "2":
                    // El jugador usa un objeto
                    inventory.showDetail();
                    System.out.print("¿Qué objeto quieres usar? Escribe el nombre: ");
                    String itemName = sc.nextLine().toLowerCase();
                    for (Item item : inventory.getItems()) {
                        if (item.getNameObject().equalsIgnoreCase(itemName)) {
                            item.interact(inventory);
                            break;
                        }
                    }
                    break;

                case "3":
                    System.out.println("¡Has huido del combate!");
                    gameOver = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            if (player.getHealth() <= 0) {
                System.out.println("¡Has sido derrotado! Fin del juego.");
                gameOver = true;
                break;
            }
        }
    }
}
