import model.Inventory;
import model.Object;
import model.typeItems.Torch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Object antorcha = new Torch();
        Scanner sc = new Scanner(System.in);
        String answer = "";

        System.out.println("Encontraste una Antorcha. Respuestas: (Si) o (No)");
        answer = sc.nextLine();

        if(answer.equalsIgnoreCase("si")){
            inventory.addObjectInventory(antorcha);
        } else {
            System.out.println("Haz ignorado " + antorcha.getNameObject());
        }
        inventory.showDetail();

    }
}