import java.util.ArrayList;
import java.util.List;

/** Класс игровой автомат*/
public class Slot_machine<a> {

    /** Список игрушек*/
    private List <A_toy> slot_machine = new ArrayList<>();

    /** Конструктор класса игровой автомат*/
    public Slot_machine addAtoy (A_toy toy) {
        slot_machine.add(toy);
        return this;
    }

    /** Выводит размер списка*/
    public int getSizeSlot_machine() {
        return slot_machine.size();
    }

    /** Выводит информацию о результате розыграша игрушки*/
    public String getIndexSlot_machine(int a) {
        if(slot_machine.get(a).setQuantity(slot_machine.get(a).getQuantity()) != 0){
            slot_machine.get(a).setQuantity(slot_machine.get(a).getQuantity()-1);
            System.out.println("Вы выиграли: " + slot_machine.get(a).getTitle());
        }
        else System.out.println("Игрушек " + slot_machine.get(a).getTitle() + " нет в автомате.");
        return " ";
    }

    /** Выводит название игрушки из текущего элемента списка*/
    public String getSlot_machine(int a){
        return  slot_machine.get(a).getTitle();
    }

    /** Отформатированный вывод списка игруек*/
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (A_toy item : slot_machine) {
            res.append(item);
            res.append("\n");
        }
        return res.toString();
    }
}
