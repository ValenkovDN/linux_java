import java.io.IOException;
import java.util.Scanner;

import static java.nio.file.Files.size;

/** Класс Game. Процес игры*/
public class Game {
    static User user = new User();
    static int n;
    static Slot_machine slot_machine = new Slot_machine();
    public static void list() {
        System.out.println("В аппарате находятся: ");
        slot_machine.addAtoy(new A_toy(1, "Мишка", 3))
                .addAtoy(new A_toy(2, "Кукла", 4))
                .addAtoy(new A_toy(3, "Машинка", 3))
                .addAtoy(new A_toy(4, "Лошадка", 2))
                .addAtoy(new A_toy(5, "Зайчик", 4));

        System.out.println(slot_machine.toString());
        user.setBalance(50);
        System.out.println(user.toString());
        Menu.menu();
        System.out.println("Выберите пункт меню: ");
    }

    public static void game() throws IOException {
        n = user.number();
        switch (n) {
            case 1:
                int a = Rand.rand(slot_machine.getSizeSlot_machine());
                System.out.println(slot_machine.getIndexSlot_machine(a));
                Log.writer(slot_machine.getSlot_machine(a));
                System.out.println("В аппарате находятся: ");
                System.out.println(slot_machine.toString());
                user.setBalance(user.getBalance() - 10);
                System.out.println(user.toString());
                Menu.menu();
                System.out.println("Выберите пункт меню: ");
                break;
            case 2:
                Log.reader();
                System.out.println("В аппарате находятся: ");
                System.out.println(slot_machine.toString());
                System.out.println(user.toString());
                Menu.menu();
                System.out.println("Выберите пункт меню: ");
                break;
            case 3:
                System.out.println(user.replenish());
                System.out.println("В аппарате находятся: ");
                System.out.println(slot_machine.toString());
                System.out.println(user.toString());
                Menu.menu();
                System.out.println("Выберите пункт меню: ");
                break;
            case 4:
                System.out.println("GameOver");
        }
    }
}
